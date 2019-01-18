package com.example.framgiatrieuvanthan.mvpexample3.asynctask;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.util.Log;

import com.example.framgiatrieuvanthan.mvpexample3.R;
import com.example.framgiatrieuvanthan.mvpexample3.data.model.Audio;

import java.util.ArrayList;
import java.util.List;

public class LoadingAudioAsyncTask extends AsyncTask<Void, Void, List<Audio>> {
    public static final int LOAD_AUDIO_DONE = 100;

    private Handler mHandler;
    private ContentResolver mContentResolver;
    private Resources resources;
    private List<Audio> list;

    public LoadingAudioAsyncTask( ContentResolver contentResolver, Resources resources, Handler handler){
        mHandler = handler;
        mContentResolver = contentResolver;
        this.resources = resources;
        list = new ArrayList<>();
    }

    @Override
    protected List<Audio> doInBackground(Void... voids) {
        list = findAllMedia();
        return list;
    }

    public List<Audio> findAllMedia() {
        String selection = MediaStore.Audio.Media.IS_MUSIC + " == 0";

        String[] projection = {
                MediaStore.Audio.Media._ID,     //0
                MediaStore.Audio.Media.ARTIST,  //1
                MediaStore.Audio.Media.TITLE,   //2
                MediaStore.Audio.Media.DATA,    //3
                MediaStore.Audio.Media.DISPLAY_NAME,//4
                MediaStore.Audio.Media.DURATION,//5
                MediaStore.Audio.Media.ALBUM,   //6
                MediaStore.Audio.Media.TRACK,    //7
        };

        Cursor cursor = mContentResolver.query(
                MediaStore.Audio.Media.EXTERNAL_CONTENT_URI,
                projection,
                selection,
                null,
                null);
        byte[] artImg = null;
        List<Audio> songs = new ArrayList<>();
        while (cursor.moveToNext()) {
            String album = cursor.getString(6);
            String title = cursor.getString(2);
            String duraion = cursor.getString(5);
            String data = cursor.getString(3);
            String artist = cursor.getString(1);
            int intDuration = Integer.parseInt(duraion);
            Bitmap bitmap = BitmapFactory.decodeResource(resources,
                        R.drawable.compact_disc);
            Audio song = new Audio(data, title, artist, album, intDuration, bitmap);
            if (title == null) {
                String[] songNames = data.split("/");
                int len = songNames.length;
                String name = songNames[len - 1];
                int nameLen = name.length();
                song.setTitle(name.substring(0, nameLen - 4));
            }

            songs.add(song);
            Log.e("SONG", cursor.getString(2));
        }
        cursor.close();
        return songs;
    }

    @Override
    protected void onPostExecute(List<Audio> audioList) {
        super.onPostExecute(audioList);
        Message message = new Message();
        message.what = LOAD_AUDIO_DONE;
        message.obj = list;
        Log.e("WHERE ARE U NOW?", "onPostExecute: Process go here" );
        mHandler.sendMessage(message);
    }

    private Uri getAlbumUri(Context mContext, String album_id){
        if(mContext!=null) {
            Uri sArtworkUri = Uri.parse("content://media/external/audio/albumart");
            Uri imageUri = Uri.withAppendedPath(sArtworkUri, String.valueOf(album_id));
            return imageUri;
        }
        return null;
    }
}
