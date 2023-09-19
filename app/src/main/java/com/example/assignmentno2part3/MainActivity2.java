package com.example.assignmentno2part3;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final EditText yourNameEditText = findViewById(R.id.yourName);
        final EditText friendNameEditText = findViewById(R.id.friendNameEditText);
        final Button calculateButton = findViewById(R.id.calculateButton);
        final TextView resultTextView = findViewById(R.id.resultTextView);
        Button back1=findViewById(R.id.button1);
        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity2.this, "Back", Toast.LENGTH_LONG).show();
            }
        });
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String yourName = yourNameEditText.getText().toString();
                String friendName = friendNameEditText.getText().toString();

                // Arbitrary calculation (replace with your own logic)
                int friendshipScore = calculateFriendshipScore(yourName, friendName);

                String resultMessage = "Score: " + friendshipScore+"%";
                resultTextView.setText(resultMessage);
            }
        });
    }

    private int calculateFriendshipScore(String yourName, String friendName) {
        // Replace this with your own calculation logic
        // For demonstration purposes, let's use a random number
        return (int) (Math.random() * 100);
    }
}