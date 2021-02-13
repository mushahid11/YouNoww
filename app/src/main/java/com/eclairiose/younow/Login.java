package com.eclairiose.younow;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void moveToRegistration(View view) {
        startActivity(new Intent(Login.this, Registration.class));
    }

    public void moveToHomeScreen(View view) {
        startActivity(new Intent(Login.this, MainActivity.class));
    }
}
