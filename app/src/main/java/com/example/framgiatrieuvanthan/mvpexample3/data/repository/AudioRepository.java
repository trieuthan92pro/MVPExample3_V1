package com.example.framgiatrieuvanthan.mvpexample3.data.repository;

import com.example.framgiatrieuvanthan.mvpexample3.data.model.Audio;
import com.example.framgiatrieuvanthan.mvpexample3.data.source.AudioCallback;
import com.example.framgiatrieuvanthan.mvpexample3.data.source.AudioDataSource;

import java.util.List;

public class AudioRepository implements AudioDataSource.LocalDataSource,
        AudioDataSource.RemoteDataSource{
    private AudioDataSource.LocalDataSource localDataSource;

    // initialization local data source
    public AudioRepository(AudioDataSource.LocalDataSource localDataSource) {
        this.localDataSource = localDataSource;
    }

    //then we call to interface method
    @Override
    public void getListAudio(AudioCallback<List<Audio>> audioCallback) {
        localDataSource.getListAudio(audioCallback);
    }
}
