package com.example.token2.races;

import com.example.token2.R;
import com.example.token2.races.buff.Bonus;

import java.util.ArrayList;
import java.util.List;

public class Tiefling {
    private final String name;
    private final int image;
    private final String alignment;
    private final String age;
    private final String language;
    private final String subrace;
    private final String bonus;
    private final List<Bonus> bonuses;

    public Tiefling() {
        this.name = "Tiefling";
        this.image = R.drawable._f133ae8_16b3_45a1_a212_a4a9c316b7de;
        this.alignment = "Alignment: Tieflings might not have an innate tendency toward evil, but many of them end up there. Evil or not, an independent nature inclines many tieflings toward a chaotic alignment.";
        this.age = "Age: Os tieflings amadurecem na mesma proporção que os humanos, mas vivem mais alguns anos.";
        this.language = "Language: Você pode falar, ler e escrever Comum e Infernal." +
                "Tieflings são aproximadamente do mesmo tamanho e constituição física dos humanos. Seu tamanho é Médio.";
        this.subrace = "Proficiência: Vive de forma arrisca. Você ganha proficiência em sobrevivência." +
                "Visão no escuro: Graças à sua herança infernal, você tem uma visão superior no escuro e na penumbra. Você pode ver na penumbra a até 18 metros de você como se fosse uma luz brilhante, e na escuridão como se fosse uma luz fraca. Você não consegue discernir cores na escuridão, apenas tons de cinza." +
                "Resistência Infernal. Você tem resistência a danos de fogo.";
        this.bonus = "INT - 1     CHA - 2";
        this.bonuses = new ArrayList<Bonus>();
        bonuses.add(new Bonus("INT", 1));
        bonuses.add(new Bonus("CHA", 2));
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
