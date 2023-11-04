import java.util.Scanner;

public class Question12 {

    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("enter an alphabet from (A to F):  ");
        String City = object.next();
        switch(City) {
            case "A":
                System.out.println("Amritsar");
                break;
            case "B" :
                System.out.println("Bengaluru");
                break;
            case "C":
                System.out.println("Chandigarh");
                break;
            case "D":
                System.out.println("Dresden");
                break;
            case "E":
                System.out.println("El Paso");
                break;
            case "F":
                System.out.println("Frankfurt");
                break;
            default:
                System.out.println("invalid input");

        }
    }
}
