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

public class CelToFar extends Fragment {

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
                R.layout.fragment_cel_to_far, container, false);
        Num1 = (EditText) InputFragmentView.findViewById(R.id.tempCid);
        textView1 = (TextView) InputFragmentView.findViewById(R.id.resultTvCid);
        textView2 = (TextView) InputFragmentView.findViewById(R.id.showstdCID);
        res = (Button) InputFragmentView.findViewById(R.id.celFid);

        NextActivity activity = (NextActivity) getActivity();
        String strID = activity.getMyData();
        textView2.setText(strID);

        //databaseReference = FirebaseDatabase.getInstance().getReference("strID");

        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String N1 = Num1.getText().toString();
                double N11 = Double.parseDouble(N1);

                result = ((9*N11)/5)+32;
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