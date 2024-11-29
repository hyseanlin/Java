package Ch6;

import java.util.Scanner;

public class IntArrayInputDemo {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("請輸入學生數量：");
        int n = scn.nextInt();
        int[] scores = new int[n];

        for (int i=0; i<scores.length; i++)
        {
            System.out.println("請輸入成績：");
            scores[i] = scn.nextInt();
        }

        System.out.println("您輸入的成績");
        for (int i=0; i<scores.length; i++)
        {
            System.out.println(scores[i]);
        }

    }
}
