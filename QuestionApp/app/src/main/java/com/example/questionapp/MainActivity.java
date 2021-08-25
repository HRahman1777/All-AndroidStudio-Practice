package com.example.questionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public RadioButton radioButton1;
    public TextView textView1;
    public Button button, buttonNext;
    public String result;
    public static String passValue="pass";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.answerBtn);
        radioButton1 = findViewById(R.id.firstAnswer);
        textView1 = findViewById(R.id.textView1);
        buttonNext = findViewById(R.id.nextID1);
        result="0";

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radioButton1.isChecked()) {
                    textView1.setTextColor(Color.parseColor("#00ff00"));
                    textView1.setText("Correct !");
                    result="1";
                }
                else {
                    textView1.setTextColor(Color.parseColor("#ff0000"));
                    textView1.setText("Wrong !");
                    result="0";
                }
            }
        });

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent;
                intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(passValue, result);
                startActivity(intent);

            }
        });
    }
}
