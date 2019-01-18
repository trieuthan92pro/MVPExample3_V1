package com.example.framgiatrieuvanthan.mvpexample3.data.source;

import android.support.annotation.NonNull;

import com.example.framgiatrieuvanthan.mvpexample3.data.model.Audio;

import java.util.List;

public interface AudioDataSource {
    interface LocalDataSource {
        void getListAudio(@NonNull AudioCallback<List<Audio>> audioCallback);
    }

    interface RemoteDataSource {

    }
}
