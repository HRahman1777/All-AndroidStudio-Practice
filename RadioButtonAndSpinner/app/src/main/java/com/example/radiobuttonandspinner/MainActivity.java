package com.example.radiobuttonandspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    public Button submitButton;
    public RadioButton radioButton1, radioButton2, radioButton3;
    public String str, strDept;

    public Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submitButton = findViewById(R.id.submitBtnId);
        radioButton1 = findViewById(R.id.facuId);
        radioButton2 = findViewById(R.id.lectId);
        radioButton3 = findViewById(R.id.studentId);

        spinner = findViewById(R.id.spinnerID);
        ArrayAdapter<CharSequence>myArrayAdapter;
        myArrayAdapter = ArrayAdapter.createFromResource(this, R.array.department_options, android.R.layout.simple_spinner_item);
        spinner.setAdapter(myArrayAdapter);
        spinner.setOnItemSelectedListener(this);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (radioButton1.isChecked()) {
                    str="Correct Answer";
                }
                else if (radioButton2.isChecked()){
                    str="Wrong Answer";
                }
                else if (radioButton3.isChecked()){
                    str="Wrong Answer";
                }
                else {
                    str="Didn't chose!";
                }

                Toast.makeText(getApplicationContext(),"Result: "+str+"\nDepartment: "+strDept,Toast.LENGTH_SHORT).show();

            }
        });

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String selectedValue = parent.getItemAtPosition(position).toString();
        if (selectedValue.equals("CSE")){
            strDept = selectedValue;
        }
        else if (selectedValue.equals("EEE")){
            strDept = selectedValue;
        }
        else if (selectedValue.equals("BBA")){
            strDept = selectedValue;
        }
        else if (selectedValue.equals("ACT")){
            strDept = selectedValue;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        strDept = "Nothing Selected.";
    }
}
