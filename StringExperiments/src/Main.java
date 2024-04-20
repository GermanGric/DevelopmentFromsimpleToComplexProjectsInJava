import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the first number");
        double r = input.nextDouble();
        System.out.println();
        System.out.println("Area = " + r * r * Math.PI);
        System.out.println("Perimeter = " + 2 * r * Math.PI );
    }
}