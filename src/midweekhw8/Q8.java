package midweekhw8;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args ) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of classes held: ");
        int classesHeld = input.nextInt();

        System.out.println("Enter the number of classes attended: ");
        int classesAttended = input.nextInt();

        double atteancePer= (classesAttended * 100) / classesHeld;
        System.out.println("percentage "+ atteancePer);

        if(atteancePer >= 75){
            System.out.println("The student is allowed to sit in the exam.");
        } else {
            System.out.println("The student is not allowed to sit in the exam.");
        }
    }
}
