package com.abisayuti.calculator_mvp.Calculator.View;

import com.abisayuti.calculator_mvp.Base.BaseView;

public interface CalculatorView extends BaseView {

    void onError(String msg);
    void onSucces(String result);


}
