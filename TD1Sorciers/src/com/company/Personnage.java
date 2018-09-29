package com.company;

public abstract class Personnage implements Victime {
    protected String name;
    protected int vie;

    public Personnage(String name, int vie){
        this.name = name;
        this.vie = vie;
    }

    public void afficher() {
        if (this.vie>0){
            System.out.println("Je m'appelle " + this.name + " et j'ai " + this.vie + " points de vie.\n");
        } else {
            System.out.println(this.name + " est mort.\n");
        }
    }

    public String getNom(){
        return this.name;
    }

    public boolean mort() {
        return (this.vie<=0);
    }

    public int getVie() {
        return (this.vie);
    }

    public void addVie(int num){
        this.vie += num;
    }
/*
    public abstract int subitFrappe(int coup);
    public abstract int subitCharme(int coup);
    */
    public abstract void attaque(Personnage p);

}
