package com.example.IntroBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {

    @Autowired
    public Engine(GearBox gb){
        this.gb = gb;
    }

    @Value("200")
    private int revs;

    @Autowired
    GearBox gb;

    public int getRevs() {
        return revs;
    }


    public void setRevs(int revs) {
        this.revs = revs;
    }
}
