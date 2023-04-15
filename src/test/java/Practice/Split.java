package Practice;

public class Split {
    public static void main(String[] args) {
        //call the single String value
        String message = "My_name_is_fahim_Imtiaz";
        // print only fahim
        String[] arrayMessage = message.split("_");
        System.out.println("result: " + arrayMessage[3]);


    }//end of main
}//end of class
