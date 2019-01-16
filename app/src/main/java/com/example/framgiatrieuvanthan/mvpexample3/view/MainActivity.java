package com.example.framgiatrieuvanthan.mvpexample3.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.example.framgiatrieuvanthan.mvpexample3.R;
import com.example.framgiatrieuvanthan.mvpexample3.adapter.AudioAdapter;
import com.example.framgiatrieuvanthan.mvpexample3.model.Audio;
import com.example.framgiatrieuvanthan.mvpexample3.persenter.main.MainActivityPresenter;

import java.util.List;

public class MainActivity extends AppCompatActivity
        implements MainActivityPresenter.View{
    private RecyclerView mRecyclerView;
    private AudioAdapter adapter;
    private MainActivityPresenter mPresenter;
    private List<Audio> audios;


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
        adapter = new AudioAdapter();
        mPresenter = new MainActivityPresenter(this);
    }
}
