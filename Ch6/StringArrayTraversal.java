package Ch6;

import java.util.Scanner;

public class StringArrayTraversal {
    public static void main(String[] args) {
        String[] names = new String[5];

        Scanner scn = new Scanner(System.in);

        for (int i=0; i<names.length; i++)
        {
            System.out.println("請輸入名字：");
            names[i] = scn.next();
        }

        for (int i=0; i<names.length; i++)
        {
            System.out.println(names[i]);
        }

        
    }
}
