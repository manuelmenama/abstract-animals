package org.lessons.java.farm;

public class Delfino extends Animal{

    public Delfino(String name) {
        super(name);
    }

    @Override
    public void verso() {
        System.out.println("Click! Click!");
    }

    @Override
    public void mangia() {
        System.out.println("Cosa mangio? PESCI!");
    }
}
