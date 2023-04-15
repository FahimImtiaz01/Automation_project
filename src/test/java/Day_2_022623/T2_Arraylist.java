package Day_2_022623;

import java.util.ArrayList;

public class T2_Arraylist {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("India");
        countries.add("Bangladesh");
        countries.add("Pakistan");
        // get the count of the list
        System.out.println("countries list:" + countries.size());
        //print only Bangladesh and india
        System.out.println("countries are "+ countries.get(0) +", " + countries.get(1) +", " + countries.get(2));
         countries.add("Russia");
         //get the count of the list
        System.out.println("countries list:"+ countries.size());
        System.out.println(countries.get(4));
    }//end of main

}//end of java class
