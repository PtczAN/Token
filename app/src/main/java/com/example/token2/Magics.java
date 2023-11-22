package com.example.token2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Magics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magics);
    }
    public void inicio5(View view){
        Intent intent = new Intent(Magics.this, Home.class);
        startActivity(intent);
    }
    public void support(View view){
        Intent intent = new Intent(Magics.this, MSupport.class);
        startActivity(intent);
    }
    public void attack(View view) {
        Intent intent = new Intent(Magics.this, MAttack.class);
        startActivity(intent);
    }
    public void defense(View view) {
        Intent intent = new Intent(Magics.this, MDefense.class);
        startActivity(intent);
    }

}