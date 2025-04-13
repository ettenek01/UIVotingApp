package com.example.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class StudentLogin extends AppCompatActivity {

    EditText email, schoolId, course, password;
    Button btnLogin;

    private static final String SCHOOL_DOMAIN = "@paterostechnologicalcollege.edu.ph";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);

        email = findViewById(R.id.email);
        schoolId = findViewById(R.id.id);
        course = findViewById(R.id.course);
        password = findViewById(R.id.password);
        btnLogin = findViewById(R.id.btnadminregister);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userEmail = email.getText().toString().trim();
                String userId = schoolId.getText().toString().trim();
                String userCourse = course.getText().toString().trim();
                String userPassword = password.getText().toString().trim();

                // Check if any of the fields are empty
                if (TextUtils.isEmpty(userEmail) || TextUtils.isEmpty(userId) ||
                        TextUtils.isEmpty(userCourse) || TextUtils.isEmpty(userPassword)) {
                    Toast.makeText(StudentLogin.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Check if the email is valid (ends with the school domain)
                if (!userEmail.endsWith(SCHOOL_DOMAIN)) {
                    Toast.makeText(StudentLogin.this, "Use only school email: " + SCHOOL_DOMAIN, Toast.LENGTH_SHORT).show();
                    return;
                }

                // TODO: Add login validation with real data (e.g., Firebase or local database)

                // Show login success message
                Toast.makeText(StudentLogin.this, "Login Successful", Toast.LENGTH_SHORT).show();

                // After successful login, navigate to the Acknowledgement screen
                Intent intent = new Intent(StudentLogin.this, acknowledgement.class);
                startActivity(intent);

                // Optionally, finish the login activity so the user can't return to it
                finish();
            }
        });
    }
}
