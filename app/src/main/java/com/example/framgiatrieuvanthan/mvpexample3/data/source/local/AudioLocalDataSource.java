package com.example.framgiatrieuvanthan.mvpexample3.data.source.local;

import com.example.framgiatrieuvanthan.mvpexample3.data.model.Audio;
import com.example.framgiatrieuvanthan.mvpexample3.data.source.AudioCallback;
import com.example.framgiatrieuvanthan.mvpexample3.data.source.AudioDataSource;

import java.util.List;

public class AudioLocalDataSource implements AudioDataSource.LocalDataSource {
    @Override
    public void getListAudio(AudioCallback<List<Audio>> audioCallback) {
        //TODO write something here
        getLocalAudioSource(audioCallback);
    }

    private void getLocalAudioSource(AudioCallback<List<Audio>> audioCallback) {
        // load audio from service
    }
}
