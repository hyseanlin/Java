package Ch5;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        int score; 

        Scanner scn = new Scanner(System.in);

        System.out.print("請輸入您的Java分數：");
        score = scn.nextInt();

        if (score >= 80) {
            System.out.println("優異的成績讓你通過了");
        } else if (score >= 60)
        {
            System.out.println("恭喜您通過Java");
        } else {
            System.out.println("被當掉，要加油了");
        }

        scn.close();
    }
}