package Practice;

import java.util.ArrayList;

public class Array_list_of_games {
    public static void main(String[] args) {
        ArrayList<String> game = new ArrayList<>();
        game.add("call of Duty");
        game.add("NBA");
        game.add("DBZ");
        game.add("pokemon");
        // count of game
        System.out.println("game count" + game.size());
        // list of favorite game
        System.out.println("my favorite game is " + game.get(1) +" and " + game.get(0));
        // list of game I have not played
        System.out.println("Games I have not played are " + game.get(2) +" and " + game.get(3) );
    }//end of main
}// end of java
