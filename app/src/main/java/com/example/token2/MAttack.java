package com.example.token2;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MAttack extends AppCompatActivity {
    private static String MA1;
    private static String MA2;
    private static String MA3;
    private static String MA4;
    private static String MA5;
    private static String MA6;
    private static String MA7;
    private static String MA8;
    private static String MA9;

    public MAttack() {
        this.MA1 = "Magia de Ataque nivel 1\n" +
                "Acid Splash\tConjuration\t1 Action\t60 Feet\tInstantaneous\n" +
                "Infestation\tConjuration\t1 Action\t30 feet\tInstantaneous\n" +
                "Ice Knife\tConjuration\t1 Action\t60 feet\tInstantaneous\n";
        this.MA2 = "Magia de Ataque nivel 2\n" +
                "Cloud of Daggers\tConjuration\t1 Action\t60 feet\tConcentration, up to 1 minute\n" +
                "Flaming Sphere\tConjuration\t1 Action\t60 feet\tConcentration, up to 1 minute\n" +
                "Vortex Warp\tConjuration\t1 Action\t90 feet\tInstantaneous\n";
        this.MA3 = "Magia de Ataque nivel 3\n" +
                "Conjure Lesser Demon (UA)\tConjuration\t1 Action\t60 feet\tConcentration, up to 1 hour\n" +
                "Sleet Storm\tConjuration\t1 Action\t120 feet\tConcentration, up to 1 minute\n" +
                "Thunder Step\tConjuration\t1 Action\t90 feet\tInstantaneous\n" +
                "Tidal Wave\tConjuration\t1 Action\t120 feet\tInstantaneous\n";
        this.MA4 = "Magia de Ataque nivel 4\n" +
                "Evard's Black Tentacles\tConjuration\t1 Action\t90 feet\tConcentration, up to 1 minute\n" +
                "Watery Sphere\tConjuration\t1 Action\t90 feet\tConcentration, up to 1 minute\n";
        this.MA5 = "Magia de Ataque nivel 5\n" +
                "Infernal Calling\tConjuration\t1 Minute\t90 feet\tConcentration, up to 1 hour\n" +
                "Steel Wind Strike\tConjuration\t1 Action\t30 feet\tInstantaneous\n";
        this.MA6 = "Magia de Ataque nivel 6\n" +
                "Arcane Gate\tConjuration\t1 Action\t500 feet\tConcentration, up to 10 minutes\n";
        this.MA7 = "Magia de Ataque nivel 7\n" +
                "Dream of the Blue Veil\tConjuration\t10 minutes\t20 feet\t6 hours\n";
        this.MA8 = "Magia de Ataque nivel 8\n" +
                "Incendiary Cloud\tConjuration\t1 Action\t150 feet\tConcentration, up to 1 minute\n" +
                "Mighty Fortress\tConjuration\t1 Minute\t1 mile\tInstantaneous\n" +
                "Reality Break\tConjuration DC\t1 Action\t60 feet\tConcentration, up to 1 minute\n";
        this.MA9 = "Magia de Ataque nivel 9\n" +
                "Blade of Disaster\tConjuration\t1 Bonus Action\t60 feet\tConcentration, up to 1 minute\n";

    }
    public static String getMA1() {
        return MA1;
    }
    public static String getMA2() {
        return MA2;
    }
    public static String getMA3() {
        return MA3;
    }
    public static String getMA4() {
        return MA4;
    }
    public static String getMA5() {
        return MA5;
    }
    public static String getMA6() {
        return MA6;
    }
    public static String getMA7() {
        return MA7;
    }
    public static String getMA8() {
        return MA8;
    }
    public static String getMA9() {
        return MA9;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mattack);



        TextView MA1 = findViewById(R.id.MA1);
        MA1.setText(MAttack.getMA1());
        MA1.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView MA2 = findViewById(R.id.MA2);
        MA2.setText(MAttack.getMA2());
        MA2.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView MA3 = findViewById(R.id.MA3);
        MA3.setText(MAttack.getMA3());
        MA3.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView MA4 = findViewById(R.id.MA4);
        MA4.setText(MAttack.getMA4());
        MA4.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView MA5 = findViewById(R.id.MA5);
        MA5.setText(MAttack.getMA5());
        MA5.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView MA6 = findViewById(R.id.MA6);
        MA6.setText(MAttack.getMA6());
        MA6.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView MA7 = findViewById(R.id.MA7);
        MA7.setText(MAttack.getMA7());
        MA7.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView MA8 = findViewById(R.id.MA8);
        MA8.setText(MAttack.getMA8());
        MA8.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView MA9 = findViewById(R.id.MA9);
        MA9.setText(MAttack.getMA9());
        MA9.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);



    }
    public void inicio15(View view) {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
}