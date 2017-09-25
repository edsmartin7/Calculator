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
    private String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void calculate(){

        final EditText input = (EditText) findViewById(R.id.user_input);

        Button addition = (Button) findViewById(R.id.add);
        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first = (String) input.getText();
                operand = addition.getText().toString();
                input.setText(null);
            }
        });

        final Button subtraction = (Button) findViewById(R.id.subtract);
        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first = (String) input.getText();
                operand = subtraction.getText().toString();
                input.setText(null);
            }
        });

        final Button multiplication = (Button) findViewById(R.id.multiply);
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first = (String) input.getText();
                operand = multiplication.getText().toString();
                input.setText(null);
            }
        });

        final Button division = (Button) findViewById(R.id.divide);
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first = (String) input.getText();
                operand = division.getText().toString();
                input.setText(null);
            }
        });

        Button enter = (Button) findViewById(R.id.enter);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                second = (String) input.getText();
                result = MathOperators.operate(first, result, second);
                input.setText(null);
            }
        });

        TextView answer = (TextView)findViewById(R.id.answer);
        answer.setText(result);

    }

}
