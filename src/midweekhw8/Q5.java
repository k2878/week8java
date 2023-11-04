package midweekhw8;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args ){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first value: ");
        int a = scanner.nextInt();
        System.out.println("Enter second value: ");
        int b = scanner.nextInt();

        if(a > b){
            System.out.print(a + " is bigger than " + b);
        } else if(b > a) {
            System.out.print(b + " is bigger than " + a);
        } else{
            System.out.print(b + " is equal to " + a);
        }


    }
}
