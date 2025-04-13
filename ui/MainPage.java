package com.example.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainPage extends AppCompatActivity {

    Button btnAdmin, btnStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        btnAdmin = findViewById(R.id.btnAdmin);
        btnStudent = findViewById(R.id.btnadminregister);

        btnAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 👉 This now goes to AdminRegister
                Intent intent = new Intent(MainPage.this, AdminRegister.class);
                startActivity(intent);
            }
        });

        btnStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage.this, StudentRegister.class);
                startActivity(intent);
            }
        });
    }
}
