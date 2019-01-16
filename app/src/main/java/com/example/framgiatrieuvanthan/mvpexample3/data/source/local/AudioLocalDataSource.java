package com.example.framgiatrieuvanthan.mvpexample3.data.source.local;

import com.example.framgiatrieuvanthan.mvpexample3.data.model.Audio;
import com.example.framgiatrieuvanthan.mvpexample3.data.source.AudioCallback;
import com.example.framgiatrieuvanthan.mvpexample3.data.source.AudioDataSource;
import com.example.framgiatrieuvanthan.mvpexample3.service.audio_home_screen.LoadAudioService;

import java.util.List;

public class AudioLocalDataSource implements AudioDataSource.LocalDataSource {
    @Override
    public void getListAudio(AudioCallback<List<Audio>> audioCallback) {
        //TODO write something here
        getLocalAudioSource(audioCallback);
    }

    private void getLocalAudioSource(AudioCallback<List<Audio>> audioCallback) {
        LoadAudioService loadAudioService;
        // load audio from service
    }
}
