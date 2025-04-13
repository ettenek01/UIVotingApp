package com.example.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AfterVoting extends AppCompatActivity {

    Button btnPrevious, btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_voting);

        btnPrevious = findViewById(R.id.btnprevious); // previous button
        btnSubmit = findViewById(R.id.btnadminregister); // submit button

        // Go back to YouTube when Previous is clicked
        btnPrevious.setOnClickListener(view -> {
            Intent youtubeIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/"));
            startActivity(youtubeIntent);
        });

        // Go to DoneActivity when Submit is clicked
        btnSubmit.setOnClickListener(view -> {
            Intent doneIntent = new Intent(AfterVoting.this, Done.class);
            startActivity(doneIntent);
            finish(); // optional, if you want to close this activity
        });
    }
}
