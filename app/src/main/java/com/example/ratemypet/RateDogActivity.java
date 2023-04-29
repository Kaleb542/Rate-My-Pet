package com.example.ratemypet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class RateDogActivity extends AppCompatActivity {

    public static int[] images = {R.drawable.dog1, R.drawable.dog2, R.drawable.dog3, R.drawable.dog4, R.drawable.dog5, R.drawable.dog1};
    public int x = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rate_dog);
    }

    public void onThumbs(View view) {
        if (x > 4) {
            x = 0;
        }

        x++;
        ImageView dog = findViewById(R.id.imageViewDog);
        dog.setImageResource(images[x]);
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