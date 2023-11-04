import java.text.DecimalFormat;
import java.util.Scanner;

public class Question5 {


    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter students name:  ");

        String studentname;
        String grade;
        studentname = scanner.next();

        System.out.println("enter row number:  ");
        int rowNum = scanner.nextInt();

        // Input marks for three subjects
        System.out.print("Enter Math marks (0-100): ");
        int mathMarks = scanner.nextInt();
        System.out.print("Enter Science marks (0-100): ");
        int scienceMarks = scanner.nextInt();
        System.out.print("Enter English marks (0-100): ");
        int englishMarks = scanner.nextInt();

        if(checkMarks(mathMarks)&& checkMarks(scienceMarks) && checkMarks(englishMarks)){
            int result = mathMarks + scienceMarks + englishMarks;
            double av = (result / 300.0) * 100;
            String passFail;
            if(av <=35) {
                passFail="Fail";
            }else {
                passFail="Pass";
            }

            if (av >= 80) {
                grade="A+";
            }
            else if(av >= 60) {
                grade="A";
            }
            else if(av >= 50) {
                grade="B";
            }
            else {
                grade="C";
            }
            DecimalFormat decimalFormat = new DecimalFormat("0.00");

            System.out.println("\nMark Sheet");
            System.out.println("------------------------------------------------");
            System.out.println("Name: " + studentname);
            System.out.println("Roll Number: " + rowNum);
            System.out.println("Subject        Marks");
            System.out.println("------------------------------------------------");
            System.out.println("Math           " + mathMarks);
            System.out.println("Science        " + scienceMarks);
            System.out.println("English        " + englishMarks);
            System.out.println("------------------------------------------------");
            System.out.println("Total Marks: " + result);
            System.out.println("Percentage: " + decimalFormat.format(av) + "%");
            System.out.println("Result: " + passFail);
            System.out.println("Grade: " + grade);
            System.out.println("------------------------------------------------");
        }else{
            System.out.println("You enterd wrong marks please enter 0-100");
        }

        }

    public static boolean checkMarks(int marks){
        return marks >= 0 && marks <= 100;
    }

}
