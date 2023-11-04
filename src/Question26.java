import java.util.Scanner;

public class Question26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a word to reverse");
        String value = sc.next();

        char[] letters = value.toCharArray();

        String forward = "";
        for (int i = letters.length - 1; i >= 0; i--) {
            forward += letters[i];
        }
        char[] letters2 = forward.toCharArray();
        System.out.println(forward);
        System.out.println(reverseletters(letters2));
    }


    public static String reverseletters(char[] letters) {
        String backward = "";
        for (int i =letters.length - 1; i >= 0; i-- ) {
            backward += letters[i];
        }

        return backward;
    }
}



