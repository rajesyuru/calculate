package com.rajes.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttonClear;
    private Button buttonDelete;
    private Button buttonEmpty;
    private Button buttonDivision;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button buttonMultiply;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button buttonMinus;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button buttonPlus;
    private Button buttonEmpty2;
    private Button button0;
    private Button buttonDecimal;
    private Button buttonEqual;

    private TextView Numbers;

    private long firstnumber = 0;
    private long secondnumber = 0;
    private long totalnumber = 0;
    private long[] twonumbers;

    private int zerostart = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonClear = findViewById(R.id.buttonClear);
        Button buttonDelete = findViewById(R.id.buttonDelete);
        final Button buttonEmpty = findViewById(R.id.buttonEmpty);
        Button buttonDivision = findViewById(R.id.buttonDivision);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button buttonMultiply = findViewById(R.id.buttonMultiply);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button buttonMinus = findViewById(R.id.buttonMinus);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button buttonPlus = findViewById(R.id.buttonPlus);
        final Button buttonEmpty2 = findViewById(R.id.buttonEmpty2);
        final Button button0 = findViewById(R.id.button0);
        Button buttonDecimal = findViewById(R.id.buttonDecimal);
        Button buttonEqual = findViewById(R.id.buttonEqual);

        Numbers = findViewById(R.id.Numbers);
        Numbers.setText(zerostart);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    private void clearscreen() {

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Numbers.setText(zerostart);

                twonumbers = new twonumbers[] {zerostart,zerostart};

            }
        });


    }

    private void results() {

        totalnumber = twonumbers[0] + twonumbers [1];
        Numbers.setText(totalnumber);

    }
}