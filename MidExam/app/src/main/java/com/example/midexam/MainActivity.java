package com.example.midexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    public Button buttoncnt, buttonnext;
    public EditText editTextone, editTexttwo;
    public int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttoncnt = findViewById(R.id.buttonid);
        buttonnext = findViewById(R.id.buttonid2);
        editTextone = findViewById(R.id.editTextid);
        editTexttwo = findViewById(R.id.editTextid2);

        buttoncnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
            }
        });

        buttonnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String n = editTextone.getText().toString();
                String i = editTexttwo.getText().toString();
                Intent intent;
                intent = new Intent(MainActivity.this, NextActivity.class);
                intent.putExtra("name", n);
                intent.putExtra("id", i);
                intent.putExtra("count", count);
                startActivity(intent);
            }
        });

    }
}
