package com.abisayuti.calculator_mvp.Calculator.Presenter;

import android.content.Context;
import android.widget.Toast;

import com.abisayuti.calculator_mvp.Base.BasePresenter;
import com.abisayuti.calculator_mvp.Calculator.View.CalculatorView;

public class CalculatorPresenter implements BasePresenter<CalculatorView>  {


    CalculatorView calculatorView;
    private Object ActivityCalculator;


    public void ADDMethod(String bilangan1, String bilangan2){

        if (bilangan1.length() == 0 && bilangan2.length() ==0 ) {
            Toast.makeText((Context) ActivityCalculator, "", Toast.LENGTH_SHORT).show();
        }
        else if (bilangan1.length() == 0){
            Toast.makeText((Context) ActivityCalculator, "Bilangan 1 Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
            return;
        }
        else if (bilangan2.length() == 0 ){
            Toast.makeText((Context) ActivityCalculator, "Bilangan 2 Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
            return;
        }

        else {


            double BLG1 = Double.parseDouble(bilangan1);
            double BLG2 = Double.parseDouble(bilangan2);


            double hs = ADD(BLG1, BLG2);



            String output = String.valueOf(hs);
            calculatorView.onSucces(output);


        }



    }

    public void MINMethod(String bilangan1, String bilangan2){

        if (bilangan1.length() == 0 && bilangan2.length() ==0 ) {
            Toast.makeText((Context) ActivityCalculator, "", Toast.LENGTH_SHORT).show();
        }
        else if (bilangan1.length() == 0){
            Toast.makeText((Context) ActivityCalculator, "Bilangan 1 Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
            return;
        }
        else if (bilangan2.length() == 0 ){
            Toast.makeText((Context) ActivityCalculator, "Bilangan 2 Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
            return;
        }

        else {



            double BLG1 = Double.parseDouble(bilangan1);
            double BLG2 = Double.parseDouble(bilangan2);


            double hs = MIN(BLG1, BLG2);



            String output = String.valueOf(hs);
            calculatorView.onSucces(output);


        }

    }

    public void XMethod(String bilangan1, String bilangan2){


        if (bilangan1.length() == 0 && bilangan2.length() ==0 ) {
            Toast.makeText((Context) ActivityCalculator, "", Toast.LENGTH_SHORT).show();
        }
        else if (bilangan1.length() == 0){
            Toast.makeText((Context) ActivityCalculator, "Bilangan 1 Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
            return;
        }
        else if (bilangan2.length() == 0 ){
            Toast.makeText((Context) ActivityCalculator, "Bilangan 2 Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
            return;
        }

        else {



            double BLG1 = Double.parseDouble(bilangan1);
            double BLG2 = Double.parseDouble(bilangan2);


            double hs = X(BLG1, BLG2);



            String output = String.valueOf(hs);
            calculatorView.onSucces(output);


        }

    }

    public void DIVMethod(String bilangan1, String bilangan2){

        if (bilangan1.length() == 0 && bilangan2.length() ==0 ) {
            Toast.makeText((Context) ActivityCalculator, "", Toast.LENGTH_SHORT).show();
        }
        else if (bilangan1.length() == 0){
            Toast.makeText((Context) ActivityCalculator, "Bilangan 1 Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
            return;
        }
        else if (bilangan2.length() == 0 ){
            Toast.makeText((Context) ActivityCalculator, "Bilangan 2 Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
            return;
        }

        else {



            double BLG1 = Double.parseDouble(bilangan1);
            double BLG2 = Double.parseDouble(bilangan2);


            double hs = DIVIDE(BLG1, BLG2);



            String output = String.valueOf(hs);
            calculatorView.onSucces(output);


        }

    }



    @Override
    public void onAttachView(CalculatorView v) {
        calculatorView = v;
    }

    @Override
    public void onDettachView() {
        calculatorView = null;
    }



    // RUMUS
    public double ADD(double p, double l){
        return p+l;
    }

    public double MIN(double p, double l){
        return p-l;
    }
    public double X(double p, double l){
        return p*l;
    }
    public double DIVIDE(double p, double l){
        return p/l;
    }



}
