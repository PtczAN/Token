package com.example.token2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.token2.classes.Cleric;
import com.example.token2.classes.Fighter;
import com.example.token2.classes.Ranger;
import com.example.token2.classes.Rogue;
import com.example.token2.classes.Wizard;

public class Classes extends AppCompatActivity {

    int c = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classes);


        Cleric c = new Cleric();
        Fighter f = new Fighter();
        Rogue r = new Rogue();
        Ranger ra = new Ranger();
        Wizard wi = new Wizard();


        ImageView img_cleric = findViewById(R.id.cleric);
        img_cleric.setImageResource(c.getImg());
        Animation an5 = AnimationUtils.loadAnimation(this, R.anim.btn_class_animate);
        ImageView bg5 = findViewById(R.id.bg_name5);
        TextView t5 = findViewById(R.id.name5);
        t5.setText(c.getName());
        t5.setAnimation(an5);
        bg5.setAnimation(an5);
        img_cleric.setAnimation(an5);
        an5.setDuration(1000L);
        an5.start();

        ImageView img_fighter = findViewById(R.id.fighter);
        img_fighter.setImageResource(f.getImg());
        Animation an6 = AnimationUtils.loadAnimation(this, R.anim.btn_class_animate);
        ImageView bg6 = findViewById(R.id.bg_name6);
        TextView t6 = findViewById(R.id.name6);
        t6.setText(f.getName());
        t6.setAnimation(an6);
        bg6.setAnimation(an6);
        img_fighter.setAnimation(an6);
        an6.setDuration(1000L);
        an6.start();

        ImageView img_rogue = findViewById(R.id.rogue);
        img_rogue.setImageResource(r.getImg());
        Animation an7 = AnimationUtils.loadAnimation(this, R.anim.btn_class_animate);
        ImageView bg7 = findViewById(R.id.bg_name7);
        TextView t7 = findViewById(R.id.name7);
        t7.setText(r.getName());
        t7.setAnimation(an7);
        bg7.setAnimation(an7);
        img_rogue.setAnimation(an7);
        an7.setDuration(1500L);
        an7.start();

        ImageView img_ranger = findViewById(R.id.ranger);
        img_ranger.setImageResource(ra.getImg());
        Animation an8 = AnimationUtils.loadAnimation(this, R.anim.btn_class_animate);
        ImageView bg8 = findViewById(R.id.bg_name8);
        TextView t8 = findViewById(R.id.name8);
        t8.setText(ra.getName());
        t8.setAnimation(an8);
        bg8.setAnimation(an8);
        img_ranger.setAnimation(an8);
        an8.setDuration(1500L);
        an8.start();

        ImageView img_wizard = findViewById(R.id.wizard);
        img_wizard.setImageResource(wi.getImg());
        Animation an11 = AnimationUtils.loadAnimation(this, R.anim.btn_class_animate);
        ImageView bg11 = findViewById(R.id.bg_name11);
        TextView t11 = findViewById(R.id.name11);
        t11.setText(wi.getName());
        t11.setAnimation(an11);
        bg11.setAnimation(an11);
        img_wizard.setAnimation(an11);
        an11.setDuration(2000L);
        an11.start();
    }

    public void select_fighter(View view){
        ImageView img_cleric = findViewById(R.id.cleric);
        img_cleric.setAlpha(1f);
        ImageView img_rogue = findViewById(R.id.rogue);
        img_rogue.setAlpha(1f);
        ImageView img_ranger = findViewById(R.id.ranger);
        img_ranger.setAlpha(1f);
        ImageView img_fighter = findViewById(R.id.fighter);
        img_fighter.setAlpha(0.2f);
        ImageView img_wizard = findViewById(R.id.wizard);
        img_wizard.setAlpha(1f);
        c = 2;
    }
    public void select_cleric(View view){
        ImageView img_cleric = findViewById(R.id.cleric);
        img_cleric.setAlpha(0.2f);
        ImageView img_rogue = findViewById(R.id.rogue);
        img_rogue.setAlpha(1f);
        ImageView img_ranger = findViewById(R.id.ranger);
        img_ranger.setAlpha(1f);
        ImageView img_fighter = findViewById(R.id.fighter);
        img_fighter.setAlpha(1f);
        ImageView img_wizard = findViewById(R.id.wizard);
        img_wizard.setAlpha(1f);
        c = 1;
    }
    public void select_rogue(View view){
        ImageView img_cleric = findViewById(R.id.cleric);
        img_cleric.setAlpha(1f);
        ImageView img_rogue = findViewById(R.id.rogue);
        img_rogue.setAlpha(0.2f);
        ImageView img_ranger = findViewById(R.id.ranger);
        img_ranger.setAlpha(1f);
        ImageView img_fighter = findViewById(R.id.fighter);
        img_fighter.setAlpha(1f);
        ImageView img_wizard = findViewById(R.id.wizard);
        img_wizard.setAlpha(1f);
        c = 4;
    }
    public void select_ranger(View view){
        ImageView img_cleric = findViewById(R.id.cleric);
        img_cleric.setAlpha(1f);
        ImageView img_rogue = findViewById(R.id.rogue);
        img_rogue.setAlpha(1f);
        ImageView img_ranger = findViewById(R.id.ranger);
        img_ranger.setAlpha(0.2f);
        ImageView img_fighter = findViewById(R.id.fighter);
        img_fighter.setAlpha(1f);
        ImageView img_wizard = findViewById(R.id.wizard);
        img_wizard.setAlpha(1f);
        c = 3;
    }
    public void select_wizard(View view){
        ImageView img_cleric = findViewById(R.id.cleric);
        img_cleric.setAlpha(1f);
        ImageView img_rogue = findViewById(R.id.rogue);
        img_rogue.setAlpha(1f);
        ImageView img_ranger = findViewById(R.id.ranger);
        img_ranger.setAlpha(1f);
        ImageView img_fighter = findViewById(R.id.fighter);
        img_fighter.setAlpha(1f);
        ImageView img_wizard = findViewById(R.id.wizard);
        img_wizard.setAlpha(0.2f);
        c = 5;
    }
    public void select(View view){
        ImageView img_cleric = findViewById(R.id.cleric);
        ImageView img_rogue = findViewById(R.id.rogue);
        ImageView img_ranger = findViewById(R.id.ranger);
        ImageView img_fighter = findViewById(R.id.fighter);
        ImageView img_wizard = findViewById(R.id.wizard);
        if(img_cleric.getAlpha() != 1f ||  img_rogue.getAlpha() != 1f || img_ranger.getAlpha() != 1f ||  img_fighter.getAlpha() != 1f || img_wizard.getAlpha() != 1f ){
            Intent intent = new Intent(Classes.this, Token.class);
            String r2 = getIntent().getStringExtra("r");
            String c2 = Integer.toString(c);
            intent.putExtra("r", r2);
            intent.putExtra("c", c2);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_down, R.anim.slide_out_down);
        }
    }

}