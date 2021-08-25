package com.example.questionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {

    public Button buttonHome;
    public TextView textViewResult;

    public String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        buttonHome = findViewById(R.id.homeBtnID);
        textViewResult = findViewById(R.id.resultTVID);

        Intent intent = getIntent();
        result = intent.getStringExtra(SecondActivity.passValue2);

        if(result.equals("1"))
            textViewResult.setText("5 out of 10");
        else if (result.equals("2"))
            textViewResult.setText("10 out of 10");
        else
            textViewResult.setText("0 out of 10");

        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent;
                intent = new Intent(ResultActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
