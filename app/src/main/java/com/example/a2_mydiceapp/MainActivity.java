package com.example.a2_mydiceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btnRollDice;
    ImageView imgDice1,imgDice2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnRollDice = findViewById(R.id.btnRollDice);
        imgDice1 = findViewById(R.id.imgDice1);
        imgDice2 = findViewById(R.id.imgDice2);

        int[] diceImages = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6,
        };




        btnRollDice.setOnClickListener(view -> {
            /*Random rndObject = new Random();
            int myRandom = rndObject.nextInt(6) + 1 ;*/
            //Toast.makeText(this,String.valueOf(myRandom),Toast.LENGTH_SHORT).show();


            int random1 = new Random().nextInt(6) ;
            imgDice1.setImageResource(diceImages[random1]);

            int random2 = new Random().nextInt(6);
            imgDice2.setImageResource(diceImages[random2]);
        });
    }
}