import java.util.Scanner;

public class CircleSurface {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        System.out.println("Please enter radius:");
        double r = reader.nextDouble();
        double surface = r * r * Math.PI;
        System.out.println("p=" + surface);
    }
}
