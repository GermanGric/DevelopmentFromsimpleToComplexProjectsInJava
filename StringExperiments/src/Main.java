import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the first number");
        int n = input.nextInt();
        for (int i = 0; i < 10; i++){
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}