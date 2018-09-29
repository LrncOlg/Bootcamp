package com.company;

/*import java.util.*;
AnayList<Personnage> l = new AnayList<Personnage>();
l.add(new Montre (...));
l.get(3);
 */

public class Main {

    public static void main(String[] args) {
        /*Personnage p1;
        p1 = new Monstre("Dracula",32);
        Personnage p2;
        p2 = new Sorcier("Panoramix",45);

        p1.afficher();
        p2.afficher();

        */
        String nomMonstre[] = {"Dracula", "Frankeinstein", "Boo", "Fantôme", "Loup"};
        String nomSorcier[] = {"Panoramix", "Druide", "Harry Potter", "Dumbledore", "Baltazar"};


        Personnage tableau[] = new Personnage[10];
        int j = 0;
        for (int i = 0; i < 10; i++) {
            //char n = (char) (i + 65);
            //String nom = ""+n;
            double pv = Math.random() * 100;
            int total = (int) pv;
            if (j < 4) {
                String nom = nomSorcier[i];
                tableau[i] = new Sorcier(nom, total);
            } else if (j==4) {
                String nom = "Magicien";
                tableau[i] = new Magicien(nom, total);
            } else {
                String nom = nomMonstre[i - 5];
                tableau[j] = new Monstre(nom, total);
            }
            j++;
            tableau[i].afficher();

        }

        System.out.println("\n\n");

        for (int i = 0; i < 15; i++) {
            double nu = Math.random() * 10;
            int num = (int) nu;
            int num2;
            do {
                double nu2 = Math.random() * 10;
                num2 = (int) nu2;
            }
            while (num != num2 & tableau[num2].mort());
            tableau[num].attaque(tableau[num2]);
        }

    }
}


