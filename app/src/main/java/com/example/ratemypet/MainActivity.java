package com.example.ratemypet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onResetPassword(View view) {
        Intent intent = new Intent(this,ResetPasswordActivity.class);
        startActivity(intent);
    }

    public void onLogin(View view){
        Intent intent = new Intent(this,RateAnimalActivity.class);
        startActivity(intent);
    }
}