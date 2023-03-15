package org.lessons.java.farm;

public class Passerotto extends Animal{

    public Passerotto(String name) {
        super(name);
    }

    @Override
    public void verso() {
        System.out.println("Cip! Cip!");
    }

    @Override
    public void mangia() {
        System.out.println("Mangio tendezialmente invertebrati, vuoi provare?");
    }
}
