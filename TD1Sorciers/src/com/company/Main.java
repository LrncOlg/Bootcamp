package com.company;

import java.util.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        List<String> nomMonstre = Arrays.asList("Dracula", "Frankeinstein", "Boo", "Fantôme", "Loup");
        List<String> nomSorcier = Arrays.asList("Panoramix", "Druide", "Harry Potter", "Dumbledore", "Baltazar");

        List<Personnage> personnages = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            double pv = Math.random() * 100;
            int total = (int) pv;
            if (i < 4) {
                String nom = nomSorcier.get(i);
                personnages.add(new Sorcier(nom, total));
            } else if (i == 4) {
                String nom = "Magicien";
                personnages.add(new Magicien(nom, total));
            } else {
                String nom = nomMonstre.get(i % nomMonstre.size());
                personnages.add(new Monstre(nom, total));
            }
            personnages.get(i).afficher();

        }

        System.out.println("\n\n");

        //Attaques aleatoires
        for (int i = 0; i < 15; i++) {
            double nu = Math.random() * 10;
            int attaquant = (int) nu;
            int defenseur;
            do {
                double nu2 = Math.random() * 10;
                defenseur = (int) nu2;
            }
            while (attaquant != defenseur && personnages.get(defenseur).mort());
            personnages.get(attaquant).attaque(personnages.get(defenseur));
        }

    }
}


