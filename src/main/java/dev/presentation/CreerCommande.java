package dev.presentation;

import dev.entite.Chocolatine;
import dev.service.ChocolatineService;
import dev.util.Constantes;

import java.util.Map;

public class CreerCommande extends Option implements OptionIhm {
    private ChocolatineService chocolatineService = Constantes.CHOCOLATINE_SERVICE;
    public CreerCommande() {
        super("Creér une commande");
    }

    @Override
    public void executer() {
        Map<Integer, Chocolatine> chocolatineMap = chocolatineService.listerChocolatine();
        chocolatineMap.forEach((i,c)->{
            System.out.println(i+": "+c);
        });
    }
}
