import java.text.DecimalFormat;
import java.util.Scanner;

public class Question6 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee Id:  ");
        int employeeId = scanner.nextInt();

        System.out.println("Enter Employee name:  ");
        String name = scanner.next();

        System.out.println("Enter Employee base salary: ");
        double baseSalary= scanner.nextDouble();

        double HRA = baseSalary * .10;
        double TA = baseSalary * .08;
        double DA = baseSalary * .09;
        double PF = baseSalary * .20;

        double grossSalary = baseSalary + HRA + TA + DA - PF;

        System.out.println("|      Salary Slip                  |");
        System.out.println("|                                   |");
        System.out.println("|                                   |");
        System.out.println("| Employee Id : " + employeeId + "  |");
        System.out.println("| Employee Name : " + name + "      |");
        System.out.println("| |");
        System.out.println("| Basic Salary  : " + baseSalary + " |");
        System.out.println("| HRA 10%             : " + HRA + "  |");
        System.out.println("| TA 8%                : " + TA + "  |");
        System.out.println("| DA 9%                : " + DA + "  |");
        System.out.println("| PF - 20%             : " + PF + "  |");
        System.out.println("|                                    |");
        System.out.println("| Gross Salary : " + grossSalary + " |");
        System.out.println("|===========================|");



    }
}
