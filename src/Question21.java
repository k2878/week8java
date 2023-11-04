public class Question21 {

    public static void main(String[] args) {
        int[] num = {25,12,56,2,87,10,7,3,65};
        int sum = 0;
        for (int n : num) {
            sum += n;
        }

        System.out.println("Sum of numbers in array: " + sum);
    }
}

