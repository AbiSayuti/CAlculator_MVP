package com.abisayuti.calculator_mvp.Base;

public interface BasePresenter <T extends BaseView>{

    void onAttachView(T v);

    void onDettachView();
}
