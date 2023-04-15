package Day_3_030423;

public class T2_Multiple_conditions {
    public static void main(String[] args) {

        // using multiple conditional statement verify when a+b>c, a+b=c
        int a = 2;
        int b = 3;
        int c = 4;
        // u can change int manully to get different result
        if (a + b > c) {
            System.out.println("a & b is less than c");
        } else if (a + b < c) {
            System.out.println("a & b is less than c");
        } else {
            // when you compare two values it will always be == double equal sign
            System.out.println("a & b is equal to c");
        }// end of multiple con

    }//end of main
}// end of java
