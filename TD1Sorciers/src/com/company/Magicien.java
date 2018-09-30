package com.company;

public class Magicien extends Sorcier implements superPouvoir{
    public Magicien(String name, int vie){
        super(name,vie);
    }

    @Override
    public double sort(){
        int sortilege = (int) this.getPouvoir();
        return Math.random()*sortilege;
    }

    @Override
    public double getPouvoir(){
        return this.pouvoir*extra;
    }

    @Override
    public int subitCharme(int coup){
        System.out.println("Le magicien est protégé du charme.");
        double d = coup * sort();
        int retour = (int) d;
        System.out.println("Le magicien inflige un coup retour de " + retour);
        return -retour;
    }
}
