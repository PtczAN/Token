package com.example.token2;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HSupport extends AppCompatActivity {
    private static String HS1;
    private static String HS2;
    private static String HS3;
    private static String HS4;
    private static String HS5;
    private static String HS6;
    private static String HS7;
    private static String HS8;
    private static String HS9;

    public HSupport() {
        this.HS1 = "Habilidade Suporte nivel 1 e 2" +
                "Inspiração Bárdica Nível 1:" +
                "Conhecimento Arcano" +
                "Perícia Nível 1";
        this.HS2 = "Habilidade Suporte nivel 3 e 4" +
                "Inspiração Mágica" +
                "Especialização Nível 1" +
                "Atleta Notável" +
                "Ação Astuta Nível 1";
        this.HS3 = "Habilidade Suporte nivel 5 e 6" +
                "Versatilidade de Bardo:" +
                "Canção de Descanso Nível 1:" +
                "Perícia Nível 2" +
                "Mira Firme" +
                "Destruir Morto-vivo Nível 1";
        this.HS4 = "Habilidade Suporte nivel 7 e 8" +
                "Inspiração Bárdica Nível 2" +
                "Desempenho Fascinante";
        this.HS5 = "Habilidade Suporte nivel 9 e 10" +
                "Discurso Universal" +
                "Hipocrisia de Ladrão:" +
                "Perícia Nível 3" +
                "Canção de Descanso Nível 2";
        this.HS6 = "Habilidade Suporte nivel 11, 12 e 13" +
                "Segredos Mágicos:" +
                "Inspiração Bárdica Nível 3" +
                "Especialização Nível 2" +
                "Ação Astuta Nível 2" +
                "Mão Rápidas" +
                "Destruir Morto-vivo Nível 2" +
                "Espreitada Suprema";
        this.HS7 = "Habilidade Suporte nivel 14 e 15" +
                "Habilidade Incomparável" +
                "Palavras Pertubadoras" +
                "Reflexos do Ladrão" +
                "Perícia Nível 4" +
                "Destruir Morto-vivo Nível 3";
        this.HS8 = "Habilidade Suporte nivel 16 e 17" +
                "Inspiração Contagiosa" +
                "Canção de Descanso Nível 3" +
                "Sentido Cego" +
                "Coroa de Luz";
        this.HS9 = "Habilidade Suporte nivel 18, 19 e 20" +
                "Segredos Mágicos Adicionais" +
                "Inspiração Superior" +
                "Especialista" +
                "Perícia Nível 5"+
                "Engenhoso" +
                "Cura Suprema" +
                "Intervenção Divina Melhorada" +
                "Divinação";

    }
    public static String getHS1() {
        return HS1;
    }
    public static String getHS2() {
        return HS2;
    }
    public static String getHS3() {
        return HS3;
    }
    public static String getHS4() {
        return HS4;
    }
    public static String getHS5() {
        return HS5;
    }
    public static String getHS6() {
        return HS6;
    }
    public static String getHS7() {
        return HS7;
    }
    public static String getHS8() {
        return HS8;
    }
    public static String getHS9() {
        return HS9;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hsupport);



        TextView HS1 = findViewById(R.id.HS1);
        HS1.setText(HAttack.getHA1());
        HS1.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView HS2 = findViewById(R.id.HS2);
        HS2.setText(HAttack.getHA2());
        HS2.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView HS3 = findViewById(R.id.HS3);
        HS3.setText(HAttack.getHA3());
        HS3.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView HS4 = findViewById(R.id.HS4);
        HS4.setText(HAttack.getHA4());
        HS4.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView HS5 = findViewById(R.id.HS5);
        HS5.setText(HAttack.getHA5());
        HS5.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView HS6 = findViewById(R.id.HS6);
        HS6.setText(HAttack.getHA6());
        HS6.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView HS7 = findViewById(R.id.HS7);
        HS7.setText(HAttack.getHA7());
        HS7.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView HS8 = findViewById(R.id.HS8);
        HS8.setText(HAttack.getHA8());
        HS8.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView HS9 = findViewById(R.id.HS9);
        HS9.setText(HAttack.getHA9());
        HS9.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);



    }
    public void inicio14(View view) {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
}