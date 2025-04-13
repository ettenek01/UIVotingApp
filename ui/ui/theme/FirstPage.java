package com.example.ui.ui.theme;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ui.MainPage;
import com.example.ui.R;

public class FirstPage extends AppCompatActivity {

    Button getStartedButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);

        getStartedButton = findViewById(R.id.button);

        getStartedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstPage.this, MainPage.class);
                startActivity(intent);
            }
        });
    }
}
