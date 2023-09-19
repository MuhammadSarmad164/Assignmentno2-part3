package com.example.assignmentno2part3;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity3 extends AppCompatActivity {
    EditText e1;
    Button  CB;
    TextView   t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        CB=findViewById(R.id.calculateButton);
        Button back2=findViewById(R.id.button2);
        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity3.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity3.this, "Back", Toast.LENGTH_LONG).show();
            }
        });
        CB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1=findViewById(R.id.textView);
                e1=findViewById(R.id.edit);

                Double a=Double.parseDouble(e1.getText().toString());
                Double b=(a)/298;
                t1.setText("$="+b);
            }
        });
    }
}