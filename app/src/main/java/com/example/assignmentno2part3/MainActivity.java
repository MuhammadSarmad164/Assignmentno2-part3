package com.example.assignmentno2part3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1=findViewById(R.id.b1);
        Button btn2=findViewById(R.id.b2);
        Button btn3=findViewById(R.id.b3);
        Button btn4=findViewById(R.id.b4);
        Button btn5=findViewById(R.id.b5);
        Button btn6=findViewById(R.id.b6);
        Button btn7=findViewById(R.id.b7);
        Button btn8=findViewById(R.id.b8);
        Button btn9=findViewById(R.id.b9);
        Button btn10=findViewById(R.id.b10);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Open Friendship Calculator", Toast.LENGTH_LONG).show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Currency Converter", Toast.LENGTH_LONG).show();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, MainActivity4.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Temperature Converter", Toast.LENGTH_LONG).show();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, MainActivity5.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "BMI Calculate", Toast.LENGTH_LONG).show();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, MainActivity6.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Volume Calculate", Toast.LENGTH_LONG).show();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, MainActivity7.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Length Calculate", Toast.LENGTH_LONG).show();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, MainActivity8.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Area Calculator", Toast.LENGTH_LONG).show();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, MainActivity9.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Time Converter", Toast.LENGTH_LONG).show();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, MainActivity10.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Weight Calculate", Toast.LENGTH_LONG).show();
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, MainActivity11.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Age Calculate", Toast.LENGTH_LONG).show();
            }
        });
    }
}