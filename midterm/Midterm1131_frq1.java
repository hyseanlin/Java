package midterm;

import java.util.Scanner;

public class Midterm1131_frq1 {
    public static void main(String[] args) {
        int x, y=-1;

        Scanner scn = new Scanner(System.in);
        System.err.print("請輸入 x 值：");
        x = scn.nextInt();

        while (y < 0)
        {
            System.err.println("請輸入 y 值(必須大於 0)：");
            y = scn.nextInt();
        }

        if (x==0 && y == 0)
            System.out.println("0 的 0 次方無定義");
        else {
            int result=1, count=y;
            while (count > 0)
            {
                result = result * x;
                count--;
            }
            System.out.println(x + " 的 " + y + " 次方等於：" + result);
        }
       
        scn.close();
    }
}
