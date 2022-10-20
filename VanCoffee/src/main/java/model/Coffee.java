package model;

public class Coffee {

    private String shape ;
    private String packaging;
    private String sort;
    private int amount;
    private double weight;
    private double totalWeight;
    private double cost;
    private double totalCost;

    public Coffee(){
        this.shape = null;
        this.packaging = null;
        this.sort = null;
        this.cost = 0;
        this.amount = 0;
        this.weight = 0;

    }

    public Coffee(String sh, String so,String pkg, int am, double we,double co){
        this.shape = sh;
        this.packaging = pkg;
        this.sort = so;
        this.amount = am;
        this.weight = we;
        this.cost = co;
    }




    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }


    public void setCost(double cost) {
        this.totalCost = cost * this.amount;
        this.cost = cost;
    }

    public void setWeight(double weight) {
        this.totalWeight = weight * this.amount * 0.01;

        this.weight = weight;
    }

    public String getPackaging() {
        return packaging;
    }

    public double getCost() { return cost;
    }

    public double getWeight() {
        return weight;
    }

    public int getAmount() {
        return amount;
    }

    public String getShape() {
        return shape;
    }

    public String getSort() {
        return sort;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public double getTotalWeight() {
        return totalWeight;
    }
}