package Day_3_030423;

import java.util.ArrayList;

public class T3_Array_Loop_conditions {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Strawberry");
        fruits.add("Grape");
        for (int i = 0; i < fruits.size(); i++) {
            //using the or operator
            if (fruits.get(i) == "Apple" || fruits.get(i) == "Grape") {
                System.out.println("fruit:" + fruits.get(i));
            }
        }//end of loop


    }//end of main
}// end of java
