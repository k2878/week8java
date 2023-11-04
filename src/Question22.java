import java.util.Arrays;

public class Question22 {


    public static void main(String[] args) {
        int[] numbers = {25,12,10,8,55,90,78};
        Arrays.sort(numbers);

        int sum = 0;

        for (int i = 0; i< numbers.length; i++){
            System.out.println(numbers[i]);
            sum += numbers[i];
            System.out.println(sum);
        }

        // Calculate the average
        double average = (double) sum / numbers.length;

        System.out.println("Average value of array elements: " + average);
    }
}
