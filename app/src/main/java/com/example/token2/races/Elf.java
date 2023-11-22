package com.example.token2.races;

import com.example.token2.R;
import com.example.token2.races.buff.Bonus;

import java.util.ArrayList;
import java.util.List;

public class Elf {
    private final String name;
    private final int image;
    private final String alignment;
    private final String age;
    private final String language;
    private final String subrace;
    private final String bonus;
    private final List<Bonus> bonuses;

    public Elf() {
        this.name = "Elf";
        this.image = R.drawable.fbea5c4d_2323_45f3_9a97_3b62a18f1a1d;
        this.alignment = "Alignment: Elfos são um povo mágico de graça sobrenatural, vivendo em lugares de beleza etérea, no meio de florestas antigas ou em torres prateadas brilhando com a luz das fadas, onde uma música suave flutua no ar e fragrâncias suaves flutuam na brisa. Os elfos amam a natureza e a magia, a arte e o talento artístico, a música e a poesia.";
        this.age = "Age: Embora os elfos atinjam a maturidade física aproximadamente na mesma idade que os humanos, a compreensão élfica da idade adulta vai além do crescimento físico para abranger a experiência mundana. Um elfo normalmente reivindica a idade adulta e um nome adulto por volta dos 100 anos de idade e pode viver até os 750 anos." +
                "Os elfos variam de menos de 1,5 a mais de 1,80 metro de altura e têm constituição esbelta. Seu tamanho é Médio.";
        this.language = "Línguas: Você pode falar, ler e escrever Comum e Élfico.";
        this.subrace = "Velocidade/Caminhada: Sua velocidade básica de caminhada é de 9 metros." +
                "Proficiência: Tem sentidos aguçados recebendo proficiência na habilidade Percepção." +
                "Visão no escuro: Acostumado às florestas crepusculares e ao céu noturno, você tem uma visão superior no escuro e na penumbra. Você pode ver na penumbra a até 18 metros de você como se fosse uma luz brilhante, e na escuridão como se fosse uma luz fraca. Você não consegue discernir cores na escuridão, apenas tons de cinza." +
                "Transe: Elfos não dormem. Em vez disso, meditam profundamente, permanecendo semiconscientes, durante 4 horas por dia. A palavra comum para esta meditação é “transe”. Enquanto medita, você sonha de certa forma; esses sonhos são, na verdade, exercícios mentais que se tornaram reflexivos após anos de prática. Depois de descansar dessa maneira, você obtém o mesmo benefício que um ser humano obteria com 8 horas de sono. Você tem vantagem em testes de resistência contra ser enfeitiçado, e a magia não pode fazer você dormir.";
        this.bonus = "DEX - 2" +
                "";
        this.bonuses = new ArrayList<Bonus>();
        bonuses.add(new Bonus("DEX", 2));
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
