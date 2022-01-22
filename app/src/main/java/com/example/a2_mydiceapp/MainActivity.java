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
            int random = new Random().nextInt(7);
            Toast.makeText(this,String.valueOf(random),Toast.LENGTH_SHORT).show();
        });
    }
}