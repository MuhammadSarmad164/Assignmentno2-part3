package com.example.assignmentno2part3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class MainActivity9 extends AppCompatActivity {
    private TextView belgiumTimeTextView;
    private TextView pakistanTimeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        Button back8 =findViewById(R.id.button9);
        belgiumTimeTextView = findViewById(R.id.belgiumTimeTextView);
        pakistanTimeTextView = findViewById(R.id.pakistanTimeTextView);

        Button convertButton = findViewById(R.id.convertButton);
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the current time in Belgium Time
                LocalDateTime belgiumTime = null;
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                    belgiumTime = LocalDateTime.now(ZoneId.of("Europe/Brussels"));
                }

                // Convert Belgium Time to Pakistan Time
                ZoneId pakistanZoneId = null;
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                    pakistanZoneId = ZoneId.of("Asia/Karachi");
                }
                LocalDateTime pakistanTime = null;
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                    pakistanTime = belgiumTime.atZone(ZoneOffset.UTC).withZoneSameInstant(pakistanZoneId).toLocalDateTime();
                }

                // Update the TextViews with the converted times
                belgiumTimeTextView.setText("Belgium Time: " + belgiumTime);
                pakistanTimeTextView.setText("Pakistan Time: " + pakistanTime);
            }
        });
        back8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity9.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}