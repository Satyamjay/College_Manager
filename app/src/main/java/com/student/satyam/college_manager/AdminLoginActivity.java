package com.student.satyam.college_manager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AdminLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);
    }

    public void adminSignup(View view){
        Intent intent = new Intent(this,AdminSignupActivity.class);
        startActivity(intent);

    }
}