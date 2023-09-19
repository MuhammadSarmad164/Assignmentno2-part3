package com.example.assignmentno2part3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {

    Button btn;
    EditText edt;


    TextView textView8;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        btn = findViewById(R.id.button);
        Button back5 =findViewById(R.id.button9);
        edt = findViewById(R.id.editTextText);
        textView8= findViewById(R.id.textView);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String temp = String.valueOf(edt.getText());

                float liters = Float.parseFloat(temp);

                float CM = liters / 1000;

                textView8.setText("Cubic Meter= "+CM+"CM");

                Toast.makeText(MainActivity6.this, "Volume Calculate " + CM, Toast.LENGTH_LONG).show();

            }
        });
        back5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity6.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

}