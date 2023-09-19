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

public class MainActivity7 extends AppCompatActivity {

    Button btn;
    EditText edt;


    TextView textView8;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        btn = findViewById(R.id.button);
        Button back7 =findViewById(R.id.button9);
        edt = findViewById(R.id.editTextText);
        textView8= findViewById(R.id.textView);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String temp = String.valueOf(edt.getText());

                double meters = Double.parseDouble(temp); // Replace this with the number of meters you want to convert
                double kilometers = meters / 1000.0;

                textView8.setText("Kilometer= "+kilometers+"KM");

                Toast.makeText(MainActivity7.this, "Length Calculate " + kilometers, Toast.LENGTH_LONG).show();

            }
        });
        back7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity7.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

}