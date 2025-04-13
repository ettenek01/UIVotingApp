package com.example.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class FirstPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page); // Make sure this matches your XML filename

        Button getStartedButton = findViewById(R.id.button);
        getStartedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to MainPage
                Intent intent = new Intent(FirstPage.this, MainPage.class);
                startActivity(intent);
            }
        });
    }
}
