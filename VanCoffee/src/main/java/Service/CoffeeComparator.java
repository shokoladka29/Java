package Service;

import model.Coffee;

import java.util.Comparator;

public class CoffeeComparator implements Comparator<Coffee> {
    @Override
    public int compare(Coffee o1, Coffee o2) {
        if (o1.getCost()/o1.getWeight()>o2.getCost()/o2.getWeight()){return 1;}
        if (o1.getCost()/o1.getWeight()<o2.getCost()/o2.getWeight()){return -1;}

        return 0;
    }
}