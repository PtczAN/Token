package com.example.token2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Magic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magic);
    }
    public void inicio3(View view){
        Intent intent = new Intent(Magic.this, Home.class);
        startActivity(intent);
    }
    public void magias(View view){
        Intent intent = new Intent(Magic.this, Magics.class);
        startActivity(intent);
    }
    public void habilidades(View view){
        Intent intent = new Intent(Magic.this, Habilit.class);
        startActivity(intent);
    }
}