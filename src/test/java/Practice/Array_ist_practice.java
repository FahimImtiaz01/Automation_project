package Practice;

import java.util.ArrayList;

public class Array_ist_practice {
    public static void main(String[] args) {

        ArrayList<String> car = new ArrayList<>();
        car.add("bmw");
        car.add("honda");
        car.add("audi");
        car.add("M");

        ArrayList<Integer> year = new ArrayList<>();
        year.add(2010);
        year.add(2022);
        year.add(333);
        year.add(2080);

        for (int i=0; i < year.size(); i++) {
            System.out.println("name of the car is " + car.get(i) + " and that year it came out was in " + year.get(i));
        }//end of loop

    }// end of main
}// end of class
