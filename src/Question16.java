import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("enter a number from (1 to 7):  ");
        int days = object.nextInt();
        switch (days) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
            case 7:
                System.out.println("Saturday");
                default:
                    System.out.println("Week contains 1 to 7 days");
        }
    }
}
