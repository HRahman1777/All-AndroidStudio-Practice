package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Home extends AppCompatActivity {

    public EditText editText;
    public Button buttonClick;
    public static final String stringKey = "value1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        editText = findViewById(R.id.editTextID);
        buttonClick = findViewById(R.id.buttonID);

        buttonClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                Intent intent;
                intent = new Intent(Home.this, MainActivity.class);
                intent.putExtra(stringKey, text);
                startActivity(intent);
            }
        });
    }
}
