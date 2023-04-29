package com.example.ratemypet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class RateAnimalActivity extends AppCompatActivity {

    public static int[] images = {R.drawable.cat1, R.drawable.cat2, R.drawable.cat3, R.drawable.cat4, R.drawable.cat5, R.drawable.cat1};
    public int x = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rate_animal);
    }

    public void onThumbs(View view) {
        if (x > 4) {
            x = 0;
        }

        x++;
        ImageView cat = findViewById(R.id.imageViewCat);
        cat.setImageResource(images[x]);

        /*for (int i = 0; i < 5; i++){
            cat.setImageResource(images[i]);
        }*/
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