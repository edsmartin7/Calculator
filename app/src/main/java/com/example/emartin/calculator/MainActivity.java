package com.example.emartin.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

//use expression builder library
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
    private EditText input;
    private TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        input = (EditText) findViewById(R.id.user_input);
        addition = (Button) findViewById(R.id.add);
        subtraction = (Button) findViewById(R.id.subtract);
        multiplication = (Button) findViewById(R.id.multiply);
        division = (Button) findViewById(R.id.divide);
        enter = (Button) findViewById(R.id.enter);
        clear = (Button) findViewById(R.id.clear);
        answer = (TextView)findViewById(R.id.answer);


        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first = input.getText().toString();
                operand = addition.getText().toString();
                input.setText(null);
            }
        });


        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first = input.getText().toString();
                operand = subtraction.getText().toString();
                input.setText(null);
            }
        });


        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first = input.getText().toString();
                operand = multiplication.getText().toString();
                input.setText(null);
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first = input.getText().toString();
                operand = division.getText().toString();
                input.setText(null);
            }
        });


        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                second = input.getText().toString();
                result = MathOperators.operate(first, operand, second);
                input.setText(null);
                calculate(view);
            }
        });


        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }

    private void calculate(View view) {
        //if number, add to stack
        //if char, add to stack
        //if enter, calculate stack
        //if clear, clear stack
        int addendOne = Integer.parseInt(first);
        int addendTwo = Integer.parseInt(second);

        switch (operand) {
            case "+":
                result = addendOne + addendTwo;
                break;
            case "-":
                result = addendOne - addendTwo;
                break;
            case "*":
                result = addendOne * addendTwo;
                break;
            case "/":
                result = addendOne / addendTwo;
                break;
            default:
                result = 0;
        }

        answer.setText(result);
    }

}
