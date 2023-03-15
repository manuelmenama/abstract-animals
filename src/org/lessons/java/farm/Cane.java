package org.lessons.java.farm;

public class Cane extends Animal{
    public Cane(String name) {
        super(name);
    }

    @Override
    public void verso() {
        System.out.println("Bau! Bau!");
    }

    @Override
    public void mangia() {
        System.out.println("Ero carnivoro, ma adesso anche la pasta asciutta.");
    }
}
