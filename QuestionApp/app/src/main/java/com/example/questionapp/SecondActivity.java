package com.example.questionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    public RadioButton radioButton2;
    public TextView textView2;
    public Button button, buttonNext2;
    public String result;

    public static String passValue2="pass";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button = findViewById(R.id.answerBtn);
        radioButton2 = findViewById(R.id.secondAnswer);
        textView2 = findViewById(R.id.textView2);

        buttonNext2 = findViewById(R.id.nextID2);

        Intent intent = getIntent();
        result = intent.getStringExtra(MainActivity.passValue);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (radioButton2.isChecked()) {
                    textView2.setTextColor(Color.parseColor("#00ff00"));
                    textView2.setText("Correct !");
                    if (result.equals("1"))
                        result = "2";
                    else
                        result = "1";
                }
                else {
                    textView2.setTextColor(Color.parseColor("#ff0000"));
                    textView2.setText("Wrong !");
                }
            }
        });

        buttonNext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent;
                intent = new Intent(SecondActivity.this, ResultActivity.class);
                intent.putExtra(passValue2, result);
                startActivity(intent);
            }
        });

    }
}
