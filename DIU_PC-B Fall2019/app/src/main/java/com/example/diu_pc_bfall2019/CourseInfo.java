package com.example.diu_pc_bfall2019;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class CourseInfo extends AppCompatActivity {


    TextView textViewCourseDetails;
    Button buttonCourseRefresh;

    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_info);
        this.setTitle("Your Services");

        textViewCourseDetails = findViewById(R.id.courseDetailsTextViewId);
        buttonCourseRefresh = findViewById(R.id.courseRefreshBtnId);
        display();
        display2();

        buttonCourseRefresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                databaseReference = FirebaseDatabase.getInstance().getReference().child("courseinformation");
                databaseReference.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String cInfo = dataSnapshot.getValue().toString();

                        SharedPreferences sharedPreferences = getSharedPreferences("cinfoK", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString("on",cInfo);
                        editor.commit();
                        Toast.makeText(CourseInfo.this, "Course Info Already Updated!!\n\t\t\t\t\t\t\t(^_^)",Toast.LENGTH_SHORT).show();
                        textViewCourseDetails.setText(cInfo);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }

        });
        display2();

    }

    private void display2() {
        SharedPreferences sharedPreferences2 = getSharedPreferences("cinfoK", Context.MODE_PRIVATE);
        String one1 = sharedPreferences2.getString("on","Need Internet For First Time And Press Refresh For Updates");
        textViewCourseDetails.setText(one1);
    }

    private void display() {
        databaseReference = FirebaseDatabase.getInstance().getReference().child("courseinformation");
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String cInfo = dataSnapshot.getValue().toString();

                SharedPreferences sharedPreferences = getSharedPreferences("cinfoK", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("on",cInfo);
                editor.commit();
                textViewCourseDetails.setText(cInfo);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }


}
