package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button buttonAdd, buttonSub, buttonMul, buttonDiv, buttonClr, buttonBack, buttonOne, buttonTwo,
            buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven, buttonEight, buttonNine,
            buttonEqual, buttonDot;
    public TextView textView1, textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonAdd = findViewById(R.id.buttonIDadd);
        buttonSub = findViewById(R.id.buttonIDsub);
        buttonMul = findViewById(R.id.buttonIDmul);
        buttonDiv = findViewById(R.id.buttonIDdiv);
        buttonClr = findViewById(R.id.buttonIDclr);
        buttonBack = findViewById(R.id.buttonIDback);
        buttonOne = findViewById(R.id.buttonIDone);
        buttonTwo = findViewById(R.id.buttonIDtwo);
        buttonThree = findViewById(R.id.buttonIDthree);
        buttonFour = findViewById(R.id.buttonIDfour);
        buttonFive = findViewById(R.id.buttonIDfive);
        buttonSix = findViewById(R.id.buttonIDsix);
        buttonSeven = findViewById(R.id.buttonIDseven);
        buttonEight = findViewById(R.id.buttonIDeight);
        buttonNine = findViewById(R.id.buttonIDnine);
        buttonEqual = findViewById(R.id.buttonIDequ);
        buttonDot = findViewById(R.id.buttonIDdot);

        textView1 = findViewById(R.id.editTextID1);
        textView2 = findViewById(R.id.editTextID2);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (v.equals(buttonOne)) {
                    Toast.makeText(getApplicationContext(),"Hello Javatpoint",Toast.LENGTH_SHORT).show();
                }
                if(v.equals(buttonTwo)){
                    Toast.makeText(getApplicationContext(),"Hello Javatpoint",Toast.LENGTH_SHORT).show();
                }

            }
        };

    }
}
