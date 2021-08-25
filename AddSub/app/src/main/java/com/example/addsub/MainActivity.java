package com.example.addsub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double number=0.0;
    TextView textView;
    Button addBtn, subBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addBtn = findViewById(R.id.addBtnID);
        subBtn = findViewById(R.id.subBtnID);
        textView = findViewById(R.id.textViewID);


        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number=number+1;
                textView.setText(""+number);
            }
        });

        subBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number =  number-1;
                textView.setText(""+number);
            }
        });

    }
}
