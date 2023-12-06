package com.example.token2;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HDefense extends AppCompatActivity {
    private static String HD1;
    private static String HD2;
    private static String HD3;
    private static String HD4;
    private static String HD5;
    private static String HD6;
    private static String HD7;
    private static String HD8;
    private static String HD9;

    public HDefense() {
        this.HD1 = "Habilidade Defensiva nivel 1 e 2" +
                "";
        this.HD2 = "Habilidade Defensiva nivel 3 e 4" +
                "";
        this.HD3 = "Habilidade Defensiva nivel 5 e 6" +
                "";
        this.HD4 = "Habilidade Defensiva nivel 7 e 8" +
                "Esquiva Sobrenatural:" +
                "Evasão:";
        this.HD5 = "Habilidade Defensiva nivel 9 e 10" +
                "";
        this.HD6 = "Habilidade Defensiva nivel 11, 12 e 13" +
                "";
        this.HD7 = "Habilidade Defensiva nivel 14 e 15" +
                "";
        this.HD8 = "Habilidade Defensiva nivel 16 e 17" +
                "Sinalizador de Proteção" +
                "";
        this.HD9 = "Habilidade Defensiva nivel 18, 19 e 20" +
                "";

    }
    public static String getHD1() {
        return HD1;
    }
    public static String getHD2() {
        return HD2;
    }
    public static String getHD3() {
        return HD3;
    }
    public static String getHD4() {
        return HD4;
    }
    public static String getHD5() {
        return HD5;
    }
    public static String getHD6() {
        return HD6;
    }
    public static String getHD7() {
        return HD7;
    }
    public static String getHD8() {
        return HD8;
    }
    public static String getHD9() {
        return HD9;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hdefense);



        TextView HD1 = findViewById(R.id.HD1);
        HD1.setText(HDefense.getHD1());
        HD1.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView HD2 = findViewById(R.id.HD2);
        HD2.setText(HDefense.getHD2());
        HD2.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView HD3 = findViewById(R.id.HD3);
        HD3.setText(HDefense.getHD3());
        HD3.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView HD4 = findViewById(R.id.HA4);
        HD4.setText(HDefense.getHD4());
        HD4.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView HD5 = findViewById(R.id.HD5);
        HD5.setText(HDefense.getHD5());
        HD5.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView HD6 = findViewById(R.id.HD6);
        HD6.setText(HDefense.getHD6());
        HD6.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView HD7 = findViewById(R.id.HD7);
        HD7.setText(HDefense.getHD7());
        HD7.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView HD8 = findViewById(R.id.HD8);
        HD8.setText(HDefense.getHD8());
        HD8.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView HD9 = findViewById(R.id.HD9);
        HD9.setText(HDefense.getHD9());
        HD9.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);


    }
    public void inicio11(View view) {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
}