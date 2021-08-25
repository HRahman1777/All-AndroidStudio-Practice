package com.example.bmi_ftoc_ctof_fall2020;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FarToCel extends Fragment {

    EditText Num1;
    Button res;
    double result;
    TextView textView1, textView2;

    //DatabaseReference databaseReference;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        super.onCreateView(inflater, container, savedInstanceState);
        View InputFragmentView = inflater.inflate(
                R.layout.fragment_far_to_cel, container, false);
        Num1 = (EditText) InputFragmentView.findViewById(R.id.tempFid);
        textView1 = (TextView) InputFragmentView.findViewById(R.id.resultTvid);
        textView2 = (TextView) InputFragmentView.findViewById(R.id.showstdFID);
        res = (Button) InputFragmentView.findViewById(R.id.farcid);

        NextActivity activity = (NextActivity) getActivity();
        String strID = activity.getMyData();
        textView2.setText(strID);

        //databaseReference = FirebaseDatabase.getInstance().getReference("strID");

        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String N1 = Num1.getText().toString();
                double N11 = Double.parseDouble(N1);

                result = ((N11-32)*5)/9;
                textView1.setText(""+result);

                /*

                    Upload upload = new Upload(strID, result);
                    databaseReference.child("CelToFar").setValue(upload);

                */
            }
        });
        return InputFragmentView;
    }
}