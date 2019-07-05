package dev.presentation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    private Map<Integer,OptionIhm> options = new HashMap<>();
    private Scanner scan = new Scanner(System.in);

    public Menu() {
        init();
    }
    public void init(){
        options.put(1,new ListerChocolatine());
        options.put(2,new CreerChocolatine());
        options.put(3,new CreerCommande());
    }

    public Map<Integer, OptionIhm> getOptions() {
        return options;
    }

    public void setOptions(Map<Integer, OptionIhm> options) {
        this.options = options;
    }

    public void demarrer(){
        int option = 0;
        do {
            System.out.println("###############MENU####################");
            options.forEach((i, o) -> {
                System.out.println(i.toString() + ": " + o.getLibelle());
            });
            option = scan.nextInt();
            if (options.containsKey(option)) {
                options.get(option).executer();
            } else System.out.println("Choix incorrecte");
        }while (option != 10);
        scan.close();
    }
}
