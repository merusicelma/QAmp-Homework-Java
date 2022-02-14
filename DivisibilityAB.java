import java.util.Scanner;

public class DivisibilityAB {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter number A:");
        int a = reader.nextInt();
        System.out.println("Please enter number B:");
        int b = reader.nextInt();
        boolean dividable = a % b == 0;

        if (dividable && a >= 10 && a % 3 == 0 && a <= 10000) {
            System.out.println("Number " + a + " is divisible with number " + b);
        } else {
            System.out.println("Number " + a + " not divisible with number " + b);


        }


    }
}
