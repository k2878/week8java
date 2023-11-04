import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("enter an alphabet from (A to F):  ");
       String City = object.next();

        if (City.equals ("A")) {
            System.out.println("City: Amritsar");
        } else if (City.equals ("B")) {
            System.out.println("City: Bengaluru");
        } else if (City.equals ("C")){
            System.out.println("City: Chandigarh");
        } else if (City.equals ("D")) {
            System.out.println("City: Dresden");
        } else if (City.equals ("E")) {
            System.out.println("City: El Paso");
        } else if (City.equals ("F")) {
            System.out.println("City: Frankfurt");
        } else {
            System.out.println("enter valid elphabet");
        }
    }
}












