package com.example.framgiatrieuvanthan.mvpexample3.screen.audio_home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.example.framgiatrieuvanthan.mvpexample3.R;
import com.example.framgiatrieuvanthan.mvpexample3.data.model.Audio;

import java.util.List;

// Useful Link: https://pspdfkit.com/blog/2016/restoring-state-in-android-mvp-architecture/
// Other: https://medium.com/@cervonefrancesco/model-view-presenter-android-guidelines-94970b430ddf
// One more things: https://android.jlelse.eu/architectural-guidelines-to-follow-for-mvp-pattern-in-android-2374848a0157


public class MainActivity extends AppCompatActivity
        implements MainActivityPresenter.View{
    private RecyclerView mRecyclerView;
    private MainActivityPresenter mPresenter;
    private List<Audio> audios;
    private AudioAdapter audioAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponent();
    }

    @Override
    public void showDetail() {

    }

    private void initComponent() {
        mRecyclerView = findViewById(R.id.recycler_view);
        audioAdapter = new AudioAdapter();
        mPresenter = new MainActivityPresenter(this);
    }
}
