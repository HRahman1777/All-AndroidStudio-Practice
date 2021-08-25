package com.example.bmi_ftoc_ctof_fall2020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class NextActivity extends AppCompatActivity {

    public Button bmi,ftoc,ctof, showBtn;
    public Fragment fragment;
    String strID;
    //DatabaseReference databaseReference;
    //private List<Upload> uploadList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        bmi=findViewById(R.id.calBmiid);
        ftoc=findViewById(R.id.calfartocid);
        ctof=findViewById(R.id.calCeltoFid);
        showBtn=findViewById(R.id.showallID);

        Bundle bundle = getIntent().getExtras();
        strID = bundle.getString("stdId");

        //databaseReference = FirebaseDatabase.getInstance().getReference("strID/");

        bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment = new CalculateBMI();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentid, fragment);
                fragmentTransaction.commit();
            }
        });
        ftoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment = new FarToCel();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentid, fragment);
                fragmentTransaction.commit();
            }
        });
        ctof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment = new CelToFar();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentid, fragment);
                fragmentTransaction.commit();
            }
        });

        showBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                uploadWordMeaningList.clear();
                for (DataSnapshot dataSnapshotValue : snapshot.getChildren()){
                    Upload upload = dataSnapshotValue.getValue(Upload.class);
                    uploadList.add(uploadWord);
                }

                String[] uploads = new String[uploadList.size()];

                for (int i = 0; i < uploads.length; i++) {
                    uploads[i] = uploadList.get(i).getStrID();
                    String str = ""+uploads[i]+"\n";
                    Toast.makeText(getActivity(), str, Toast.LENGTH_LONG).show();
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

                 */
            }
        });
    }

    public String getMyData() {
        return strID;
    }
}
