package com.example.calculatorapp_quiz2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Button buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonAbout, buttonAdd
            ,buttonEuqal, buttonClear;
    public TextView textView, textView2;
    public int number1, number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonOne = findViewById(R.id.oneID);
        buttonTwo = findViewById(R.id.twoID);
        buttonThree = findViewById(R.id.threeID);
        buttonFour = findViewById(R.id.fourID);
        buttonFive = findViewById(R.id.fiveID);
        buttonAdd = findViewById(R.id.addID);
        buttonAbout = findViewById(R.id.aboutID);
        buttonEuqal = findViewById(R.id.equalID);
        buttonClear = findViewById(R.id.clearID);

        textView = findViewById(R.id.textViewID);
        textView2 = findViewById(R.id.textView2ID);

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String preValue=textView.getText().toString();
                String buttonText = buttonOne.getText().toString();

                if(preValue.equals("0")){
                    textView.setText(""+buttonText);
                }else{
                    textView.setText(""+preValue+buttonText);
                }
            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String preValue=textView.getText().toString();
                String buttonText = buttonTwo.getText().toString();

                if(preValue.equals("0")){
                    textView.setText(""+buttonText);
                }else{
                    textView.setText(""+preValue+buttonText);
                }
            }
        });

        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String preValue=textView.getText().toString();
                String buttonText = buttonThree.getText().toString();

                if(preValue.equals("0")){
                    textView.setText(""+buttonText);
                }else{
                    textView.setText(""+preValue+buttonText);
                }
            }
        });


        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String preValue=textView.getText().toString();
                String buttonText = buttonFour.getText().toString();

                if(preValue.equals("0")){
                    textView.setText(""+buttonText);
                }else{
                    textView.setText(""+preValue+buttonText);
                }
            }
        });


        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String preValue=textView.getText().toString();
                String buttonText = buttonFive.getText().toString();

                if(preValue.equals("0")){
                    textView.setText(""+buttonText);
                }else{
                    textView.setText(""+preValue+buttonText);
                }
            }
        });


        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                number1 = Integer.parseInt(textView.getText().toString());
                textView2.setText(""+number1+"+");
                textView.setText("");
            }
        });


        buttonEuqal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result = 0;
                number2 = Integer.parseInt(textView.getText().toString());
                result=number1+number2;
                textView.setText(""+result);
                textView2.setText(""+number1+"+"+number2);
            }
        });



        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
                textView2.setText("");
            }
        });

        buttonAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent((MainActivity.this) , (About.class));
                startActivity(intent);
            }
        });



    }
}
