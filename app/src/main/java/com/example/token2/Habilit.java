package com.example.token2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Habilit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_habilit);
    }
    public void inicio6(View view){
        Intent intent = new Intent(Habilit.this, Home.class);
        startActivity(intent);
    }
    public void support2(View view){
        Intent intent = new Intent(Habilit.this, HSupport.class);
        startActivity(intent);
    }
    public void attack2(View view) {
        Intent intent = new Intent(Habilit.this, HAttack.class);
        startActivity(intent);
    }
    public void defense2(View view) {
        Intent intent = new Intent(Habilit.this, HDefense.class);
        startActivity(intent);
    }
}