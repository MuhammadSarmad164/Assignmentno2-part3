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

public class MainActivity4 extends AppCompatActivity {

    Button CB;
    EditText edt;


    TextView textView8;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        CB= findViewById(R.id.calculatebutton);
        Button back3 =findViewById(R.id.button4);
        edt = findViewById(R.id.editTextText);
        textView8= findViewById(R.id.textView);


        this.CB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String temp = String.valueOf(edt.getText());

                float C = Float.parseFloat(temp);
                float F = (9 * C / 5) + 32;
                textView8.setText("F= "+F+"°");

                Toast.makeText(MainActivity4.this, "F " + F, Toast.LENGTH_LONG).show();
            }
        });
//        Button btn =findViewById(R.id.button4);
        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity4.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}