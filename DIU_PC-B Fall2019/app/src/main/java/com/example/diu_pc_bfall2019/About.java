package com.example.diu_pc_bfall2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class About extends AppCompatActivity {

    EditText textViewUpload;
    Button buttonHeading, buttonCourseInfo, buttonNotice, buttonSat, buttonSun, buttonMon, buttonTues, buttonWed, buttonThurs;

    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        this.setTitle("Your Triggers");

        textViewUpload = findViewById(R.id.updateTextViewId);
        buttonHeading = findViewById(R.id.headingUPdBtn);
        buttonCourseInfo = findViewById(R.id.courseUPdBtn);
        buttonNotice  = findViewById(R.id.noticeUPdBtn);
        buttonSat = findViewById(R.id.satUPdBtn);
        buttonSun = findViewById(R.id.sunUPdBtn);
        buttonMon = findViewById(R.id.monUPdBtn);
        buttonTues = findViewById(R.id.tueUPdBtn);
        buttonWed = findViewById(R.id.wedUPdBtn);
        buttonThurs = findViewById(R.id.thurUPdBtn);

        buttonHeading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (textViewUpload.getText().toString().trim().equals("")){
                    Toast.makeText(About.this, "NO TEXT TO UPDATE!",Toast.LENGTH_SHORT).show();
                }else {
                    String heading = textViewUpload.getText().toString().trim();

                    databaseReference = FirebaseDatabase.getInstance().getReference().child("heading");
                    databaseReference.setValue(heading);

                    Toast.makeText(About.this, "Heading Successfully Updated!",Toast.LENGTH_SHORT).show();

                    textViewUpload.setText("");
                }
            }
        });

        buttonCourseInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (textViewUpload.getText().toString().trim().equals("")){
                    Toast.makeText(About.this, "NO TEXT TO UPDATE!",Toast.LENGTH_SHORT).show();
                }else {
                    String courseinfo = textViewUpload.getText().toString().trim();

                    databaseReference = FirebaseDatabase.getInstance().getReference().child("courseinformation");
                    databaseReference.setValue(courseinfo);

                    Toast.makeText(About.this, "CourseInformation Successfully Updated!",Toast.LENGTH_SHORT).show();

                    textViewUpload.setText("");
                }
            }
        });

        buttonNotice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textViewUpload.getText().toString().trim().equals("")){
                    Toast.makeText(About.this, "NO TEXT TO UPDATE!",Toast.LENGTH_SHORT).show();
                }else {
                    String notice = textViewUpload.getText().toString().trim();

                    databaseReference = FirebaseDatabase.getInstance().getReference().child("notice");
                    databaseReference.setValue(notice);

                    Toast.makeText(About.this, "Notice Successfully Updated!",Toast.LENGTH_SHORT).show();

                    textViewUpload.setText("");
                }
            }
        });

        buttonSat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textViewUpload.getText().toString().trim().equals("")){
                    Toast.makeText(About.this, "NO TEXT TO UPDATE!",Toast.LENGTH_SHORT).show();
                }else {
                    String day = textViewUpload.getText().toString().trim();

                    databaseReference = FirebaseDatabase.getInstance().getReference().child("routine").child("saturday");
                    databaseReference.setValue(day);

                    Toast.makeText(About.this, "Successfully Updated (Saturday) !!",Toast.LENGTH_SHORT).show();

                    textViewUpload.setText("");
                }
            }
        });

        buttonSun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textViewUpload.getText().toString().trim().equals("")){
                    Toast.makeText(About.this, "NO TEXT TO UPDATE!",Toast.LENGTH_SHORT).show();
                }else {
                    String day = textViewUpload.getText().toString().trim();

                    databaseReference = FirebaseDatabase.getInstance().getReference().child("routine").child("sunday");
                    databaseReference.setValue(day);

                    Toast.makeText(About.this, "Successfully Updated (Sunday) !!",Toast.LENGTH_SHORT).show();

                    textViewUpload.setText("");
                }
            }
        });

        buttonMon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textViewUpload.getText().toString().trim().equals("")){
                    Toast.makeText(About.this, "NO TEXT TO UPDATE!",Toast.LENGTH_SHORT).show();
                }else {
                    String day = textViewUpload.getText().toString().trim();

                    databaseReference = FirebaseDatabase.getInstance().getReference().child("routine").child("monday");
                    databaseReference.setValue(day);

                    Toast.makeText(About.this, "Successfully Updated (Monday) !!",Toast.LENGTH_SHORT).show();

                    textViewUpload.setText("");
                }
            }
        });

        buttonTues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textViewUpload.getText().toString().trim().equals("")){
                    Toast.makeText(About.this, "NO TEXT TO UPDATE!",Toast.LENGTH_SHORT).show();
                }else {
                    String day = textViewUpload.getText().toString().trim();

                    databaseReference = FirebaseDatabase.getInstance().getReference().child("routine").child("tuesday");
                    databaseReference.setValue(day);

                    Toast.makeText(About.this, "Successfully Updated (Tuesday) !!",Toast.LENGTH_SHORT).show();

                    textViewUpload.setText("");
                }
            }
        });

        buttonWed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textViewUpload.getText().toString().trim().equals("")){
                    Toast.makeText(About.this, "NO TEXT TO UPDATE!",Toast.LENGTH_SHORT).show();
                }else {
                    String day = textViewUpload.getText().toString().trim();

                    databaseReference = FirebaseDatabase.getInstance().getReference().child("routine").child("wednesday");
                    databaseReference.setValue(day);

                    Toast.makeText(About.this, "Successfully Updated (Wednesday) !!",Toast.LENGTH_SHORT).show();

                    textViewUpload.setText("");
                }
            }
        });

        buttonThurs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textViewUpload.getText().toString().trim().equals("")){
                    Toast.makeText(About.this, "NO TEXT TO UPDATE!",Toast.LENGTH_SHORT).show();
                }else {
                    String day = textViewUpload.getText().toString().trim();

                    databaseReference = FirebaseDatabase.getInstance().getReference().child("routine").child("thursday");
                    databaseReference.setValue(day);

                    Toast.makeText(About.this, "Successfully Updated (Thursday) !!",Toast.LENGTH_SHORT).show();

                    textViewUpload.setText("");
                }
            }
        });

    }
}
