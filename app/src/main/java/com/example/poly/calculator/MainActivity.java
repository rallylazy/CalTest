package com.example.poly.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etNumberOne;
    private EditText etNumberTwo;
    private Button B1plus;
    private Button B2minus;
    private Button B3multiply;
    private Button B4divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNumberOne = findViewById(R.id.etNumberOne);
        etNumberTwo = findViewById(R.id.etNumberTwo);
        B1plus =findViewById(R.id.B1plus);
        B2minus =findViewById(R.id.B2minus);
        B3multiply =findViewById(R.id.B3multiply);
        B4divide =findViewById(R.id.B4divide);

        B1plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberOne = Integer.parseInt(etNumberOne.getText().toString());
                int numberTwo = Integer.parseInt(etNumberTwo.getText().toString());
                plus(numberOne, numberTwo);
                Toast.makeText(MainActivity.this,String.valueOf(plus(numberOne,numberTwo)),Toast.LENGTH_SHORT).show();
            }
        });

        B2minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberOne = Integer.parseInt(etNumberOne.getText().toString());
                int numberTwo = Integer.parseInt(etNumberTwo.getText().toString());
                minus(numberOne, numberTwo);
                Toast.makeText(MainActivity.this,String.valueOf(minus(numberOne,numberTwo)),Toast.LENGTH_SHORT).show();
            }
        });

        B3multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberOne = Integer.parseInt(etNumberOne.getText().toString());
                int numberTwo = Integer.parseInt(etNumberTwo.getText().toString());
                multiply(numberOne, numberTwo);
                Toast.makeText(MainActivity.this,String.valueOf(multiply(numberOne,numberTwo)),Toast.LENGTH_SHORT).show();
            }
        });

        B4divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numberOne = Integer.parseInt(etNumberOne.getText().toString());
                int numberTwo = Integer.parseInt(etNumberTwo.getText().toString());
                divide(numberOne, numberTwo);
                Toast.makeText(MainActivity.this,String.valueOf(divide(numberOne,numberTwo)),Toast.LENGTH_SHORT).show();
            }
        });
    }

    private int plus(int numberOne,int numberTwo){
        return numberOne + numberTwo;
    }

    private int minus(int numberOne,int numberTwo){
        return numberOne - numberTwo;
    }

    private int multiply(int numberOne,int numberTwo){
        return numberOne * numberTwo;
    }

    private int divide(int numberOne,int numberTwo){
        if (numberTwo == 0) {
            return 0;
        }else {
            return numberOne / numberTwo;
        }
    }
}
