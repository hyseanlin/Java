package Ch6;

import java.util.Scanner;

public class ArrayInputDemo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);        
        System.out.println("請輸入人數：");
        int n = scn.nextInt();

        String[] names = new String[n]; // 配置 n 個字串的陣列
        for (int i=0; i<names.length; i++)
        {
            System.out.println("請輸入名字[" + i + "]：");
            names[i] = scn.next();
        }

        for (int i=0; i<names.length; i++)
        {
            System.out.println(names[i]);
        }

    }
}
