import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declare variables to store two binary numbers, an index, and a remainder
        long binary1, binary2;
        int i = 0, remainder = 0;
        int[] sum = new int [20];
        Scanner in = new Scanner(System.in);
        System.out.println("Input the first numbers");
        binary1 = in.nextInt();
        System.out.println("input the second numbers");
        binary2 = in.nextInt();
        while (binary1 != 0 || binary2 != 0);
        {
            // Calculate the sum of binary digits and update the remainder
            sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
            remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }
        if (remainder != 0) {
            sum[i++] = remainder;
        }

        // Decrement the index to prepare for printing
        --i;

        // Display the sum of the two binary numbers
        System.out.print("Sum of two binary numbers: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }

        System.out.print("\n");

    }
}