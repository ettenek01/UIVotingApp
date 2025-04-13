package com.example.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AdminRegister extends AppCompatActivity {

    EditText email, schoolId, password, confirmPassword;
    Button btnadminregister;

    private static final String SCHOOL_DOMAIN = "@paterostechnologicalcollege.edu.ph";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_register);  // Make sure this XML layout is correctly linked

        email = findViewById(R.id.email);
        schoolId = findViewById(R.id.id);
        password = findViewById(R.id.password);
        confirmPassword = findViewById(R.id.confirmPassword);
        btnadminregister = findViewById(R.id.btnadminregister);

        btnadminregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userEmail = email.getText().toString().trim();
                String userId = schoolId.getText().toString().trim();
                String userPassword = password.getText().toString().trim();
                String userConfirmPassword = confirmPassword.getText().toString().trim();

                // Check for empty fields
                if (TextUtils.isEmpty(userEmail) || TextUtils.isEmpty(userId) ||
                        TextUtils.isEmpty(userPassword) || TextUtils.isEmpty(userConfirmPassword)) {
                    Toast.makeText(AdminRegister.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Check for school domain in email
                if (!userEmail.endsWith(SCHOOL_DOMAIN)) {
                    Toast.makeText(AdminRegister.this, "Use only school email: " + SCHOOL_DOMAIN, Toast.LENGTH_SHORT).show();
                    return;
                }

                // Check if passwords match
                if (!userPassword.equals(userConfirmPassword)) {
                    Toast.makeText(AdminRegister.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Success message and navigate to AdminLogin activity
                Toast.makeText(AdminRegister.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(AdminRegister.this, AdminLogin.class));  // Navigate to AdminLogin
                finish();  // Close the current activity (AdminRegister)
            }
        });
    }
}
