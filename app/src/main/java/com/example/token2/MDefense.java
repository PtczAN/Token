package com.example.token2;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MDefense extends AppCompatActivity {
    private static String MD1;
    private static String MD2;
    private static String MD3;
    private static String MD4;
    private static String MD5;
    private static String MD6;
    private static String MD7;
    private static String MD8;
    private static String MD9;

    public MDefense() {
        this.MD1 = "Magia de Defesa nivel 1\n" +
                "Fog Cloud\tConjuration\t1 Action\t120 feet\tConcentration, up to 1 hour\n" +
                "Grease\tConjuration\t1 Action\t60 feet\t1 minute\n";
        this.MD2 = "Magia de Defesa nivel 2\n" +
                "Misty Step\tConjuration\t1 Bonus Action\tSelf\tInstantaneous\n" +
                "Dust Devil\tConjuration\t1 Action\t60 feet\tConcentration, up to 1 minute\n";
        this.MD3 = "Magia de Defesa nivel 3\n" +
                "Stinking Cloud\tConjuration\t1 Action\t90 feet\tConcentration, up to 1 minute\n";
        this.MD4 = "Magia de Defesa nivel 4\n" +
                "";
        this.MD5 = "Magia de Defesa nivel 5\n" +
                "";
        this.MD6 = "Magia de Defesa nivel 6\n" +
                "Scatter\tConjuration\t1 Action\t30 feet\tInstantaneous\n";
        this.MD7 = "Magia de Defesa nivel 7\n" +
                "Demiplane\tConjuration\t1 Action\t60 feet\t1 hour\n" +
                "";
        this.MD8 = "Magia de Defesa nivel 8\n" +
                "Maze\tConjuration\t1 Action\t60 feet\tConcentration, up to 10 minutes\n";
        this.MD9 = "Magia de Defesa nivel 9\n" +
                "";

    }
    public static String getMD1() {
        return MD1;
    }
    public static String getMD2() {
        return MD2;
    }
    public static String getMD3() {
        return MD3;
    }
    public static String getMD4() {
        return MD4;
    }
    public static String getMD5() {
        return MD5;
    }
    public static String getMD6() {
        return MD6;
    }
    public static String getMD7() {
        return MD7;
    }
    public static String getMD8() {
        return MD8;
    }
    public static String getMD9() {
        return MD9;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mdefense);



        TextView MD1 = findViewById(R.id.MD1);
        MD1.setText(MDefense.getMD1());
        MD1.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView MD2 = findViewById(R.id.MD2);
        MD2.setText(MDefense.getMD2());
        MD2.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView MD3 = findViewById(R.id.MD3);
        MD3.setText(MDefense.getMD3());
        MD3.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView MD4 = findViewById(R.id.MD4);
        MD4.setText(MDefense.getMD4());
        MD4.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView MD5 = findViewById(R.id.MD5);
        MD5.setText(MDefense.getMD5());
        MD5.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView MD6 = findViewById(R.id.MD6);
        MD6.setText(MDefense.getMD6());
        MD6.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView MD7 = findViewById(R.id.MD7);
        MD7.setText(MDefense.getMD7());
        MD7.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView MD8 = findViewById(R.id.MD8);
        MD8.setText(MDefense.getMD8());
        MD8.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView MD9 = findViewById(R.id.MD9);
        MD9.setText(MDefense.getMD9());
        MD9.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);



    }
    public void inicio12(View view) {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
}