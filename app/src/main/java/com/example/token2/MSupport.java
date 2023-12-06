package com.example.token2;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MSupport extends AppCompatActivity {
    private static String MS1;
    private static String MS2;
    private static String MS3;
    private static String MS4;
    private static String MS5;
    private static String MS6;
    private static String MS7;
    private static String MS8;
    private static String MS9;

    public MSupport() {
        this.MS1 = "Magia de Suporte nivel 1\n" +
                "Sword Burst\tConjuration\t1 Action\tSelf (5-foot radius)\tInstantaneous\n " +
                " Create Bonfire\tConjuration\t1 Action\t60 Feet\tConcentration, up to 1 minute\n" +
                "Tenser's Floating Disk\tConjuration\t1 Action \t30 feet\t1 hour\n" +
                "Mage Hand\tConjuration\t1 Action\t30 feet\t1 minute\n" +
                "Healing Elixir (UA)\tConjuration\t1 Minute\tSelf\t24 hours\n";
        this.MS2 = "Magia de Suporte nivel 2\n" +
                "Air Bubble\tConjuration\t1 Action\t60 Feet\t24 hours\n" +
                "Wristpocket\tConjuration \t1 Action \tSelf\tConcentration, up to 1 hour\n";
        this.MS3 = "Magia de Suporte nivel 3\n" +
                "";
        this.MS4 = "Magia de Suporte nivel 4\n" +
                "Conjure Minor Elementals\tConjuration\t1 Minute\t90 feet\tConcentration, up to 1 hour\n" +
                "Dimension Door\tConjuration\t1 Action\t500 feet\tInstantaneous\n" +
                "Galder's Speedy Courier\tConjuration\t1 Action\t10 feet\t10 minutes\n" +
                "Summon Elemental\tConjuration\t1 Action\t90 feet\tConcentration, up to 1 hour\n";
        this.MS5 = "Magia de Suporte nivel 5\n" +
                "Conjure Elemental\tConjuration\t1 Action\t90 feet\tConcentration, up to 1 hour\n" +
                "Teleportation Circle\tConjuration\t1 Minute\t10 feet\t1 round\n";
        this.MS6 = "Magia de Suporte nivel 6\n" +
                "";
        this.MS7 = "Magia de Suporte nivel 7\n" +
                "Plane Shift\tConjuration\t1 Action\tTouch\tInstantaneous\n";
        this.MS8 = "Magia de Suporte nivel 8\n" +
                "Teleport\tConjuration\t1 Action\t10 feet\tInstantaneous\n"
                ;
        this.MS9 = "Magia de Suporte nivel 9\n" +
                "Gate\tConjuration\t1 Action\t60 feet\tConcentration, up to 1 minute\n" +
                "Wish\tConjuration\t1 Action\tSelf\tInstantaneous\n";

    }
    public static String getMS1() {
        return MS1;
    }
    public static String getMS2() {
        return MS2;
    }
    public static String getMS3() {
        return MS3;
    }
    public static String getMS4() {
        return MS4;
    }
    public static String getMS5() {
        return MS5;
    }
    public static String getMS6() {
        return MS6;
    }
    public static String getMS7() {
        return MS7;
    }
    public static String getMS8() {
        return MS8;
    }
    public static String getMS9() {
        return MS9;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msupport);



        TextView MS1 = findViewById(R.id.MS1);
        MS1.setText(MSupport.getMS1());
        MS1.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView MS2 = findViewById(R.id.MS2);
        MS2.setText(MSupport.getMS2());
        MS2.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView MD3 = findViewById(R.id.MS3);
        MD3.setText(MSupport.getMS3());
        MD3.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView MS4 = findViewById(R.id.MS4);
        MS4.setText(MSupport.getMS4());
        MS4.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView MS5 = findViewById(R.id.MS5);
        MS5.setText(MSupport.getMS5());
        MS5.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView MS6 = findViewById(R.id.MS6);
        MS6.setText(MSupport.getMS6());
        MS6.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView MS7 = findViewById(R.id.MS7);
        MS7.setText(MSupport.getMS7());
        MS7.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView MS8 = findViewById(R.id.MS8);
        MS8.setText(MSupport.getMS8());
        MS8.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView MS9 = findViewById(R.id.MS9);
        MS9.setText(MSupport.getMS9());
        MS9.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);



    }
    public void inicio13(View view) {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
}