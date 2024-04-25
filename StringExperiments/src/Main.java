import java.util.Scanner;

import java.util.*;
import java.util.ArrayList;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        int certCount = 1000;
        int winnerRate = 100;
        int[] certNumbers = new int[certCount];
        boolean[] certIsWin = new boolean[certCount];
        for (int i = 0; i < certNumbers.length; i++){
            certNumbers[i] = 1_000_000 + (int) Math.round(8_999_999 * Math.random());
            certIsWin[i] = i % winnerRate == 0;
            System.out.println(certNumbers[i]);
        }
    }
}