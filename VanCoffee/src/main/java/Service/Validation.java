package Service;
import Service.constants.MainMenu;
import Service.constants.Packaging;
import Service.constants.Shapes;
import Service.constants.Sorts;

import java.io.IOException;

import java.util.Scanner;

import static view.Show.show;


public class Validation implements MainMenu,Sorts,Shapes,Packaging, MenuMessages {

    public static int inputForMainMenu(Scanner sc,String message) {
        show(message);
        while (true) {

            try {
                int com = sc.nextInt();
                if (com!=ADD_COFFEE && com!=FIND && com!=SORT && com!=CARRIER && com!=EXIT){
                    throw new IOException();
                }

                return com;
            } catch (IOException exp) {
                System.out.println(WRONG_INPUT);
            }
        }
    }

    public static String inputShape(Scanner sc, String messagge){
        show(messagge);
        while (true) {
            try {
                int com = sc.nextInt();
                if (com!=SWITCH_BEANS && com!=SWITCH_INSTANT && com!=SWITCH_MILLED ){throw new IOException();}
                switch (com) {
                    case SWITCH_BEANS: return BEANS;
                    case SWITCH_INSTANT: return INSTANT;
                    case SWITCH_MILLED: return MILLED;
                }
            } catch (IOException exp) {
                System.out.println(WRONG_INPUT);
            }
        }
    }

    public static String inputPackaging(Scanner sc, String message){
        show(message);
        while (true) {
            try {
                int com = sc.nextInt();
                if (com!=SWITCH_JAR && com!=SWITCH_PACKAGE  ){throw new IOException();}
                switch (com) {
                    case SWITCH_JAR: return JAR;
                    case SWITCH_PACKAGE: return PACKAGE;
                }
            } catch (IOException exp) {
                System.out.println(WRONG_INPUT);
            }
        }
    }

    public static String inputSort(Scanner sc , String message){
        show(message);
        while (true) {
            try {
                int com = sc.nextInt();
                if (com!= SWITCH_ARABICA && com!= SWITCH_CANEPHORA&& com!=SWITCH_LIBERICA && com!= SWITCH_DEVERWEI)
                {throw new IOException();}
                switch (com) {
                    case SWITCH_ARABICA: return ARABICA;
                    case SWITCH_CANEPHORA: return CANEPHORA;
                    case SWITCH_LIBERICA: return LIBERICA;
                    case SWITCH_DEVERWEI: return DEVERWEI;
                }
            } catch (IOException exp) {
                System.out.println(WRONG_INPUT);
            }
        }
    }


    public static int inputAmountOfPkg(Scanner sc){
        show(TYPE_AMOUNT);
        while(true) {
            if (!sc.hasNextInt()) {
                System.out.println("You must enter an number");
            } else {
                int com = sc.nextInt();
                return com;
            }
            sc.nextInt();
        }
    }
    public static double inputDoubleValue(Scanner sc , String a){
        show(a);
        while(true) {
            if (!sc.hasNextDouble()) {
                System.out.println("You must enter an number");
            } else {
                double com = sc.nextDouble();
                return com;
            }
            sc.nextLine();
        }
    }
}