package org.lessons.java.farm;

public class Aquila extends Animal implements IVolante {

    public Aquila(String name) {
        super(name);
    }

    @Override
    public void verso() {
        System.out.println("CIP! CIP! (ma più forte)");
    }

    @Override
    public void mangia() {
        System.out.println("Gradisco piccoli animali, facili da arpionare con le mie zampe!");
    }

    @Override
    public void vola() {
        System.out.println("Voloooo!");
    }
}

