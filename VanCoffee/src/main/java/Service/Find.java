package Service;

import model.Coffee;
import model.Van;
import java.util.ArrayList;
import java.util.Scanner;

import static Service.Validation.*;

public class Find implements MenuMessages {
    public static ArrayList<Coffee> find(Scanner sc, Van van){
        double minCost = inputDoubleValue(sc,TYPE_MIN_COST);
        double maxCost = inputDoubleValue(sc,TYPE_MAX_COST);
        double minWeight = inputDoubleValue(sc,TYPE_MINWEIGHT_TO_SEARCH);
        double maxWeight = inputDoubleValue(sc,TYPE_MAXWEIGHT_TO_SEARCH);
        String shape = inputShape(sc,CHOOSE_SHAPE);
        String packaging = inputPackaging(sc,CHOOSE_PKG);
        String sort = inputSort(sc,CHOOSE_SORT);
        ArrayList<Coffee> result = new ArrayList<>();
        for (int i = 0; i <van.getMerchandise().size() ; i++) {
            Coffee temp = van.getMerchandise().get(i);
            if(temp.getSort()==sort && temp.getPackaging()==packaging &&
                    temp.getShape()==shape && temp.getWeight()<=maxWeight && temp.getWeight()>=minWeight &&
                    temp.getCost()<=maxCost && temp.getCost()>=minCost){
                result.add(temp);
            }

        }
        return result;
    }
}