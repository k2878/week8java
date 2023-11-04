package midweekhw8;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0 ; i < 10 ; i++ ){
            System.out.println(i+" enter any number: ");
            sum += scanner.nextInt();
        }
        double average = (double) sum / 10;
        System.out.println("Average of 10 numbers entered is : " + average);
    }
}
