package Ch5;

public class WhileDemo {
    public static void main(String[] args) {
        int n, sum;

        sum = 0;
        n = 1;
        while (sum <= 20)
        {
            sum += n;
            System.out.println("n = " + n + ", sum = " + sum);
            n++;
        }
    }
}
