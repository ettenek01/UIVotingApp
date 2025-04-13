package com.example.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class acknowledgement extends AppCompatActivity {

    private static final int REQUEST_YOUTUBE = 101; // request code

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acknowledgement);

        Button btnStudent = findViewById(R.id.btnadminregister);

        btnStudent.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/"));
            startActivityForResult(intent, REQUEST_YOUTUBE);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_YOUTUBE) {
            // After returning from YouTube, go to AfterVotingActivity
            Intent intent = new Intent(acknowledgement.this, AfterVoting.class);
            startActivity(intent);
            finish();
        }
    }
}
