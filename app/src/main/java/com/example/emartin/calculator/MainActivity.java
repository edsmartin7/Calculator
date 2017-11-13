package com.example.emartin.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private double first;
    private double second;

    private Button addition;
    private Button subtraction;
    private Button multiplication;
    private Button division;
    private Button enter;
    private Button clear;
    private EditText input;
    private Button buttonOne, buttonTwo, buttonThree,
                   buttonFour, buttonFive, buttonSix,
                   buttonSeven, buttonEight, buttonNine,
                   buttonZero;

    boolean adding, subtracting, multiplying, dividing;

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
        buttonOne = (Button) findViewById(R.id.one);
        buttonTwo = (Button) findViewById(R.id.two);
        buttonThree = (Button) findViewById(R.id.three);
        buttonFour = (Button) findViewById(R.id.four);
        buttonFive = (Button) findViewById(R.id.five);
        buttonSix = (Button) findViewById(R.id.six);
        buttonSeven = (Button) findViewById(R.id.seven);
        buttonEight = (Button) findViewById(R.id.eight);
        buttonNine = (Button) findViewById(R.id.nine);
        buttonZero = (Button) findViewById(R.id.zero);

        //press the buttons
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"1");
            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"2");
            }
        });

        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"3");
            }
        });

        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"4");
            }
        });

        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"5");
            }
        });

        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"6");
            }
        });

        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"7");
            }
        });

        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"8");
            }
        });

        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"9");
            }
        });

        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"0");
            }
        });

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input == null){
                    input.setText("");
                }else {
                    first = Double.parseDouble(input.getText() + "");
                    adding = true;
                    input.setText(null);
                }
            }
        });

        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input == null){
                    input.setText("");
                }else {
                    first = Double.parseDouble(input.getText() + "");
                    subtracting = true;
                    input.setText(null);
                }
            }
        });

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input == null){
                    input.setText("");
                }else {
                    first = Double.parseDouble(input.getText() + "");
                    multiplying = true;
                    input.setText(null);
                }
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input == null){
                    input.setText("");
                }else {
                    first = Double.parseDouble(input.getText() + "");
                    dividing = true;
                    input.setText(null);
                }
            }
        });

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                second = Double.parseDouble(input.getText() + "");

                if (adding == true){

                    input.setText(first + second +"");
                    adding=false;
                }


                if (subtracting == true){
                    input.setText(first - second+"");
                    subtracting=false;
                }

                if (multiplying == true){
                    input.setText(first * second+"");
                    multiplying=false;
                }

                if (dividing == true){
                    input.setText(first / second+"");
                    dividing=false;
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText("");
            }
        });

    }

}
