package hometask_1.sweets;

public abstract class Sweet {
    private double sugar;
    private double weight;
    private double cost;
    private String name;


    Sweet(String name, double sugar, double weight, double cost) {
        this.sugar = sugar;
        this.weight = weight;
        this.cost = cost;
        this.name = name;
    }

    public double getSugar() {
        return sugar;
    }

    public double getWeight() {
        return weight;
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }



}
