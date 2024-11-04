package Ch5;

public class ForLoopDemo {
    private static String name="Sean";

    public static int sum(int init, int end)
    {
        int sum=0;
        for (int i=init; i<=end; i++)
        {
            sum += i;
        }
        name = "method: sum";
        return sum;
    }

    public static void main(String[] args) {
        name = "method: main";

        int i, end, sum;
        i = 2;
        end = 50;
        sum = sum(i, end);
        System.out.println(i + "+2+...+" + end + "=" + sum);
    }
}
