package Practice;

import java.util.ArrayList;

public class for_loop_w {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("germany");
        countries.add("france");
        countries.add("colombia");
        // call the int
        ArrayList<Integer> areaCode = new ArrayList<>();
        areaCode.add(1);
        areaCode.add(2);
        areaCode.add(3);
        areaCode.add(7);

        for (int i = 0; i < countries.size(); i++) {
            System.out.println("my country name is " + countries.get(i) + " my area code is " + areaCode.get(i));
        }// end of loop

    } // end of main
}//end of java
