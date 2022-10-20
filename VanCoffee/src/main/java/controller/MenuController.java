package controller;


import Service.CoffeeComparator;
import Service.constants.MainMenu;
import Service.MenuMessages;
import model.Van;

import java.util.Collections;
import java.util.Scanner;

import static Service.Find.find;
import static controller.Controller.generateUnit;
import static Service.Validation.inputDoubleValue;
import static Service.Validation.inputForMainMenu;
import static view.Show.show;
import static view.Show.showCoffee;

public class MenuController implements MenuMessages,MainMenu {
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        Van van = new Van(inputDoubleValue(sc,TYPE_MAX_AMOUT_MONEY));
        while (true) {
            show(SPACE + van.maxWeight);
            show(FREE + van.maxCost);
            switch (inputForMainMenu(sc, MAIN_MENU)) {
                case ADD_COFFEE:
                    van.add(generateUnit(sc));
                    break;
                case FIND:
                    showCoffee(find(sc, van));
                    break;
                case SORT:
                    Collections.sort(van.getMerchandise(),new CoffeeComparator());
                    showCoffee(van.getMerchandise());
                    break;
                case CARRIER:
                    showCoffee(van.getMerchandise());
                    break;
                case EXIT:
                    return;
            }
        }
    }
}