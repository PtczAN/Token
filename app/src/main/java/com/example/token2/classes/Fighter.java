package com.example.token2.classes;

import com.example.token2.R;

public class Fighter {
    private String name;
    private int img;

    public Fighter(){
        this.name = "Fighter";
        this.img = R.drawable.dustin_rivers_fighter;
    }

    public String getName() {
        return name;
    }

    public int getImg() {
        return img;
    }
}
