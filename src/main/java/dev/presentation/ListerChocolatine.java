package dev.presentation;

import dev.entite.Chocolatine;
import dev.service.ChocolatineService;
import dev.util.Constantes;

import java.util.List;
import java.util.Map;

public class ListerChocolatine extends Option implements OptionIhm {
    private ChocolatineService chocolatineService = Constantes.CHOCOLATINE_SERVICE;

    public ListerChocolatine() {
        super("Lister chocolatine");
    }

    @Override
    public void executer() {
        Map<Integer,Chocolatine> chocolatines = chocolatineService.listerChocolatine();
        chocolatines.forEach((i,c)->{
            System.out.println(i.toString()+":"+c);
        });
    }
}
