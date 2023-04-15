package Practice;

import java.util.ArrayList;

public class Practice_array_loop_conditions {
    public static void main(String[] args) {
        ArrayList<String> games = new ArrayList<>();
        games.add("Nba");
        games.add("cod");
        games.add("pokemon");
        for (int i = 0; i < games.size(); i++) {
            if (games.get(i) == "cod" || games.get(i) == "pokemon") {
                System.out.println("games: " + games.get(i));
            }
        }//end of loop
    }
}// end of class
