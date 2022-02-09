package com.seleniumexpress.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

    private Heart heart;

    @Autowired
    @Qualifier("humanHeart")
    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public Human(Heart heart) {
        this.heart = heart;
    }

    public Human() {
    }

    public void startPumping() {
        heart.pump();
    }
}
