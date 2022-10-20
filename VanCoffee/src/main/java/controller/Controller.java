package controller;

import model.Coffee;

import java.util.Scanner;

import static Service.Validation.*;

public class Controller {

    public static Coffee generateUnit(Scanner sc ){
        Coffee cup = new Coffee();
        cup.setShape(inputShape(sc,CHOOSE_SHAPE));
        cup.setPackaging(inputPackaging(sc,CHOOSE_PKG));
        cup.setSort(inputSort(sc,CHOOSE_SORT));
        cup.setAmount(inputAmountOfPkg(sc));
        cup.setWeight(inputDoubleValue(sc,TYPE_WEIGHT_OF_PKG));
        cup.setCost(inputDoubleValue(sc,TYPE_COST_OF_ONE));
        return cup;
    }
}