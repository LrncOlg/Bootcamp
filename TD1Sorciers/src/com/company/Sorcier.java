package com.company;

public class Sorcier extends Personnage{
    protected double pouvoir ;

    public Sorcier(String name, int vie){
        super(name, vie);
        pouvoir = Math.random();
    }

    public double getPouvoir(){
        return this.pouvoir;
    }

    public void attaque(Personnage p){
        this.afficher();
        p.afficher();
        if (!mort()){
            System.out.println(this.name +" attaque "+ p.getNom()+ ".\n");
            double d = this.getVie()*this.getPouvoir();
            int coup = (int) d;
            int gain = p.subitCharme((int) coup);
            this.addVie(gain);
            System.out.println(this.name + " gagne " + gain +" points.\n");
            //this.afficher();
            System.out.println("\n\n");
        }
    }

    public int subitFrappe(int coup) {
        this.addVie(-coup);
        System.out.println(this.name+ " perd " + coup + " points. \n");
        int retour = Math.abs(this.vie / 2);
        return retour;
    }

    public int subitCharme(int coup){
        System.out.println("Un charme n'a pas d'effet sur un sorcier.");
        return 0;
        }

}
