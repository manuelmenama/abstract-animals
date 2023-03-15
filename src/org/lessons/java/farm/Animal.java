package org.lessons.java.farm;

public abstract class Animal {
    //ATTRIBUTI
    private String name;

    //COSTRUTTORI
    public Animal(String name) {
        this.name = name;
    }

    //GETTER E SETTER

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //METODI
    public void dormi() {
        System.out.println("Zzzz...");
    };
    public abstract void verso();
    public abstract void mangia();
}
