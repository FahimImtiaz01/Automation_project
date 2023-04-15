package Day_3_030423;

public class T4_Split {
    public static void main(String[] args) {

        //declare a single string value
        String message = "My name is john";
        //print out only john from above string
        String[] arrayMessage= message.split(" ");
        System.out.println("Result: " + arrayMessage[3]);
    }//end of main
}//end of java
