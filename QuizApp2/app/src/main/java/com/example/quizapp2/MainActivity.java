package com.example.quizapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public RadioGroup myRadioGroup;
    public RadioButton myRadioButton;
    public int num = 0;
    public static final String Extranumber = "From First Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myRadioGroup = findViewById(R.id.FirstradioGroupID);
    }

    public void question1Function(View view) {

        int radio = myRadioGroup.getCheckedRadioButtonId();
        myRadioButton = findViewById(radio);
        String Text = myRadioButton.getText().toString();
        if(Text.equals("Cox's Bazar ")){
            num = 5;
        }
        Intent myIntent = new Intent(this, MainActivity2.class);
        myIntent.putExtra(Extranumber,num);
        startActivity(myIntent);


    }
}
