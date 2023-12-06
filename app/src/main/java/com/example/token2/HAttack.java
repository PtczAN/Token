package com.example.token2;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import com.example.token2.races.Elf;

public class HAttack extends AppCompatActivity {
    private static String HA1;
    private static String HA2;
    private static String HA3;
    private static String HA4;
    private static String HA5;
    private static String HA6;
    private static String HA7;
    private static String HA8;
    private static String HA9;

    public HAttack() {
        this.HA1 = "Habilidade de Ataque nivel 1 e 2" +
                "Ataque Furtivo:você sabe como atacar sutilmente e explorar a distração do inimigo. Uma vez por turno, você pode causar 1d6 de dano extra a uma criatura que você atingiu com um ataque se tiver vantagem na jogada de ataque" +
                "Perícia Nível 1:" +
                "Estilo de combate Principal:" +
                "Surto de Ação Nível 1: "+
                "";
        this.HA2 = "Habilidade de Ataque nivel 3 e 4" +
                "Ataque Extra Nível 2:você pode atacar três vezes, em vez de uma, sempre que realizar a ação de Ataque no seu turno." +
                "Ataque Extra Nível 3:você pode atacar quatro vezes, em vez de uma, sempre que realizar a ação de Ataque no seu turno." +
                "Crítico Melhorado Nível 2\tseus ataques com armas obtêm um acerto crítico em uma rolagem de 18 até 20." +
                "";
        this.HA3 = "Habilidade de Ataque nivel 5 e 6" +
                "Crítico Melhorado Nível 3\tseus ataques com armas obtêm um acerto crítico em uma rolagem de 17 até 20.\n";
        this.HA4 = "Habilidade de Ataque nivel 7 e 8" +
                "";
        this.HA5 = "Habilidade de Ataque nivel 9 e 10" +
                "";
        this.HA6 = "Habilidade de Ataque nivel 11, 12 e 13" +
                "";
        this.HA7 = "Habilidade de Ataque nivel 14 e 15" +
                "";
        this.HA8 = "Habilidade de Ataque nivel 16 e 17" +
                "";
        this.HA9 = "Habilidade de Ataque nivel 18, 19 e 20" +
                "Golpe de Sorte:";

    }
    public static String getHA1() {
        return HA1;
    }
    public static String getHA2() {
        return HA2;
    }
    public static String getHA3() {
        return HA3;
    }
    public static String getHA4() {
        return HA4;
    }
    public static String getHA5() {
        return HA5;
    }
    public static String getHA6() {
        return HA6;
    }
    public static String getHA7() {
        return HA7;
    }
    public static String getHA8() {
        return HA8;
    }
    public static String getHA9() {
        return HA9;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hattack);



        TextView HA1 = findViewById(R.id.HA1);
        HA1.setText(HAttack.getHA1());
        HA1.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView HA2 = findViewById(R.id.HA2);
        HA2.setText(HAttack.getHA2());
        HA2.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView HA3 = findViewById(R.id.HA3);
        HA3.setText(HAttack.getHA3());
        HA3.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView HA4 = findViewById(R.id.HA4);
        HA4.setText(HAttack.getHA4());
        HA4.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView HA5 = findViewById(R.id.HA5);
        HA5.setText(HAttack.getHA5());
        HA5.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView HA6 = findViewById(R.id.HA6);
        HA6.setText(HAttack.getHA6());
        HA6.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView HA7 = findViewById(R.id.HA7);
        HA7.setText(HAttack.getHA7());
        HA7.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView HA8 = findViewById(R.id.HA8);
        HA8.setText(HAttack.getHA8());
        HA8.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView HA9 = findViewById(R.id.HA9);
        HA9.setText(HAttack.getHA9());
        HA9.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

    }
    public void inicio10(View view) {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
}