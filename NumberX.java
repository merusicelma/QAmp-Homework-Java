import java.util.Scanner;

public class NumberX {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter number X");
        int x = reader.nextInt();
        int result = (x + x + 6) / 2 - x;
        if (result %2==0){
        System.out.println("Result is: " + result + " and result is divisable by 2");
        }else {
            System.out.println("Result is : " + result + " and result isn't divisible by 2");
        }
    }
}