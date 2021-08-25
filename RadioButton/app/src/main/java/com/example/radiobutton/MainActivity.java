package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public RadioButton radioButton1, radioButton2;
    public TextView textView1, textView2;
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.answerBtn);
        radioButton1 = findViewById(R.id.firstAnswer);
        radioButton2 = findViewById(R.id.secondAnswer);
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);

        Intent intent = getIntent();
        String str = intent.getStringExtra(Home.stringKey);
        Toast.makeText(getApplicationContext(),"We get from Home activity: "+str,Toast.LENGTH_LONG).show();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (radioButton1.isChecked()) {
                    textView1.setTextColor(Color.parseColor("#00ff00"));
                    textView1.setText("Correct !");
                }
                else {
                    textView1.setTextColor(Color.parseColor("#ff0000"));
                    textView1.setText("Wrong !");
                }

                if (radioButton2.isChecked()) {
                    textView2.setTextColor(Color.parseColor("#00ff00"));
                    textView2.setText("Correct !");
                }
                else {
                    textView2.setTextColor(Color.parseColor("#ff0000"));
                    textView2.setText("Wrong !");
                }
            }
        });
    }
}
