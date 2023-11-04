package midweekhw8;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args ){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first value: ");
        int a = scanner.nextInt();
        System.out.println("Enter second value: ");
        int b = scanner.nextInt();

        if(a == b){
            System.out.print("ITs a SQAURE");
        } else {
            System.out.print("ITs a RECTANGLE");
        }


    }
}
