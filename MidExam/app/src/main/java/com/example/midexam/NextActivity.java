package com.example.midexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NextActivity extends AppCompatActivity {

    public Button buttonprocess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        buttonprocess = findViewById(R.id.buttonProId);


        buttonprocess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle extras = getIntent().getExtras();
                String name = extras.getString("name");
                String id = extras.getString("id");
                int count = extras.getInt("count");
                int reminder = count%7;

            }
        });

    }
}
