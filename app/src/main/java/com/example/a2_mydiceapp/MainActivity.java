package com.example.a2_mydiceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btnRollDice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRollDice = findViewById(R.id.btnRollDice);
        btnRollDice.setOnClickListener(view -> {
            /*Random rndObject = new Random();
            int myRandom = rndObject.nextInt(6) + 1 ;*/
            int random = new Random().nextInt(6) + 1;
            Toast.makeText(this,String.valueOf(random),Toast.LENGTH_SHORT).show();
        });
    }
}