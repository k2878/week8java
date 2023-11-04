package midweekhw8;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args ){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks: ");
        int a = scanner.nextInt();


        if( a <=25){
            System.out.print("Grade is F");
        } else if(a <= 45) {
            System.out.print("Grade is E");
        } else if(a <= 50) {
            System.out.print("Grade is D");
        }else if(a <= 60) {
            System.out.print("Grade is C");
        }else if(a <= 80) {
            System.out.print("Grade is B");
        }else if(a >= 80) {
            System.out.print("Grade is A");
        }


    }
}
