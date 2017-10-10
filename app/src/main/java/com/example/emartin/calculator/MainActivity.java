package com.example.emartin.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String first;
    private String second;
    private String operand;
    private int result;

    private Button addition;
    private Button subtraction;
    private Button multiplication;
    private Button division;
    private Button enter;
    private Button clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //calculate();

    }


    private void calculate(){

        final EditText input = (EditText) findViewById(R.id.user_input);

        addition = (Button) findViewById(R.id.add);
        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first = input.getText().toString();
                operand = addition.getText().toString();
                input.setText(null);
            }
        });

        subtraction = (Button) findViewById(R.id.subtract);
        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first = input.getText().toString();
                operand = subtraction.getText().toString();
                input.setText(null);
            }
        });

        multiplication = (Button) findViewById(R.id.multiply);
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first = input.getText().toString();
                operand = multiplication.getText().toString();
                input.setText(null);
            }
        });

        division = (Button) findViewById(R.id.divide);
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first = input.getText().toString();
                operand = division.getText().toString();
                input.setText(null);
            }
        });

        enter = (Button) findViewById(R.id.enter);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                second = input.getText().toString();
                result = MathOperators.operate(first, operand, second);
                input.setText(null);
            }
        });

        clear = (Button) findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        TextView answer = (TextView)findViewById(R.id.answer);
        answer.setText(result);

    }


}
