package com.example.token2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import com.example.token2.attributes.Attributes;
import com.example.token2.races.Dwarf;
import com.example.token2.races.Elf;
import com.example.token2.races.Human;
import com.example.token2.races.Tiefling;


import java.util.Random;


public class Token extends AppCompatActivity {
    private SeekBar seekBar;
    private EditText editLevel;
    private TextView textViewLevel;
    private double level;

    Attributes str = new Attributes("Strength", new Random().nextInt(20) + 1);
    Attributes MStr = new Attributes("MStr", 0);

    Attributes con = new Attributes("Constitution", new Random().nextInt(20) + 1);
    Attributes MCon = new Attributes("MCon", 0);

    Attributes dex = new Attributes("Dexterity", new Random().nextInt(20) + 1);
    Attributes MDex = new Attributes("MDex", 0);

    Attributes int2 = new Attributes("Intelligence", new Random().nextInt(20) + 1);
    Attributes MInt2 = new Attributes("MInt2", 0);

    Attributes wis = new Attributes("Wisdom", new Random().nextInt(20) + 1);
    Attributes MWis = new Attributes("MWis", 0);

    Attributes cha = new Attributes("Charisma", new Random().nextInt(20) + 1);
    Attributes MCha = new Attributes("MCha", 0);


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
        TextView valueModS = findViewById(R.id.value_modS);
        valueModS.setText(Integer.toString(MStr.getAmount()));
        TextView valueModC = findViewById(R.id.value_modC);
        valueModC.setText(Integer.toString(MCon.getAmount()));
        TextView valueModD = findViewById(R.id.value_modD);
        valueModD.setText(Integer.toString(MDex.getAmount()));
        TextView valueModI = findViewById(R.id.value_modI);
        valueModI.setText(Integer.toString(MInt2.getAmount()));
        TextView valueModW = findViewById(R.id.value_modW);
        valueModW.setText(Integer.toString(MWis.getAmount()));
        TextView valueModCH = findViewById(R.id.value_modCH);
        valueModCH.setText(Integer.toString(MCha.getAmount()));

        if (str.getAmount() == 1) {
            valueModS.setText(Integer.toString(-5));
        } else if (2 <= str.getAmount() && str.getAmount() <= 3) {
            valueModS.setText(Integer.toString(-4));
        } else if (4 <= str.getAmount() && str.getAmount() <= 5) {
            valueModS.setText(Integer.toString(-3));
        } else if (6 <= str.getAmount() && str.getAmount() <= 7) {
            valueModS.setText(Integer.toString(-2));
        } else if (8 <= str.getAmount() && str.getAmount() <= 9) {
            valueModS.setText(Integer.toString(-1));
        } else if (10 <= str.getAmount() && str.getAmount() <= 11) {
            valueModS.setText(Integer.toString(0));
        } else if (12 <= str.getAmount() && str.getAmount() <= 13) {
            valueModCH.setText(Integer.toString(+1));
        } else if (14 <= str.getAmount() && str.getAmount() <= 15) {
            valueModS.setText(Integer.toString(+2));
        } else if (16 <= str.getAmount() && str.getAmount() <= 17) {
            valueModS.setText(Integer.toString(+3));
        } else if (18 <= str.getAmount() && str.getAmount() <= 19) {
            valueModS.setText(Integer.toString(+4));
        } else if (str.getAmount() == 20) {
            valueModS.setText(Integer.toString(+5));
        }

        if (con.getAmount() == 1) {
            valueModC.setText(Integer.toString(-5));
        } else if (2 <= con.getAmount() && con.getAmount() <= 3) {
            valueModC.setText(Integer.toString(-4));
        } else if (4 <= con.getAmount() && con.getAmount() <= 5) {
            valueModC.setText(Integer.toString(-3));
        } else if (6 <= con.getAmount() && con.getAmount() <= 7) {
            valueModC.setText(Integer.toString(-2));
        } else if (8 <= con.getAmount() && con.getAmount() <= 9) {
            valueModC.setText(Integer.toString(-1));
        } else if (10 <= con.getAmount() && con.getAmount() <= 11) {
            valueModC.setText(Integer.toString(0));
        } else if (12 <= con.getAmount() && con.getAmount() <= 13) {
            valueModC.setText(Integer.toString(+1));
        } else if (14 <= con.getAmount() && con.getAmount() <= 15) {
            valueModC.setText(Integer.toString(+2));
        } else if (16 <= con.getAmount() && con.getAmount() <= 17) {
            valueModC.setText(Integer.toString(+3));
        } else if (18 <= con.getAmount() && con.getAmount() <= 19) {
            valueModC.setText(Integer.toString(+4));
        } else if (con.getAmount() == 20) {
            valueModC.setText(Integer.toString(+5));
        }

        if (dex.getAmount() == 1) {
            valueModD.setText(Integer.toString(-5));
        } else if (2 <= dex.getAmount() && dex.getAmount() <= 3) {
            valueModCH.setText(Integer.toString(-4));
        } else if (4 <= dex.getAmount() && dex.getAmount() <= 5) {
            valueModD.setText(Integer.toString(-3));
        } else if (6 <= dex.getAmount() && dex.getAmount() <= 7) {
            valueModD.setText(Integer.toString(-2));
        } else if (8 <= dex.getAmount() && dex.getAmount() <= 9) {
            valueModD.setText(Integer.toString(-1));
        } else if (10 <= dex.getAmount() && dex.getAmount() <= 11) {
            valueModD.setText(Integer.toString(0));
        } else if (12 <= dex.getAmount() && dex.getAmount() <= 13) {
            valueModD.setText(Integer.toString(+1));
        } else if (14 <= dex.getAmount() && dex.getAmount() <= 15) {
            valueModD.setText(Integer.toString(+2));
        } else if (16 <= dex.getAmount() && dex.getAmount() <= 17) {
            valueModD.setText(Integer.toString(+3));
        } else if (18 <= dex.getAmount() && dex.getAmount() <= 19) {
            valueModD.setText(Integer.toString(+4));
        } else if (dex.getAmount() == 20) {
            valueModD.setText(Integer.toString(+5));
        }

        if (int2.getAmount() == 1) {
            valueModCH.setText(Integer.toString(-5));
        } else if (2 <= int2.getAmount() && int2.getAmount() <= 3) {
            valueModCH.setText(Integer.toString(-4));
        } else if (4 <= int2.getAmount() && int2.getAmount() <= 5) {
            valueModCH.setText(Integer.toString(-3));
        } else if (6 <= int2.getAmount() && int2.getAmount() <= 7) {
            valueModCH.setText(Integer.toString(-2));
        } else if (8 <= int2.getAmount() && int2.getAmount() <= 9) {
            valueModCH.setText(Integer.toString(-1));
        } else if (10 <= int2.getAmount() && int2.getAmount() <= 11) {
            valueModCH.setText(Integer.toString(0));
        } else if (12 <= int2.getAmount() && int2.getAmount() <= 13) {
            valueModCH.setText(Integer.toString(+1));
        } else if (14 <= int2.getAmount() && int2.getAmount() <= 15) {
            valueModCH.setText(Integer.toString(+2));
        } else if (16 <= int2.getAmount() && int2.getAmount() <= 17) {
            valueModCH.setText(Integer.toString(+3));
        } else if (18 <= int2.getAmount() && int2.getAmount() <= 19) {
            valueModCH.setText(Integer.toString(+4));
        } else if (int2.getAmount() == 20) {
            valueModCH.setText(Integer.toString(+5));
        }

        if (wis.getAmount() == 1) {
            valueModW.setText(Integer.toString(-5));
        } else if (2 <= wis.getAmount() && wis.getAmount() <= 3) {
            valueModW.setText(Integer.toString(-4));
        } else if (4 <= wis.getAmount() && wis.getAmount() <= 5) {
            valueModW.setText(Integer.toString(-3));
        } else if (6 <= wis.getAmount() && wis.getAmount() <= 7) {
            valueModW.setText(Integer.toString(-2));
        } else if (8 <= wis.getAmount() && wis.getAmount() <= 9) {
            valueModW.setText(Integer.toString(-1));
        } else if (10 <= wis.getAmount() && wis.getAmount() <= 11) {
            valueModW.setText(Integer.toString(0));
        } else if (12 <= wis.getAmount() && wis.getAmount() <= 13) {
            valueModW.setText(Integer.toString(+1));
        } else if (14 <= wis.getAmount() && wis.getAmount() <= 15) {
            valueModW.setText(Integer.toString(+2));
        } else if (16 <= wis.getAmount() && wis.getAmount() <= 17) {
            valueModW.setText(Integer.toString(+3));
        } else if (18 <= wis.getAmount() && wis.getAmount() <= 19) {
            valueModW.setText(Integer.toString(+4));
        } else if (wis.getAmount() == 20) {
            valueModW.setText(Integer.toString(+5));
        }

        if (cha.getAmount() == 1) {
            valueModCH.setText(Integer.toString(-5));
        } else if (2 <= cha.getAmount() && cha.getAmount() <= 3) {
            valueModCH.setText(Integer.toString(-4));
        } else if (4 <= cha.getAmount() && cha.getAmount() <= 5) {
            valueModCH.setText(Integer.toString(-3));
        } else if (6 <= cha.getAmount() && cha.getAmount() <= 7) {
            valueModCH.setText(Integer.toString(-2));
        } else if (8 <= cha.getAmount() && cha.getAmount() <= 9) {
            valueModCH.setText(Integer.toString(-1));
        } else if (10 <= cha.getAmount() && cha.getAmount() <= 11) {
            valueModCH.setText(Integer.toString(0));
        } else if (12 <= cha.getAmount() && cha.getAmount() <= 13) {
            valueModCH.setText(Integer.toString(+1));
        } else if (14 <= cha.getAmount() && cha.getAmount() <= 15) {
            valueModCH.setText(Integer.toString(+2));
        } else if (16 <= cha.getAmount() && cha.getAmount() <= 17) {
            valueModCH.setText(Integer.toString(+3));
        } else if (18 <= cha.getAmount() && cha.getAmount() <= 19) {
            valueModCH.setText(Integer.toString(+4));
        } else if (cha.getAmount() == 20) {
            valueModCH.setText(Integer.toString(+5));
        }

        String r = getIntent().getStringExtra("r");
        String c = getIntent().getStringExtra("c");
        int c2 = Integer.parseInt(c);
        if (c2 == 1) {
            TextView classes = findViewById(R.id.classes);
            classes.setText("Cleric");
        } else if (c2 == 2) {
            TextView classes = findViewById(R.id.classes);
            classes.setText("Fighter");
        } else if (c2 == 3) {
            TextView classes = findViewById(R.id.classes);
            classes.setText("Ranger");
        } else if (c2 == 4) {
            TextView classes = findViewById(R.id.classes);
            classes.setText("Rogue");
        } else if (c2 == 5) {
            TextView classes = findViewById(R.id.classes);
            classes.setText("Wizard");
        }
        int r2 = Integer.parseInt(r);
        if (r2 == 1) {
            Dwarf dw = new Dwarf();
            ImageView img = findViewById(R.id.img_token);
            img.setImageResource(dw.getImage());
        } else if (r2 == 2) {
            Elf e = new Elf();
            ImageView img = findViewById(R.id.img_token);
            img.setImageResource(e.getImage());
        } else if (r2 == 3) {
            Human hu = new Human();
            ImageView img = findViewById(R.id.img_token);
            img.setImageResource(hu.getImage());
        } else if (r2 == 4) {
            Tiefling t = new Tiefling();
            ImageView img = findViewById(R.id.img_token);
            img.setImageResource(t.getImage());
        }


    }
    public void dice2(View view) {
        Intent intent = new Intent(this, Dice.class);
        startActivity(intent);
    }

    public void inicio(View view) {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
}



