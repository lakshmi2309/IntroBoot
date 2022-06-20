package com.example.IntroBoot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GearBox {

    @Value("3")
    private int gear;

    public int getGear() {
        return gear;

    }

    }




