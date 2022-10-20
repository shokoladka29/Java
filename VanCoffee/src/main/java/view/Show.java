package view;

import Service.MenuMessages;
import model.Coffee;

import java.util.ArrayList;

public class Show implements MenuMessages {
    public static void show(String message) {
        System.out.println(message);
    }
    public static void showUnit(Coffee cup){
        System.out.println("Shape" +": "+ cup.getShape() + "\n"+
                "Packaging" + ": "+ cup.getPackaging() + "\n"+
                "Sort" + ": "+ cup.getSort() + "\n"+
                "Amount of " + cup.getPackaging()+"`s" + ": " + cup.getAmount() + "\n" +
                "Weight of one " + cup.getPackaging() + ": " + cup.getWeight() + " gr"+"\n" +
                "Total weight: " + cup.getTotalWeight() + " kg" + "\n" +
                "Cost of one " + cup.getPackaging() + ": " + cup.getCost() + "\n" +
                "Total cost: " + cup.getTotalCost());
        System.out.println("////////////////////////////////////////////////////////////");
    }

    public static void showCoffee(ArrayList<Coffee > cup){
        for (int i = 0; i <cup.size() ; i++) {
            showUnit(cup.get(i));
        }

    }


}