package com.company;

public class Monstre extends Personnage{
    public Monstre(String name, int vie){
        super(name, vie);
    }

    @Override
    public void attaque(Personnage p){
        this.afficher();
        p.afficher();
        if (!mort()){
            System.out.println(this.name +" attaque "+ p.getNom()+ ".");
            int coup = this.vie/2;
            int perte = p.subitFrappe(coup);
            this.addVie(-perte);
            System.out.println(this.name + " perd " + perte +" points.");
            //this.afficher();
            System.out.println("\n\n");
        }
    }

    @Override
    public int subitFrappe(int coup){
        this.addVie(-coup);
        System.out.println(this.name+ " perd " + coup + " points.");
        int retour = Math.abs(this.vie/2);
        return retour;
    }

    @Override
    public int subitCharme(int coup){
        this.addVie(-coup);
        int retour = Math.abs(this.vie/2);
        System.out.println(this.name + " perd " + retour + " points de vie car il a été charmé.");
        return retour;
    }
}
