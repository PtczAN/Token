package com.example.token2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Book extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
    }
    public void inicio4(View view){
        Intent intent = new Intent(Book.this, Home.class);
        startActivity(intent);
    }
    public void abrirHttp( View view ) {
        Intent intent = new Intent( this, HttpActivity.class);
        startActivity( intent );

    }
    public void abrirHttp2( View view ) {
        Intent intent = new Intent( this, HttpActivity2.class);
        startActivity( intent );

    }
    public void abrirHttp3( View view ) {
        Intent intent = new Intent( this, HttpActivity3.class);
        startActivity( intent );

    }

}