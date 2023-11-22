package com.example.token2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.token2.attributes.Attributes;

import com.example.token2.races.Dwarf;
import com.example.token2.races.Elf;

import com.example.token2.races.Human;
import com.example.token2.races.Tiefling;

import java.util.Random;

public class Token extends AppCompatActivity {

    Attributes str = new Attributes ("Strength", new Random().nextInt(20)+1);

    Attributes con = new Attributes("Constitution",  new Random().nextInt(20)+1);

    Attributes dex = new Attributes("Dexterity",  new Random().nextInt(20)+1);

    Attributes int2 = new Attributes("Intelligence",  new Random().nextInt(20)+1);

    Attributes wis = new Attributes("Wisdom",  new Random().nextInt(20)+1);

    Attributes cha = new Attributes("Charisma",  new Random().nextInt(20)+1);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_token);
        TextView textView = findViewById(R.id.STR);
        textView.setText(str.getAtt());
        TextView textView2 = findViewById(R.id.CON);
        textView2.setText(con.getAtt());
        TextView textView3 = findViewById(R.id.DEX);
        textView3.setText(dex.getAtt());
        TextView textView4 = findViewById(R.id.INT);
        textView4.setText(int2.getAtt());
        TextView textView5 = findViewById(R.id.WIS);
        textView5.setText(wis.getAtt());
        TextView textView6 = findViewById(R.id.CHA);
        textView6.setText(cha.getAtt());


        TextView valueStr = findViewById(R.id.value_str);
        valueStr.setText(Integer.toString(str.getAmount()));
        TextView valueCon = findViewById(R.id.value_con);
        valueCon.setText(Integer.toString(con.getAmount()));
        TextView valueDex = findViewById(R.id.value_dex);
        valueDex.setText(Integer.toString(dex.getAmount()));
        TextView valueInt = findViewById(R.id.value_int);
        valueInt.setText(Integer.toString(int2.getAmount()));
        TextView valueWis = findViewById(R.id.value_wis);
        valueWis.setText(Integer.toString(wis.getAmount()));
        TextView valueCha = findViewById(R.id.value_cha);
        valueCha.setText(Integer.toString(cha.getAmount()));

        String r = getIntent().getStringExtra("r");
        String c = getIntent().getStringExtra("c");
        int c2 = Integer.parseInt(c);
        if(c2 == 1){
            TextView classes = findViewById(R.id.classes);
            classes.setText("Cleric");
        }else if(c2 == 2){
            TextView classes = findViewById(R.id.classes);
            classes.setText("Fighter");
        }else if(c2 == 3){
            TextView classes = findViewById(R.id.classes);
            classes.setText("Ranger");
        }else if(c2 == 4){
            TextView classes = findViewById(R.id.classes);
            classes.setText("Rogue");
        }else if(c2 == 5){
            TextView classes = findViewById(R.id.classes);
            classes.setText("Wizard");
        }
        int r2 = Integer.parseInt(r);
        if(r2 == 1) {
            Dwarf dw = new Dwarf();
            ImageView img = findViewById(R.id.img_token);
            img.setImageResource(dw.getImage());
        }else if (r2 == 2) {
            Elf e = new Elf();
            ImageView img = findViewById(R.id.img_token);
            img.setImageResource(e.getImage());
        }
        else if (r2 == 3) {
            Human hu = new Human();
            ImageView img = findViewById(R.id.img_token);
            img.setImageResource(hu.getImage());
        }else if (r2 == 4) {
            Tiefling t = new Tiefling();
            ImageView img = findViewById(R.id.img_token);
            img.setImageResource(t.getImage());
        }





    }
      public void inicio(View view){
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
        }
}