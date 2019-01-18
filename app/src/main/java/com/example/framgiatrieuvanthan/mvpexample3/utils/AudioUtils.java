package com.example.framgiatrieuvanthan.mvpexample3.utils;

import android.provider.MediaStore;

public class AudioUtils {

    public static String[] PROJECTIONS = {
            MediaStore.Audio.Media._ID,     //0
            MediaStore.Audio.Media.ARTIST,  //1
            MediaStore.Audio.Media.TITLE,   //2
            MediaStore.Audio.Media.DATA,    //3
            MediaStore.Audio.Media.DISPLAY_NAME,//4
            MediaStore.Audio.Media.DURATION,//5
            MediaStore.Audio.Media.ALBUM,   //6
    };

}
