package org.lessons.java.farm;

import java.util.Scanner;

public class Farm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Benvenuto nella vecchia fattoria!");
        System.out.print("Quanti animali intendi istanziare nella fattoria? ");
        int numberOfAnimals = Integer.parseInt(scanner.nextLine());

        Animal[] animals = new Animal[numberOfAnimals];

        for (int i = 0; i < animals.length; i++) {
            boolean validCoiche = false;

            while (!validCoiche) {
                System.out.print("Qual'è il nome dell'animale? ");
                String name = scanner.nextLine();

                System.out.print("Che tipo? c - cane; p - passerotto; a - aquila; d - delfino. ");
                String choice = scanner.nextLine();

                switch (choice) {
                    case "c":
                        //caso cane
                        validCoiche = true;
                        animals[i] = new Cane(name);
                        break;
                    case "p":
                        //caso paserotto
                        validCoiche = true;
                        animals[i] = new Passerotto(name);
                        break;
                    case "a":
                        //caso aquila
                        validCoiche = true;
                        animals[i] = new Aquila(name);
                        break;
                    case "d":
                        //caso delfino
                        validCoiche = true;
                        animals[i] = new Delfino(name);
                        break;
                    default:
                        //caso invalid
                        System.out.println("Scelta non valida!");
                        break;
                }
            }
        }

        for (Animal animal : animals){
            System.out.println("****");
            System.out.println("Ciao sono " + animal.getName());
            System.out.println("Tipo: " + animal.getClass().getSimpleName());
            animal.dormi();
            animal.mangia();
            animal.verso();
            if (animal instanceof IVolante) {
                faiVolare((IVolante) animal);
            }
            if (animal instanceof INuotante) {
                faiNuotare((INuotante) animal);
            }
        }

        scanner.close();
    }

    static void faiNuotare(INuotante animal) {
        animal.nuota();
    }

    static void faiVolare(IVolante animal) {
        animal.vola();
    }
}
