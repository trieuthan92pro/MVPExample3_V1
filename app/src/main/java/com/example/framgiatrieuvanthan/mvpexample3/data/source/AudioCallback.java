package com.example.framgiatrieuvanthan.mvpexample3.data.source;

public interface AudioCallback<T> {
    void getDataSuccess(T data);
    void getDataFailure(String errorMessage);
}
