import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the first number");
        int num1 = input.nextInt();
        System.out.println("input the second number");
        int num2 = input.nextInt();
//        System.out.println("input the third number");
//        int num3 = input.nextInt();
        int a = num1 + num2;
        int b = num1 - num2;
        int c = num1 * num2;
        int d = num1 / num2;
        System.out.println();
        System.out.println(( num1 +" + "+ num2 + " = " + a  ) + "\n" +(num1 +" - "+ num2 + " = " + b) + "\n" +
        (num1 +" * "+ num2 + " = " + c) +"\n"+ (num1 +" / "+ num2 + " = " + d));
    }
}