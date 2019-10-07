package hometask_1.present;

import hometask_1.sweets.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Generation {

 private  ArrayList<Sweet> present = new ArrayList <Sweet>();

    public void runGeneration() {
        presentGeneration();
        double res = getFinalCost(0);
        showPresent();
        System.out.println("Total cost of all items is: " + res );
        double weight = getFinalWeight(0);
        System.out.println("Total weight of all items is: " + weight );
        findElementBySugar();
        System.out.println("Sort by cost:");
        Collections.sort(present, new SortByCost());
        showPresent();
        System.out.println("It's All");

    }


    private void presentGeneration() {

        Candy candy  = new Candy("Snikers", 100, 400, 20);
        Chocolate chocolate = new Chocolate(true, 75, "Spartak", 50,300,25);
        Marshmallow zefur = new Marshmallow("green","Zefyr", 12,10,2);
        Candy candymax  = new Candy(43,"Snikers Max", 100, 410, 22);

        present.add(candy);
        present.add(chocolate);
        present.add(zefur);
        present.add(candymax);

        System.out.println("Present is created");
    }

    public void showPresent() {
        for (Sweet vault : present) {
                System.out.println(vault.getName() + "    " + vault.getCost() + "    " + vault.getWeight());
        }
    }

    public double getFinalCost(double sum) {
        for (Sweet vault : present) {
            sum += vault.getCost();
        }
        return sum;
    }

    public double getFinalWeight(double sum) {
        for (Sweet vault : present) {
            sum += vault.getWeight();
        }
        return sum;
    }

    public void findElementBySugar() {
        System.out.println("Enter Sugar range");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        sc.close();
        StringBuilder item = findCandyBySugar(a, b);
        System.out.println("Your candies are: " + item);
    }

    public StringBuilder findCandyBySugar(double a, double b) {
        StringBuilder candy = new StringBuilder();
        for (Sweet vault : present) {
            if ((vault.getSugar() >= a && vault.getSugar() <= b) || (vault.getSugar() >= b && vault.getSugar() <= a)) {
                candy.append(vault.getName()).append(", ");
            }
        }
        if (a < 0 || b < 0) {

            throw new IllegalArgumentException("Check entered numbers. They cannot be negative");
        }
        return candy;
    }


}
