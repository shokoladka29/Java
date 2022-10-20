package model;
import java.util.ArrayList;

import static Service.MenuMessages.MONEY_IS_OVER;
import static Service.MenuMessages.VAN_IS_FULL;


public class Van {
    public static  double maxWeight = 2000d;
    public static double maxCost;
    private ArrayList<Coffee> merchandise ;


    public Van(double max){
        this.maxCost = max;
        merchandise = new ArrayList<>();
    }

    public ArrayList<Coffee> getMerchandise() {
        return merchandise;
    }

    public void add(Coffee cup){
        double tempW = this.maxWeight;
        double tempC = this.maxCost;

        this.maxWeight = maxWeight - cup.getTotalWeight();
        this.maxCost = maxCost - cup.getTotalCost();
        this.getMerchandise().add(cup);
        if (isFull() || moneyOver()){
            int last = this.getMerchandise().lastIndexOf(cup);
            this.getMerchandise().remove(last);
            this.maxWeight = tempW;
            this.maxCost = tempC;

        }


    }

    private static boolean isFull(){
        if (maxWeight<=0) {

            System.err.println(VAN_IS_FULL);
            return true;
        } else{

            return false;
        }
    }
    private static boolean moneyOver(){
        if(maxCost<=0){

            System.err.println(MONEY_IS_OVER);
            return true;
        }
        else {

            return false;
        }
    }
}