package com.example.a2_mydiceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btnRollDice;
    ImageView imgDice1,imgDice2;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnRollDice = findViewById(R.id.btnRollDice);
        imgDice1 = findViewById(R.id.imgDice1);
        imgDice2 = findViewById(R.id.imgDice2);
        mediaPlayer = MediaPlayer.create(this,R.raw.dice_sound);

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


            int random = new Random().nextInt(6) ;
            imgDice1.setImageResource(diceImages[random]);

            // or create an other variable like random for example int randomTwo = new Random().nextInt(6) ;
            // and use it in imgDice2.setImageResource(diceImages[randomTwo]);

            random = new Random().nextInt(6);
            imgDice2.setImageResource(diceImages[random]);

            YoYo.with(Techniques.Tada)
                    .duration(700)
                    .repeat(0)
                    .playOn(imgDice1);

            YoYo.with(Techniques.Shake)
                    .duration(700)
                    .repeat(0)
                    .playOn(imgDice2);

            mediaPlayer.start();
        });
    }
}