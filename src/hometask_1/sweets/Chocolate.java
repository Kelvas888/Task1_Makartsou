package hometask_1.sweets;

public class Chocolate extends Sweet {
    private double cocoa;
    private boolean milk;


    public Chocolate(boolean milk, double cocoa, String name, double sugar, double weight, double cost) {
        super(name, sugar, weight, cost);
        this.cocoa = cocoa;
        this.milk = milk;
    }

    @Override
    public String getName() {
        return "chocolate: "+super.getName();
    }
    public double getCocoa() {
        return cocoa;
    }

    public boolean isMilk() {
        return milk;
    }
}
