package com.example.token2.races;

import com.example.token2.R;
import com.example.token2.races.buff.Bonus;

import java.util.ArrayList;
import java.util.List;

public class Human {
    private final String name;
    private final int image;
    private final String alignment;
    private final String age;
    private final String language;
    private final String subrace;
    private final String bonus;
    private final List<Bonus> bonuses;

    public Human() {
        this.name = "Human";
        this.image = R.drawable._b5ee33e_bce5_459f_91b1_a6eed4e920eb;
        this.alignment = "Alignment: Nos cálculos da maioria dos mundos, os humanos são os mais jovens das raças comuns, atrasados \u200B\u200Bpara chegar ao cenário mundial e de vida curta em comparação com anões, elfos e dragões. Talvez seja por causa de suas vidas mais curtas que eles se esforçam para alcançar o máximo que puderem nos anos que lhes são dados. Ou talvez eles sintam que têm algo a provar às raças mais antigas, e é por isso que constroem seus poderosos impérios com base na conquista e no comércio. Seja o que for que os motive, os humanos são os inovadores, os empreendedores e os pioneiros dos mundos.";
        this.age = "Age: Os humanos atingem a idade adulta no final da adolescência e vivem menos de um século.";
        this.language = "Línguas: Você pode falar, ler e escrever Comum e um idioma extra de sua escolha. Os humanos normalmente aprendem as línguas de outros povos com quem lidam, incluindo dialetos obscuros. Eles gostam de polvilhar sua fala com palavras emprestadas de outras línguas.";
        this.subrace = "Velocidade/Caminhada: Sua velocidade básica de caminhada é de 9 metros." +
                "Os humanos variam amplamente em altura e constituição física, de apenas 1,5 metro a bem mais de 1,80 metro de altura. Independentemente da sua posição nessa faixa, seu tamanho é Médio.";
        this.bonus = "ALL - 1" +
                "Proficiência: Ganha proficiência em uma Habilidade de sua escolha.";
        this.bonuses = new ArrayList<Bonus>();
        bonuses.add(new Bonus("ALL", 1));
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public String getAlignment() {
        return alignment;
    }

    public String getAge() {
        return age;
    }

    public String getLanguage() {
        return language;
    }

    public String getSubrace() {
        return subrace;
    }

    public String getBonus() {
        return bonus;
    }

    public List<Bonus> getBonuses() {
        return bonuses;
    }
}
