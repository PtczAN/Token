package com.example.token2.classes;

import com.example.token2.R;

public class Cleric {
    private String name;
    private int img;

    public Cleric(){
        this.name = "Cleric";
        this.img = R.drawable.dustin_rivers_cleric;
    }

    public String getName() {
        return name;
    }

    public int getImg() {
        return img;
    }
}
