package midweekhw8;

public class Q2 {
    public static void main(String[] args ){
        int a = 24;
        int b = 50;
        int c = 29;
        table(a);
        table(b);
        table(c);

    }

    public static void table(int num){
        System.out.println("Mulitple Table of: " + num);
        for (int i= 1 ; i <= 10 ; i++){
            System.out.println("Multiple "+i+ " x "+num+ " = "+(i*num));
        }
    }
}
