package com.example.token2.classes;

import com.example.token2.R;

public class Wizard {
    private String name;
    private int img;

    public Wizard(){
        this.name = "Wizard";
        this.img = R.drawable.dustin_rivers_wizard;
    }

    public String getName() {
        return name;
    }

    public int getImg() {
        return img;
    }
}
