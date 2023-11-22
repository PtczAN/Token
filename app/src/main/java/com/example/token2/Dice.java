package com.example.token2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Dice extends AppCompatActivity {

    public Button B_d4, B_d6, B_d8, B_d10, B_d12, B_d20, B_d100;
    public TextView R_d4, R_d6, R_d8, R_d10, R_d12, R_d20, R_d100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);

        B_d4 = findViewById(R.id.d4);
        B_d6 = findViewById(R.id.d6);
        B_d8 = findViewById(R.id.d8);
        B_d10 = findViewById(R.id.d10);
        B_d12 = findViewById(R.id.d12);
        B_d20 = findViewById(R.id.d20);
        B_d100 = findViewById(R.id.d100);

        R_d4 = findViewById(R.id.v_d4);
        R_d6 = findViewById(R.id.v_d6);
        R_d8 = findViewById(R.id.v_d8);
        R_d10 = findViewById(R.id.v_d10);
        R_d12 = findViewById(R.id.v_d12);
        R_d20 = findViewById(R.id.v_d20);
        R_d100 = findViewById(R.id.v_d100);
        //TextView valueR_d4 = findViewById(R.id.v_d4);
        //valueR_d4.setText(Integer.toString(str.getAmount()));
        //TextView valueCon = findViewById(R.id.value_con);
        //valueCon.setText(Integer.toString(con.getAmount()));
        //TextView valueDex = findViewById(R.id.value_dex);
        //valueDex.setText(Integer.toString(dex.getAmount()));
        //TextView valueInt = findViewById(R.id.value_int);
        //valueInt.setText(Integer.toString(int2.getAmount()));
        //TextView valueWis = findViewById(R.id.value_wis);
        //valueWis.setText(Integer.toString(wis.getAmount()));
        //TextView valueCha = findViewById(R.id.value_cha);
        //valueCha.setText(Integer.toString(cha.getAmount()));


        B_d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                R_d4.setText(new Random().nextInt(4) + 1);
            }
        });
        B_d6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                R_d6.setText(new Random().nextInt(6) + 1);
            }
        });
        B_d8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                R_d8.setText(new Random().nextInt(8) + 1);
            }
        });
        B_d10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                R_d10.setText(new Random().nextInt(10) + 1);
            }
        });
        B_d12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                R_d12.setText(new Random().nextInt(12) + 1);
            }
        });
        B_d20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                R_d20.setText(new Random().nextInt(20) + 1);
            }
        });

    }
       // public void D100(View view){
       //     v_d100.setText(new Random().nextInt(100)+1); }
    public void inicio2(View view){
        Intent intent = new Intent(Dice.this, Home.class);
        startActivity(intent);
    }
}
