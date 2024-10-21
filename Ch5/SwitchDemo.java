package Ch5;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        String msg;        
        int value;

        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入一位數的整數數字：");
        value = scn.nextInt();

        switch (value) {
            case 0:
                msg = "zero";
                break;
            case 1:
                msg = "one";
                break;
            case 2:
                msg = "two";
                break;
            case 3:
                msg = "three";
                break;        
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                msg = " ranging from 4 to 9";
                break;
            default:
                msg = "None";
                break;
        }

        System.out.println("What you typed is " + msg);

        scn.close();

    }
}
