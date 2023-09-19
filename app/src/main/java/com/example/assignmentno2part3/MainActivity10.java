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

public class MainActivity10 extends AppCompatActivity {

    Button btn;
    EditText edt;


    TextView textView8;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        Button back9 =findViewById(R.id.button9);
        btn = findViewById(R.id.button);
        Button back3 =findViewById(R.id.button9);
        edt = findViewById(R.id.editTextText);
        textView8= findViewById(R.id.textView);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String massText = edt.getText().toString();
                double massKg = Double.parseDouble(massText);

                // Define the acceleration due to gravity (approximate value on Earth)
                double gravity = 9.81;

                // Calculate weight in newtons
                double weight = massKg * gravity;


                textView8.setText("Weight= "+weight+"W");

                Toast.makeText(MainActivity10.this, "Weight Calculate " + weight, Toast.LENGTH_LONG).show();

            }
        });
        back9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity10.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}