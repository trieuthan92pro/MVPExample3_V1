package com.example.framgiatrieuvanthan.mvpexample3.data.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Audio implements Parcelable {
    private String data, title, artist, album;


    protected Audio(Parcel in) {
        data = in.readString();
        title = in.readString();
        artist = in.readString();
        album = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(data);
        dest.writeString(title);
        dest.writeString(artist);
        dest.writeString(album);
    }

    public static final Creator<Audio> CREATOR = new Creator<Audio>() {
        @Override
        public Audio createFromParcel(Parcel in) {
            return new Audio(in);
        }

        @Override
        public Audio[] newArray(int size) {
            return new Audio[size];
        }
    };

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public int describeContents() {
        return 0;
    }

}
