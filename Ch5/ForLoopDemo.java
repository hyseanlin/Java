package Ch5;

public class ForLoopDemo {

    public static void main(String[] args) {

        int i, end, sum;
        i = 6;
        end = 5;

        sum = 0;
        for (int j=end; j>=i; j--)
        {
            sum += j;
        }
        System.out.println(i + "+...+" + end + "=" + sum);

    }
}
