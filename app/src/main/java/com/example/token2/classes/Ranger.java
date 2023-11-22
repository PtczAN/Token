package com.example.token2.classes;

import com.example.token2.R;

public class Ranger {
    private String name;
    private int img;

    public Ranger(){
        this.name = "Ranger";
        this.img = R.drawable.dustin_rivers_ranger;
    }

    public String getName() {
        return name;
    }

    public int getImg() {
        return img;
    }
}
