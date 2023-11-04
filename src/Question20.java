import java.lang.reflect.Array;
import java.util.Arrays;

public class Question20 {


public static void main(String[] args) {

    System.out.println("Sorted Numeric Array: ");
    int[] numbers = {1,11,22,55,84};
    Arrays.sort(numbers);
    for (int num : numbers) {
        System.out.println(num + " ");
    }


    System.out.println("Sorted String Array: ");
    String[] names = {"Rani", "Alia", "Kriti", "Sara", "Manny"};
    Arrays.sort(names);

    for (String str : names) {
        System.out.print(str + " ");
    }
}
}



