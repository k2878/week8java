import java.util.Scanner;

public class Question13 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double number = in.nextDouble();
        System.out.println("enter the first number: ");
        double number2 = in.nextDouble();
        System.out.println("enter second number: ");
        char symbol = in.next().charAt(0);
        System.out.println("enter the symbol: ");
        double result;
        if (symbol == '+') {
            result = number + number2;
            System.out.println("Result: " + result);
        }
        else if (symbol == '-') {
            result = number - number2;
            System.out.println("Result: " + result);
        }
        else if (symbol == '*') {
            result = number * number2;
            System.out.println("Result: " + result);
        }
        else if (symbol == '/') {
            result = number/ number2;
                System.out.println("Result: " + result);
            }
        else {
                System.out.println("Division by zero is invalid input.");

        }

        }


    }


