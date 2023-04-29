package com.example.ratemypet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);
    }

    public void onCats(View view) {
        Intent intent = new Intent(this,RateAnimalActivity.class);
        startActivity(intent);
    }

    public void onDogs(View view) {
        Intent intent = new Intent(this,RateDogActivity.class);
        startActivity(intent);
    }

    public void onHelp(View view) {
        Intent intent = new Intent(this,HelpActivity.class);
        startActivity(intent);
    }
}