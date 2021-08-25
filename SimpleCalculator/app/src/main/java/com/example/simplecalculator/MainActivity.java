package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button buttonAdd, buttonSub, buttonMul, buttonDiv, buttonClr;
    public TextView textView;
    public EditText editText1, editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAdd = findViewById(R.id.buttonIDadd);
        buttonSub = findViewById(R.id.buttonIDsub);
        buttonMul = findViewById(R.id.buttonIDmul);
        buttonDiv = findViewById(R.id.buttonIDdiv);
        buttonClr = findViewById(R.id.buttonIDclr);

        textView = findViewById(R.id.textViewID);

        editText1 = findViewById(R.id.editTextID1);
        editText2 = findViewById(R.id.editTextID2);


        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1, num2, result;
                String checknum1 = editText1.getText().toString();
                String checknum2 = editText2.getText().toString();
                if(checknum1.length() == 0 || checknum2.length() == 0)
                    Toast.makeText(getApplicationContext(),"Empty Field!",Toast.LENGTH_SHORT).show();
                else
                {
                    num1 = Integer.parseInt(editText1.getText().toString());
                    num2 = Integer.parseInt(editText2.getText().toString());
                    result = num1+num2;
                    textView.setText(String.valueOf(result));
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1, num2, result;
                String checknum1 = editText1.getText().toString();
                String checknum2 = editText2.getText().toString();
                if(checknum1.length() == 0 || checknum2.length() == 0)
                    Toast.makeText(getApplicationContext(),"Empty Field!",Toast.LENGTH_SHORT).show();
                else
                {
                    num1 = Integer.parseInt(editText1.getText().toString());
                    num2 = Integer.parseInt(editText2.getText().toString());
                    result = num1-num2;
                    textView.setText(String.valueOf(result));
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1, num2, result;
                String checknum1 = editText1.getText().toString();
                String checknum2 = editText2.getText().toString();
                if(checknum1.length() == 0 || checknum2.length() == 0)
                    Toast.makeText(getApplicationContext(),"Empty Field!",Toast.LENGTH_SHORT).show();
                else
                {
                    num1 = Integer.parseInt(editText1.getText().toString());
                    num2 = Integer.parseInt(editText2.getText().toString());
                    result = num1*num2;
                    textView.setText(String.valueOf(result));
                }
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1, num2, result;
                String checknum1 = editText1.getText().toString();
                String checknum2 = editText2.getText().toString();
                if(checknum1.length() == 0 || checknum2.length() == 0)
                    Toast.makeText(getApplicationContext(),"Empty Field!",Toast.LENGTH_SHORT).show();
                else
                {
                    num1 = Integer.parseInt(editText1.getText().toString());
                    num2 = Integer.parseInt(editText2.getText().toString());
                    if (num2 == 0)
                        Toast.makeText(getApplicationContext(),"Something divided by zero is infinity!",Toast.LENGTH_SHORT).show();
                    else {
                        result = num1/num2;
                        textView.setText(String.valueOf(result));
                    }
                }
            }
        });

        buttonClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editText1.setText(null);
                editText2.setText(null);
                textView.setText(null);
                Toast.makeText(getApplicationContext(),"Cleared",Toast.LENGTH_SHORT).show();
            }
        });



    }
}
