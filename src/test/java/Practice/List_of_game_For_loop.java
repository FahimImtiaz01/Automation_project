package Practice;

import java.util.ArrayList;

public class List_of_game_For_loop {
    public static void main(String[] args) {
        //Arraylist of games
        ArrayList<String> gamesNames = new ArrayList<>();
        gamesNames.add("call of duty");
        gamesNames.add("NBA");
        gamesNames.add("DBZ");
        gamesNames.add("Pokemon");
        //Arraylist of years game came out in
        ArrayList<Integer> year = new ArrayList<>();
        year.add(2003);
        year.add(2004);
        year.add(2008);
        year.add(2020);
        // for loop
        for (int i=0; i < gamesNames.size(); i++){
            System.out.println("The Name of the game is " + gamesNames.get(i) + " The year it came out was in " + year.get(i));

        }//end of for loop
    }//end of main
}//end of java
