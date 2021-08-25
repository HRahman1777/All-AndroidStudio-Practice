package com.example.diu_pc_bfall2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button classRoutine, courseInfo, aboutt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.setTitle("Lobby");

        setContentView(R.layout.activity_main);
        classRoutine = findViewById(R.id.btnCR);
        courseInfo = findViewById(R.id.btnCI);
        aboutt = findViewById(R.id.btnAbout);
        classRoutine.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent((MainActivity.this) , (Routine.class));
                startActivity(intent);
            }
        });
        courseInfo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent((MainActivity.this) , (CourseInfo.class));
                startActivity(intent2);
            }
        });
        aboutt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent((MainActivity.this) , (About.class));
                startActivity(intent3);
            }
        });
    }
}
