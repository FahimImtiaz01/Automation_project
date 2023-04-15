package Day_2_022623;

import java.util.ArrayList;

public class T3_For_loop {
    public static void main(String[] args) {
        // create an arraylist of countries
        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("India");
        countries.add("Bangladesh");
        countries.add("Pakistan");

        ArrayList<Integer> areaCode = new ArrayList<>();
        areaCode.add(111);
        areaCode.add(211);
        areaCode.add(311);
        areaCode.add(411);
        areaCode.add(511);
        areaCode.add(611);
        areaCode.add(811);

        // loop through the entire list of countries using for loop
        for (int i=0; i < countries.size(); i++){
            System.out.println("country is " + countries.get(i) +" "+ "area code is " + areaCode.get(i));
        }//end of loop

    }//end of main
}//end of java class
