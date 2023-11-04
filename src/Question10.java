import java.util.Scanner;

public class Question10 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sales Id:  ");
        int employeeId = scanner.nextInt();

        System.out.println("Enter seller name:  ");
        String name = scanner.next();

        System.out.println("Enter sales amount: ");
        double salesNumber= scanner.nextDouble();

        System.out.println("Enter salary amount: ");
        double baseSalary = scanner.nextDouble();

        double commissionRate;

        if (salesNumber >= 50000) {
            commissionRate = 0.35; // 35%
        } else if (salesNumber >= 30000) {
            commissionRate = 0.20; // 20%
        } else if (salesNumber >= 20000) {
            commissionRate = 0.10; // 10%
        } else if (salesNumber >= 10000) {
            commissionRate = 0.05; // 5%
        } else {
            commissionRate = 0.02; // 2%
        }

        double commissionTotal = salesNumber * commissionRate;

        System.out.println("Sales ID: " + employeeId);
        System.out.println("Seller's Name: " + name);
        System.out.println("Sales Amount: " + salesNumber);
        System.out.println("Salary Basic: " + baseSalary);
        System.out.println("Sales Commission: " + commissionTotal);


    }
}
