package Action_Items;

import java.util.ArrayList;

public class Action_Items1_part2 {
    public static void main(String[] args) {
        //arraylist of countries
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Bangladesh");
        countries.add("France");
        countries.add("China");
        countries.add("Egypt");
        //list of country code
        ArrayList<Integer> countryCode = new ArrayList<>();
        countryCode.add(880);
        countryCode.add(33);
        countryCode.add(86);
        countryCode.add(20);
        // call for loop to print out all countries
        for (int i = 0; i < countries.size(); i++) {
            System.out.println("my country is " + countries.get(i) + " and my countryCode is " + countryCode.get(i));
        }//end of forloop
    }//end of main
}//end of java class
