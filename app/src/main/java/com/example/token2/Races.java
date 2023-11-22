package com.example.token2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.token2.races.Dwarf;
import com.example.token2.races.Elf;
import com.example.token2.races.Human;
import com.example.token2.races.Tiefling;

public class Races extends AppCompatActivity {

    int i = 0;
    int r = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_races);

        Elf elf = new Elf();

        TextView name = findViewById(R.id.name);
        name.setText(elf.getName());

        ImageView img = findViewById(R.id.image_race);
        img.setImageResource(elf.getImage());

        TextView alignment = findViewById(R.id.alignment);
        alignment.setText(elf.getAlignment());
        alignment.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView age = findViewById(R.id.age);
        age.setText(elf.getAge());
        age.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView language = findViewById(R.id.language);
        language.setText(elf.getLanguage());
        language.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView subrace = findViewById(R.id.subrace);
        subrace.setText(elf.getSubrace());
        subrace.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView bonus = findViewById(R.id.bonus);
        bonus.setText(elf.getBonus());
        bonus.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        Button b = findViewById(R.id.back);
        b.setVisibility(View.INVISIBLE);
        r = 2;
    }

    public void back(View view){
        i--;
        if(i == 0){
            Button b = findViewById(R.id.back);
            b.setVisibility(View.INVISIBLE);
            Elf elf = new Elf();

            TextView name = findViewById(R.id.name);
            name.setText(elf.getName());

            ImageView img = findViewById(R.id.image_race);
            img.setImageResource(elf.getImage());

            TextView alignment = findViewById(R.id.alignment);
            alignment.setText(elf.getAlignment());
            alignment.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView age = findViewById(R.id.age);
            age.setText(elf.getAge());
            age.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView language = findViewById(R.id.language);
            language.setText(elf.getLanguage());
            language.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView subrace = findViewById(R.id.subrace);
            subrace.setText(elf.getSubrace());
            subrace.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView bonus = findViewById(R.id.bonus);
            bonus.setText(elf.getBonus());
            bonus.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            r = 2;
        }else if(i == 1){
            Dwarf dwarf = new Dwarf();
            TextView name = findViewById(R.id.name);
            name.setText(dwarf.getName());

            ImageView img = findViewById(R.id.image_race);
            img.setImageResource(dwarf.getImage());

            TextView alignment = findViewById(R.id.alignment);
            alignment.setText(dwarf.getAlignment());
            alignment.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView age = findViewById(R.id.age);
            age.setText(dwarf.getAge());
            age.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView language = findViewById(R.id.language);
            language.setText(dwarf.getLanguage());
            language.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView subrace = findViewById(R.id.subrace);
            subrace.setText(dwarf.getSubrace());
            subrace.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView bonus = findViewById(R.id.bonus);
            bonus.setText(dwarf.getBonus());
            bonus.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            r = 1;
        }
        else if(i == 2){
            Tiefling tiefling = new Tiefling();
            TextView name = findViewById(R.id.name);
            name.setText(tiefling.getName());

            ImageView img = findViewById(R.id.image_race);
            img.setImageResource(tiefling.getImage());

            TextView alignment = findViewById(R.id.alignment);
            alignment.setText(tiefling.getAlignment());
            alignment.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView age = findViewById(R.id.age);
            age.setText(tiefling.getAge());
            age.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView language = findViewById(R.id.language);
            language.setText(tiefling.getLanguage());
            language.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView subrace = findViewById(R.id.subrace);
            subrace.setText(tiefling.getSubrace());
            subrace.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView bonus = findViewById(R.id.bonus);
            bonus.setText(tiefling.getBonus());
            bonus.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            Button b = findViewById(R.id.next);
            b.setVisibility(View.VISIBLE);
            r = 4;
        }else if(i == 3) {
            Human human = new Human();
            TextView name = findViewById(R.id.name);
            name.setText(human.getName());

            ImageView img = findViewById(R.id.image_race);
            img.setImageResource(human.getImage());

            TextView alignment = findViewById(R.id.alignment);
            alignment.setText(human.getAlignment());
            alignment.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView age = findViewById(R.id.age);
            age.setText(human.getAge());
            age.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView language = findViewById(R.id.language);
            language.setText(human.getLanguage());
            language.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView subrace = findViewById(R.id.subrace);
            subrace.setText(human.getSubrace());
            subrace.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView bonus = findViewById(R.id.bonus);
            bonus.setText(human.getBonus());
            bonus.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            r = 3;
        }
    }
    public void next(View view){
        i++;
        if(i == 1){
            Button b = findViewById(R.id.back);
            b.setVisibility(View.VISIBLE);
            Dwarf dwarf = new Dwarf();
            TextView name = findViewById(R.id.name);
            name.setText(dwarf.getName());

            ImageView img = findViewById(R.id.image_race);
            img.setImageResource(dwarf.getImage());

            TextView alignment = findViewById(R.id.alignment);
            alignment.setText(dwarf.getAlignment());
            alignment.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView age = findViewById(R.id.age);
            age.setText(dwarf.getAge());
            age.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView language = findViewById(R.id.language);
            language.setText(dwarf.getLanguage());
            language.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView subrace = findViewById(R.id.subrace);
            subrace.setText(dwarf.getSubrace());
            subrace.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView bonus = findViewById(R.id.bonus);
            bonus.setText(dwarf.getBonus());
            bonus.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            r = 2;
        }else if(i == 2){
            Tiefling tiefling = new Tiefling();
            TextView name = findViewById(R.id.name);
            name.setText(tiefling.getName());

            ImageView img = findViewById(R.id.image_race);
            img.setImageResource(tiefling.getImage());

            TextView alignment = findViewById(R.id.alignment);
            alignment.setText(tiefling.getAlignment());
            alignment.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView age = findViewById(R.id.age);
            age.setText(tiefling.getAge());
            age.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView language = findViewById(R.id.language);
            language.setText(tiefling.getLanguage());
            language.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView subrace = findViewById(R.id.subrace);
            subrace.setText(tiefling.getSubrace());
            subrace.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView bonus = findViewById(R.id.bonus);
            bonus.setText(tiefling.getBonus());
            bonus.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            r = 4;
        }else if(i == 3){
            Button b = findViewById(R.id.next);
            b.setVisibility(View.INVISIBLE);
            Human human = new Human();
            TextView name = findViewById(R.id.name);
            name.setText(human.getName());

            ImageView img = findViewById(R.id.image_race);
            img.setImageResource(human.getImage());

            TextView alignment = findViewById(R.id.alignment);
            alignment.setText(human.getAlignment());
            alignment.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView age = findViewById(R.id.age);
            age.setText(human.getAge());
            age.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView language = findViewById(R.id.language);
            language.setText(human.getLanguage());
            language.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView subrace = findViewById(R.id.subrace);
            subrace.setText(human.getSubrace());
            subrace.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView bonus = findViewById(R.id.bonus);
            bonus.setText(human.getBonus());
            bonus.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            r = 3;
        }
    }

    public void select(View view){
        Intent intent = new Intent(Races.this, Classes.class);
        String r2 = Integer.toString(r);
        intent.putExtra("r", r2);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
    }
}