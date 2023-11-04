package midweekhw8;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args ) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Medical cause Y or yes and N or NO: ");
        String yesOrNo = input.next().toLowerCase();

        System.out.println("Enter the number of classes held: ");
        int classesHeld = input.nextInt();

        System.out.println("Enter the number of classes attended: ");
        int classesAttended = input.nextInt();

        double atteancePer= (classesAttended * 100) / classesHeld;
        System.out.println("percentage "+ atteancePer);

        if(atteancePer >= 75 || yesOrNo.equalsIgnoreCase("y")){
            System.out.println("The student is allowed to sit in the exam.");
        } else {
            System.out.println("The student is not allowed to sit in the exam.");
        }
    }
}
