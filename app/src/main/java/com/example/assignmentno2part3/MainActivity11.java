package com.example.assignmentno2part3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity11 extends AppCompatActivity {
    private DatePicker datePicker;
    private Button calculateButton;
    private TextView ageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        Button back10 =findViewById(R.id.button9);

        datePicker = findViewById(R.id.datePicker);
        calculateButton = findViewById(R.id.calculateButton);
        ageTextView = findViewById(R.id.ageTextView);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the selected date from the DatePicker
                int year = datePicker.getYear();
                int month = datePicker.getMonth();
                int day = datePicker.getDayOfMonth();

                // Create a Calendar instance for the current date
                Calendar currentDate = Calendar.getInstance();

                // Set the Calendar instance to the selected date
                currentDate.set(year, month, day);

                // Get the selected date as a Date object
                Date selectedDate = currentDate.getTime();

                // Calculate age by comparing with the current date
                int age = calculateAge(selectedDate);

                // Display the age in the TextView
                ageTextView.setText("Age: " + age + " years");
            }
        });
        back10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity11.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

    private int calculateAge(@NonNull Date birthDate) {
        Calendar currentDate = Calendar.getInstance();
        int currentYear = currentDate.get(Calendar.YEAR);
        int currentMonth = currentDate.get(Calendar.MONTH);
        int currentDay = currentDate.get(Calendar.DAY_OF_MONTH);

        Calendar birthCalendar = Calendar.getInstance();
        birthCalendar.setTime(birthDate);
        int birthYear = birthCalendar.get(Calendar.YEAR);
        int birthMonth = birthCalendar.get(Calendar.MONTH);
        int birthDay = birthCalendar.get(Calendar.DAY_OF_MONTH);

        int age = currentYear - birthYear;

        // Adjust age if birth date has not occurred yet this year
        if (currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay)) {
            age--;
        }

        return age;
    }

}