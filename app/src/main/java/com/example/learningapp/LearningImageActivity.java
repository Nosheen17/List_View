package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;



class LearningImage extends AppCompatActivity{

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning_image);
        Intent intent = getIntent();
        int image = intent.getIntExtra("Image",-1);
        if(image == -1){
            //Error Loading
        }
        Log.d("NumberSecond",Integer.toString(image));
        imageView = findViewById(R.id.imageView);
        imageView.setImageResource(image);


    }
}