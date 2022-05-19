package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Message;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton[] b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=new ImageButton[26];
        b[0] = findViewById(R.id.btnA);
        b[1] = findViewById(R.id.btnB);
        b[2] = findViewById(R.id.btnC);
        b[3] = findViewById(R.id.btnD);
        b[4] = findViewById(R.id.btnE);
        b[5] = findViewById(R.id.btnF);
        b[6] = findViewById(R.id.btnG);
        b[7] = findViewById(R.id.btnH);
        b[8] = findViewById(R.id.btnI);
        b[9] = findViewById(R.id.btnJ);
        b[10] = findViewById(R.id.btnK);
        b[11] = findViewById(R.id.btnL);
        b[12] = findViewById(R.id.btnM);
        b[13] = findViewById(R.id.btnN);
        b[14] = findViewById(R.id.btnO);
        b[15] = findViewById(R.id.btnP);
        b[16] = findViewById(R.id.btnQ);
        b[17] = findViewById(R.id.btnR);
        b[18] = findViewById(R.id.btnS);
        b[19] = findViewById(R.id.btnT);
        b[20] = findViewById(R.id.btnU);
        b[21] = findViewById(R.id.btnV);
        b[22] = findViewById(R.id.btnW);
        b[23] = findViewById(R.id.btnX);
        b[24] = findViewById(R.id.btnY);
        b[25] = findViewById(R.id.btnZ);
        for (int i = 0; i < b.length; i++) {
            b[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view) {
        int image = selectImage(view.getId());
        Log.d("NumberMain",Integer.toString(image));
        Intent intent = new Intent(MainActivity.this,LearningImage.class);
        intent.putExtra("Image",image);
        startActivity(intent);
    }

    int selectImage(int id) {
        int image = -1;
        switch (id){
            case R.id.btnA:
                image = R.drawable.kida;
                break;
            case R.id.btnB:
                image = R.drawable.kidb;
                break;
            case R.id.btnC:
                image = R.drawable.kidc;
                break;
            case R.id.btnD:
                image = R.drawable.kidb;
                break;
            case R.id.btnE:
                image = R.drawable.kide;
                break;
            case R.id.btnF:
                image = R.drawable.kidf;
                break;
            case R.id.btnG:
                image = R.drawable.kidg;
                break;
            case R.id.btnH:
                image = R.drawable.kidh;
                break;
            case R.id.btnI:
                image = R.drawable.kidi;
                break;
            case R.id.btnJ:
                image = R.drawable.kidj;
                break;
            case R.id.btnK:
                image = R.drawable.kidk;
                break;
            case R.id.btnL:
                image = R.drawable.kidl;
                break;
            case R.id.btnM:
                image = R.drawable.kidm;
                break;
            case R.id.btnN:
                image = R.drawable.kidn;
                break;
            case R.id.btnO:
                image = R.drawable.kido;
                break;
            case R.id.btnP:
                image = R.drawable.kidp;
                break;
            case R.id.btnQ:
                image = R.drawable.kidq;
                break;
            case R.id.btnR:
                image = R.drawable.kidr;
                break;
            case R.id.btnS:
                image = R.drawable.kids;
                break;
            case R.id.btnT:
                image = R.drawable.kidt;
                break;
            case R.id.btnU:
                image = R.drawable.kidu;
                break;
            case R.id.btnV:
                image = R.drawable.kidv;
                break;
            case R.id.btnW:
                image = R.drawable.kidw;
                break;
            case R.id.btnX:
                image = R.drawable.kidx;
                break;
            case R.id.btnY:
                image = R.drawable.kidy;
                break;
            case R.id.btnZ:
                image = R.drawable.kidz;
                break;
            default:
                break;
        }
        return image;
    }
}