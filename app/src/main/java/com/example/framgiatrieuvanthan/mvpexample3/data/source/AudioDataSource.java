package com.example.framgiatrieuvanthan.mvpexample3.data.source;

import com.example.framgiatrieuvanthan.mvpexample3.data.model.Audio;

import java.util.List;

public interface AudioDataSource {
    interface LocalDataSource {
        void getListAudio(AudioCallback<List<Audio>> audioCallback);
    }

    interface RemoteDataSource {

    }
}
