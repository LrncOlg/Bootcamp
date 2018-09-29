package com.company;

public class Monstre extends Personnage{
    public Monstre(String name, int vie){
        super(name, vie);
    }

    public void attaque(Personnage p){
        this.afficher();
        p.afficher();
        if (!mort()){
            System.out.println(this.name +" attaque "+ p.getNom()+ ".\n");
            int coup = this.vie/2;
            int perte = p.subitFrappe(coup);
            this.addVie(-perte);
            System.out.println(this.name + " perd " + perte +" points.\n");
            //this.afficher();
            System.out.println("\n\n");
        }
    }

    public int subitFrappe(int coup){
        this.addVie(-coup);
        System.out.println(this.name+ " perd " + coup + " points. \n");
        int retour = Math.abs(this.vie/2);
        return retour;
    }

    public int subitCharme(int coup){
        this.addVie(-coup);
        int retour = Math.abs(this.vie/2);
        System.out.println(this.name + " perd " + retour + " points de vie car il a été charmé.\n");
        return retour;
    }
}
