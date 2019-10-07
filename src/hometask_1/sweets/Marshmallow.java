package hometask_1.sweets;

public class Marshmallow extends Sweet {
    private String color;

    public Marshmallow(String color, String name, double sugar, double weight, double cost) {
        super(name, sugar, weight, cost);
        this.color = color;
    }

    @Override
    public String getName() {
        return "Marshmallow: "+super.getName();
    }

    public String getColor() {
        return color;
    }

}
