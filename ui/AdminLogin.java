package com.example.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AdminLogin extends AppCompatActivity {

    EditText emailInput, passwordInput;
    Button btnLogin, btnRegister;

    // Dummy admin credentials for demonstration
    private static final String ADMIN_EMAIL = "admin@ptc.com";
    private static final String ADMIN_PASSWORD = "admin123";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login); // Ensure this matches your layout file name

        emailInput = findViewById(R.id.adminEmail);
        passwordInput = findViewById(R.id.password);
        btnLogin = findViewById(R.id.btnAdminLogin);
        btnRegister = findViewById(R.id.btnadminregister); // Add this line to get the register button

        // Login button action
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailInput.getText().toString().trim();
                String password = passwordInput.getText().toString().trim();

                if (email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(AdminLogin.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (email.equals(ADMIN_EMAIL) && password.equals(ADMIN_PASSWORD)) {
                    Toast.makeText(AdminLogin.this, "Login Successful", Toast.LENGTH_SHORT).show();

                    // Replace with your admin homepage/activity
                    Intent intent = new Intent(AdminLogin.this, AdminDashboard.class); // Replace AdminDashboard with your desired activity
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(AdminLogin.this, "Invalid credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Register button action
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // This will go to AdminActivity (make sure the activity name is correct)
                Intent intent = new Intent(AdminLogin.this, AdminLogin.class); // This should point to your AdminActivity
                startActivity(intent);
            }
        });
    }
}
