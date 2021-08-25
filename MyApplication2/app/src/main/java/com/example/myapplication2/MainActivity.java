package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    public Button buttonOAdd, buttonOSub, buttonOMul, buttonODiv;
    public EditText editTextO1, editTextO2, editTextO3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonOAdd = findViewById(R.id.buttonAdd);
        buttonOSub = findViewById(R.id.buttonSub);
        buttonOMul = findViewById(R.id.buttonMul);
        buttonODiv = findViewById(R.id.buttonDiv);

        editTextO1 = findViewById(R.id.editText);
        editTextO2 = findViewById(R.id.editText2);
        editTextO3 = findViewById(R.id.editText3);

        buttonOAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float num1, num2, result;
                num1 = Integer.parseInt(editTextO1.getText().toString());
                num2 = Integer.parseInt(editTextO2.getText().toString());

                result = num1 + num2;
                editTextO3.setText(String.valueOf(result));
            }
        });

        buttonOSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float num1, num2, result;
                num1 = Integer.parseInt(editTextO1.getText().toString());
                num2 = Integer.parseInt(editTextO2.getText().toString());

                result = num1 - num2;
                editTextO3.setText(String.valueOf(result));
            }
        });


    }
}
