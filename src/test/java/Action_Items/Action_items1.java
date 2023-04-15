package Action_Items;

import java.util.ArrayList;

public class Action_items1 {
    public static void main(String[] args) {
        //linear array list of countries

        String[] region = new String[]{"Bangladesh", "France", "China", "Egypt"};

        // linear int array list of regional code

        int[] regionalCode = new int[]{880, 33, 86, 20};
        //set the initializer first
        int i = 0;
        // define the while loop
        while (i < region.length) {
            System.out.println("my region is " + region[i] + " and my AreaCode is " + regionalCode[i]);
            // call the incrementation
            i = i + 1;
        }//end of whileloop


    }//end of main
}//end of java class
