import java.util.Scanner;

public class Question7 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:  ");
        int number = scanner.nextInt();

        if(number % 2 == 0){
            System.out.println("even Number: "+ number);
        }else
        {
            System.out.println("Odd Number: "+ number);
        }

    }
}
