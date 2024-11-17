import java.util.Scanner;

public class Midterm1131_frq3 {
    public static void main(String[] args) {
        String number="", intLiteral = "0123456789";
        
        Scanner scn = new Scanner(System.in);

        boolean isInt = false;
        while (!isInt) {
            System.out.print("請輸入一個整數：");
            number = scn.next();
            isInt = true; // assum it is an integer

            // if it is not an integer, set isInt to false 
            for (int i=0; i<number.length(); i++) {
                String digit = number.substring(i, i+1);
                if (intLiteral.indexOf(digit) == -1) {
                    if (i==0 && (digit.equals("+") || digit.equals("-"))) {
                        ; // or continue;
                    } else {
                        isInt = false;
                    }
                }
            }
        }

        int x = Integer.parseInt(number);
        double result = 1;        
        if (x > 0) {
            for (int i=1; i<=x; i++) {
                result = result * 10;
            }
        } else if (x < 0) {
            for (int i=1; i<=-x; i++) {
                result = result / 10;
            }
        }
        System.out.println("10^" + x + " = " + result);

        scn.close();
    }
}
