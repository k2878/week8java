import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {

        Scanner object = new Scanner(System.in);
        System.out.println("Enter number:  ");
        int number = object.nextInt();

        if(number == 0){
            System.out.println("Number is not positive or negative : "+ number);
        }
        else if ( number > 0 )
        {
            System.out.println("positive Number: "+ number);
        }
        else {
            System.out.println("negative Number: "+ number);
        }

    }
}

