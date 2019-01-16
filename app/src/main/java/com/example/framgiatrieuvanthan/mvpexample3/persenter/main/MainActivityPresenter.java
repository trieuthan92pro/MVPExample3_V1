package com.example.framgiatrieuvanthan.mvpexample3.persenter.main;

import com.example.framgiatrieuvanthan.mvpexample3.model.Audio;
import com.example.framgiatrieuvanthan.mvpexample3.persenter.BaseView;

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

    public interface View extends BaseView{
        public void showDetail();
    }
}
