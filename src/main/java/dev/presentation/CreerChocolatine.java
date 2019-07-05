package dev.presentation;


import dev.entite.Chocolatine;
import dev.service.ChocolatineService;
import dev.util.Constantes;

public class CreerChocolatine extends Option implements OptionIhm {
    private ChocolatineService chocolatineService = Constantes.CHOCOLATINE_SERVICE;
    public CreerChocolatine() {
        super("Creér chocolatine");
    }

    @Override
    public void executer() {
        System.out.println("Saisir un nom :");
        String nom = scan.next();
        System.out.println("Saisir un poids :");
        float poids  = scan.nextFloat();
        System.out.println("Saisir une température");
        float temp = scan.nextFloat();
        System.out.println("Saisir un prix");
        float prix = scan.nextFloat();
        Chocolatine chocolatine = new Chocolatine(nom,poids,temp,prix);
        chocolatineService.ajouterChocolatine(chocolatine);
//        int choix = 1;
//        do {
//            System.out.println("0. revenir au menu principal");
//            choix=scan.nextInt();
//        }while (choix != 0);
    }
}
