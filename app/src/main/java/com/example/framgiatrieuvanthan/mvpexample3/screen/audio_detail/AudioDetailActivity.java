package com.example.framgiatrieuvanthan.mvpexample3.screen.audio_detail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.framgiatrieuvanthan.mvpexample3.R;

public class AudioDetailActivity extends AppCompatActivity
        implements AudioDetailActivityContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payer_detail);
    }

    @Override
    public void showStartAvatarAnimation() {

    }

    @Override
    public void showStopAvatarAnimation() {

    }

    @Override
    public void showError() {

    }

    @Override
    public void showTimeCounter() {

    }

    @Override
    public void showAudioTitle() {

    }

    @Override
    public void showAudioArtist() {

    }

    @Override
    public void showSeekBarUpdating() {

    }

    @Override
    public void showRepeatOne() {

    }

    @Override
    public void showRepeatAll() {

    }

    @Override
    public void showRepeatOff() {

    }

    @Override
    public void showMoreOption() {

    }

    @Override
    public void showPreferenceMarked() {

    }

    @Override
    public void showPauseButton() {

    }

    @Override
    public void showPlayButton() {

    }

    @Override
    public void setPresenter(AudioDetailActivityContract.Presenter presenter) {

    }
}
