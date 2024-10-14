package Ch4;

import java.util.Scanner;

public class Ch4_2 {
    public static void main(String[] args) {

        int number=0;     // 輸入的數值
        int lowestDigit=0;  // 最低位數
        int numberWithoutLowestDigit=0;   // 丟棄最低位數後的數值

        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入一個整數：");
        number = scn.nextInt();

        // 撰寫運算式擷取輸入數值的最低位數，例如：123 擷取到的最低位數後為 3
        /* 寫上你的程式 */

        System.out.println(number + "的最低位數：" + lowestDigit);

        // 撰寫運算式丟棄輸入數值的最低位數，例如：123 丟棄最低位數後為 12
        /* 寫上你的程式 */

        System.out.println(number + "的最低位數：" + numberWithoutLowestDigit);

        scn.close();
    }
}
