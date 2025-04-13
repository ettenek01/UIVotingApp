package com.example.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class StudentRegister extends AppCompatActivity {

    EditText email, schoolId, password, confirmPassword;
    Button btnRegister;

    private static final String SCHOOL_DOMAIN = "@paterostechnologicalcollege.edu.ph";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_register);

        email = findViewById(R.id.email);
        schoolId = findViewById(R.id.id);
        password = findViewById(R.id.password);
        confirmPassword = findViewById(R.id.confirmPassword);
        btnRegister = findViewById(R.id.btnadminregister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userEmail = email.getText().toString().trim();
                String userId = schoolId.getText().toString().trim();
                String userPassword = password.getText().toString().trim();
                String userConfirmPassword = confirmPassword.getText().toString().trim();

                if (TextUtils.isEmpty(userEmail) || TextUtils.isEmpty(userId) ||
                        TextUtils.isEmpty(userPassword) || TextUtils.isEmpty(userConfirmPassword)) {
                    Toast.makeText(StudentRegister.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (!userEmail.endsWith(SCHOOL_DOMAIN)) {
                    Toast.makeText(StudentRegister.this, "Use only school email: " + SCHOOL_DOMAIN, Toast.LENGTH_SHORT).show();
                    return;
                }

                if (!userPassword.equals(userConfirmPassword)) {
                    Toast.makeText(StudentRegister.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
                    return;
                }

                Toast.makeText(StudentRegister.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(StudentRegister.this, StudentLogin.class));
                finish();
            }
        });
    }
}
