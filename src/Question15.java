import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an input: ");
        char input = sc.next().charAt(0);

        if (Character.isDigit(input)) {
            System.out.println("The input is a number.");
        }
        else if (Character.isLetter(input)) {
            System.out.println("The input is an alphabet.");
        }
        else {
            System.out.println("The input is a symbol.");
        }
    }
}

