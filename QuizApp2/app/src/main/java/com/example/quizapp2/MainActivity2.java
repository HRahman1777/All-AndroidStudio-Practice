package com.example.quizapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    public  int newnumber;
    public RadioGroup mynewRadioGroup;
    public RadioButton mynewRadioButton;
    public static final String resultNumber = "From Second Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent mygetIntent = getIntent();
        newnumber = mygetIntent.getIntExtra(MainActivity.Extranumber, 0);
        mynewRadioGroup = findViewById(R.id.SecondradioGroupID);
    }

    public void question2Function(View view) {
        int totalnumber = 0;
        int radioid = mynewRadioGroup.getCheckedRadioButtonId();
        mynewRadioButton = findViewById(radioid);
        String Text = mynewRadioButton.getText().toString();
        if(Text.equals("Google")){

            totalnumber = newnumber+5;
        }
        else{
            totalnumber = newnumber;
        }
        Toast.makeText(this, "Total Number"+totalnumber, Toast.LENGTH_SHORT).show();
        //Intent myResultIntent = new Intent(this,MainActivity3.class);
        //myResultIntent.putExtra(resultNumber,totalnumber);
        //startActivity(myResultIntent);


    }
}
