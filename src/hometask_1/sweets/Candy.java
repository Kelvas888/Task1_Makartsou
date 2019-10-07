package hometask_1.sweets;

public class Candy extends Sweet  {
    private double cocoa;
    private double tax = 0.14;

    public Candy(String name, double sugar, double weight, double cost) {
        super(name, sugar, weight, cost);
    }
    public Candy(double cocoa, String name, double sugar, double weight, double cost) {
        super(name, sugar, weight, cost);
        this.cocoa = cocoa;
    }

    @Override
    public String getName() {
        return "candy: "+super.getName();
    }

    public double getCocoa() {
        return cocoa;
    }

    @Override
    public double getCost() {
        return super.getCost()+tax*super.getCost();
    }
}
