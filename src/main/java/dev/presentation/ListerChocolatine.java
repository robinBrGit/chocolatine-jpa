package dev.presentation;

import dev.entite.Chocolatine;
import dev.service.ChocolatineService;

import java.util.List;
import java.util.Map;

public class ListerChocolatine extends Option implements OptionIhm {


    public ListerChocolatine() {
        super("Lister chocolatine");
    }

    @Override
    public void executer() {
        ChocolatineService service = new ChocolatineService();
        Map<Integer,Chocolatine> chocolatines = service.listerChocolatine();
        chocolatines.forEach((i,c)->{
            System.out.println(i.toString()+":"+c);
        });
    }
}
