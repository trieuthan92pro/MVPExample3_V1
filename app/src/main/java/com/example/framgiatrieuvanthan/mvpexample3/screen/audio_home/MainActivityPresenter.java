package com.example.framgiatrieuvanthan.mvpexample3.screen.audio_home;

import com.example.framgiatrieuvanthan.mvpexample3.data.model.Audio;

import java.util.ArrayList;
import java.util.List;

public class MainActivityPresenter {
    private List<Audio> listAudio;
    private View view;

    public MainActivityPresenter(View view){
        listAudio = new ArrayList<>();
        this.view = view;
    }

    public void readListAudio(){

    }

    public List<Audio> getListAudio() {
        return listAudio;
    }

    public void setListAudio(List<Audio> listAudio) {
        this.listAudio = listAudio;
    }

    public interface View {
        public void showDetail();
    }
}
