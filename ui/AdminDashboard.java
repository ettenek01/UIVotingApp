package com.example.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AdminDashboard extends AppCompatActivity {

    Button btnCreate, btnConfirmInfo, btnTally, btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dashboard);

        btnCreate = findViewById(R.id.btnCreate);
        btnConfirmInfo = findViewById(R.id.btnConfirminformation);
        btnTally = findViewById(R.id.btnTally);
        btnLogout = findViewById(R.id.btnLogout);

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: Add logic to create elections or data
                // Example: startActivity(new Intent(AdminDashboard.this, CreateElectionActivity.class));
            }
        });

        btnConfirmInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: Add logic to view/confirm student info
                // Example: startActivity(new Intent(AdminDashboard.this, ConfirmInfoActivity.class));
            }
        });

        btnTally.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: Add logic to view vote tally
                // Example: startActivity(new Intent(AdminDashboard.this, TallyResultsActivity.class));
            }
        });

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Return to AdminLogin
                Intent intent = new Intent(AdminDashboard.this, AdminLogin.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
            }
        });
    }
}
