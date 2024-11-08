package Ch5;

public class WhileDemo2 {
    public static void main(String[] args) {

        /* 計算 1+2+3+...+10
         * int sum=0;
         * for (int i=1; i<=10; i++)
         * {
         *      sum += i;
         * }
         */

         int i=1;
         int sum=0;
         while (i<=10)
         {
            sum += i;
            i++;
         }
         System.out.println("sum = " + sum);

    }
}
