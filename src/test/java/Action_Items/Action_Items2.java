package Action_Items;

public class Action_Items2 {
    public static void main(String[] args) {
        //when grade is from 90 to 100 print grade as A
        // when a grade is from 80 to less than 90 print grade as B
        // When grade range from 70 to less than 80 print grade as C
        // when grade range is from 60 to less than 70 print grade as D
        // anything below 60 is F
        int grade =90;
        if (grade >= 90 && grade <=100) {
            System.out.println("grade is A");
        } else if (grade >= 80 &&grade<90) {
            System.out.println("grade is B");
        } else if (grade >= 70 &&grade<80) {
            System.out.println("grade is C");
        } else if (grade >= 60 &&grade<70) {
            System.out.println("grade is D");
        } else {
            //(grade >= 0 && < 60)
            System.out.println("grade is F");
        }//end of condition


    }//end of main
}//end of class
