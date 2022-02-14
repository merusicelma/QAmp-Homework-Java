import java.util.Scanner;

public class LogicAB {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter numberA:");
        int numberA = reader.nextInt();
        System.out.println("Please enter numberB:");
        int numberB = reader.nextInt();
        System.out.println("Please enter numberC:");
        int numberC = reader.nextInt();
        System.out.println("Please enter numberD:");
        int numberD = reader.nextInt();
        int sum = numberA + numberB + numberC + numberD;

        if ((numberA > 0 && numberB > 0) || (numberC > 0 && numberD > 0)) {
            System.out.println("Sum numbers ABCD= " + sum);
        }
        if (sum > 100 && sum % 2 == 0) {
            System.out.println("The number is divisible by 2");
        } else if ((sum - 1) % 2 == 0) {
            System.out.println("The number is divisible by 2");
        } else {
            System.out.println("The number is still not divisible by 2");
        }

    }
}