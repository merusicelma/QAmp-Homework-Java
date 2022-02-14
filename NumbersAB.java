import java.util.Scanner;

public class NumbersAB {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter number A1");
        int a1 = reader.nextInt();
        System.out.println("Please enter number B2");
        int b2 = reader.nextInt();
        if (a1 > b2) {
            System.out.println(a1 + b2);
        }
        if (b2 > a1) {
            System.out.println(b2 - a1);
        }
        if (a1 == b2) {
            System.out.println(a1 * b2);
        }



    }
}
