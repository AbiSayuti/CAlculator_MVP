package com.abisayuti.calculator_mvp.Calculator.Activity;

import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.abisayuti.calculator_mvp.Calculator.Presenter.CalculatorPresenter;
import com.abisayuti.calculator_mvp.Calculator.View.CalculatorView;
import com.abisayuti.calculator_mvp.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivityCalculator extends AppCompatActivity implements CalculatorView {

    @BindView(R.id.edtBilangan1)
    TextInputEditText edtBilangan1;
    @BindView(R.id.edtBilangan2)
    TextInputEditText edtBilangan2;
    @BindView(R.id.btnAdd)
    Button btnAdd;
    @BindView(R.id.btnMin)
    Button btnMin;
    @BindView(R.id.btnX)
    Button btnX;
    @BindView(R.id.btnBagi)
    Button btnBagi;
    @BindView(R.id.btnC)
    Button btnC;
    @BindView(R.id.txtHasil)
    TextView txtHasil;

    private CalculatorPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        ButterKnife.bind(this);

        presenter = new CalculatorPresenter();
        onAttachView();
    }



    @Override
    public void onError(String msg) {

    }

    @Override
    public void onSucces(String result) {
        txtHasil.setText(result);
    }


    @Override
    public void onAttachView() {
        presenter.onAttachView(this);
    }

    @Override
    public void onDettachView() {

    }

    @OnClick(R.id.btnAdd)
    public void onBtnAddClicked() {
        presenter.ADDMethod(edtBilangan1.getText().toString(), edtBilangan2.getText().toString());
    }

    @OnClick(R.id.btnMin)
    public void onBtnMinClicked() {
        presenter.MINMethod(edtBilangan1.getText().toString(), edtBilangan2.getText().toString());
    }

    @OnClick(R.id.btnX)
    public void onBtnXClicked() {
        presenter.XMethod(edtBilangan1.getText().toString(), edtBilangan2.getText().toString());
    }

    @OnClick(R.id.btnBagi)
    public void onBtnBagiClicked() {
        presenter.DIVMethod(edtBilangan1.getText().toString(), edtBilangan2.getText().toString());
    }

    @OnClick(R.id.btnC)
    public void onBtnCClicked() {
        edtBilangan1.setText(0);
        edtBilangan2.setText(0);
    }


}
