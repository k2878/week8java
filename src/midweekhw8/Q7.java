package midweekhw8;

import java.util.Arrays;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args ) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        System.out.println("Enter third number: ");
        int c = scanner.nextInt();
        int[] arry={a,b,c};
        Arrays.stream(arry).sorted();

        System.out.println("Youngest person "+arry[0]);
        System.out.println("Ordest person "+arry[2]);


    }




    }

