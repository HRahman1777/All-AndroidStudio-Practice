package com.example.bmi_ftoc_ctof_fall2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText editText1, editText2;
    public Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editTextID1);
        editText2 = findViewById(R.id.editTextID2);
        button1 = findViewById(R.id.buttonlogin);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stdId = editText1.getText().toString();
                String passwd = editText2.getText().toString();
                if (passwd.charAt(4)=='s'){
                    Intent intent = new Intent((MainActivity.this),(NextActivity.class));
                    intent.putExtra("stdId",stdId);
                    startActivity(intent);
                }else
                    Toast.makeText(getApplicationContext(), "Login failed! Enter your password again!",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
