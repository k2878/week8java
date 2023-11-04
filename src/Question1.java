import java.util.Scanner;

public class Question1 {
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);
        System.out.println("enter a number:  ");
        int num = object.nextInt();
        String result = (num % 4 == 0) ? "even" : "odd";
        System.out.println("input number is  " + result + ".");






        }


    }



