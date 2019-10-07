package hometask_1.present;

import hometask_1.sweets.Sweet;

import java.util.Comparator;

public class SortByCost implements Comparator<Sweet > {


    public int compare(Sweet o1, Sweet o2) {

        double p1 = o1.getCost();
        double p2 = o2.getCost();

        if (p1 < p2){
            return 1;
        }
        else if (p1 > p2){
            return -1;
        }
        else return 0;
    }
}
