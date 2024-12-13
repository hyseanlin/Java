package OO;

import java.util.Scanner;

public class PassworValidatorRunner {
    public static void main(String[] args) {
        PasswordValidator val1= new PasswordValidator(6, 10, 2, 2, 1, 1);
        System.out.println(val1); // 輸出密碼規則

        Scanner scn = new Scanner(System.in);

        System.out.print("請建立一組密碼：");
        String password = scn.nextLine();
        while (val1.isValid(password) == false)
        {
            System.out.print("請建立一組密碼：");
            password = scn.nextLine();    
        }
        System.out.println("密碼" + password + "符合規則!");
    }   
}
