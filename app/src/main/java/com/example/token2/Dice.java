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

    }
    public void D4(View view){
        int d4;
        d4 = new Random().nextInt(4) + 1;
        R_d4.setText(Integer.toString(d4));
    }
    public void D6(View view){
        int d6;
        d6 = new Random().nextInt(6) + 1;
        R_d6.setText(Integer.toString(d6));
    }
    public void D8(View view){
        int d8;
        d8 = new Random().nextInt(8) + 1;
        R_d8.setText(Integer.toString(d8));
    }
    public void D10(View view){
        int d10;
        d10 = new Random().nextInt(10) + 1;
        R_d10.setText(Integer.toString(d10));
    }
    public void D12(View view){
        int d12;
        d12 = new Random().nextInt(12) + 1;
        R_d12.setText(Integer.toString(d12));
    }
    public void D20(View view){
        int d20;
        d20 = new Random().nextInt(20) + 1;
        R_d20.setText(Integer.toString(d20));
    }
        public void D100(View view){
           int x;
           x = new Random().nextInt(100) + 1;
            R_d100.setText(Integer.toString(x));
    }
    public void inicio2(View view){
        Intent intent = new Intent(Dice.this, Home.class);
        startActivity(intent);
    }
}
