package com.example.token2.races;

import com.example.token2.R;
import com.example.token2.races.buff.Bonus;

import java.util.ArrayList;
import java.util.List;

public class Dwarf {
    private final String name;
    private final int image;
    private final String alignment;
    private final String age;
    private final String language;
    private final String subrace;
    private final String bonus;
    private final List<Bonus> bonuses;

    public Dwarf() {
        this.name = "Dwarf";
        this.image = R.drawable.cfa5c262_88ad_4360_a6a3_e39216a4199c;
        this.alignment = "Alignment: Reinos ricos em grandeza antiga, salões esculpidos nas raízes das montanhas, o eco de picaretas e martelos em minas profundas e forjas em chamas, um compromisso com o clã e a tradição, e um ódio ardente por goblins e orcs – esses traços comuns unem todos os anões.";
        this.age = "Age: Os anões amadurecem na mesma proporção que os humanos, mas são considerados jovens até atingirem a idade de 50 anos. Em média, vivem cerca de 350 anos. Tamanho: Os anões têm entre 1 e 5 metros de altura e pesam em média cerca de 150 libras. Seu tamanho é Médio.";
        this.language = "Language: Línguas: Você pode falar, ler e escrever Comum e Anão. O anão é cheio de consoantes duras e sons guturais, e essas características se espalham para qualquer outra língua que um anão possa falar.";
        this.subrace = "Velocidade/Caminhada: Sua velocidade básica de caminhada é de 25 pés. Sua velocidade não é reduzida ao usar armadura pesada. " +
                "Proficiência: Você tem vantagem em testes de resistência contra veneno e resistência contra dano de veneno. Sempre que você fizer um teste de Inteligência (História) relacionado à origem do trabalho em pedra, você será considerado proficiente na perícia História e adicionará o dobro do seu bônus de proficiência ao teste, em vez do seu bônus de proficiência normal." +
                "Resistência dos Anões: Seu máximo de pontos de vida aumenta em 1 e aumenta em 1 cada vez que você ganha um nível. ";
        this.bonus = "CON - 2";
        this.bonuses = new ArrayList<Bonus>();
        bonuses.add(new Bonus("CON", 2));
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
