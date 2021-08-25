package com.example.bmi_ftoc_ctof_fall2020;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class CalculateBMI extends Fragment {
        EditText Num1, Num2;
        Button res;
        double result;
        TextView textView;

        //DatabaseReference databaseReference;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        super.onCreateView(inflater, container, savedInstanceState);
        View InputFragmentView = inflater.inflate(
                R.layout.fragment_calculate_bmi, container, false);
        Num1 = (EditText) InputFragmentView.findViewById(R.id.wightid);
        Num2 = (EditText) InputFragmentView.findViewById(R.id.heightid);
        textView = (TextView) InputFragmentView.findViewById(R.id.showstdID);
        res = (Button) InputFragmentView.findViewById(R.id.bmicalid);

            NextActivity activity = (NextActivity) getActivity();
            String strID = activity.getMyData();
            textView.setText(strID);

            //databaseReference = FirebaseDatabase.getInstance().getReference("strID");

        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String N1 = Num1.getText().toString();
                double N11 = Double.parseDouble(N1);

                String N2 = Num2.getText().toString();
                double N22 = Double.parseDouble(N2);
                N22 = N22/39.37;

                result = N11/(N22*N22);
                if(result > 25.0)
                    Toast.makeText(getActivity(), "Overweight", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getActivity(), "Not Overweight", Toast.LENGTH_LONG).show();
/*

                    Upload upload = new Upload(strID, result);
                    databaseReference.child("BMI").setValue(upload);

                */
            }
        });
        return InputFragmentView;
    }
}

