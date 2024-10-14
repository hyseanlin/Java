package Ch4;

public class Ch4_4 {
    public static void main(String[] args) {
        int a=5, b, c;

        b = 3 - --a;
        System.out.println("a = " + a + ", b=" + b);

        a=5;
        b=2;

        b += a++;
        System.out.println("a = " + a + ", b=" + b);
        c = (a++) * (++a);
        System.out.println("a = " + a + ", b=" + b + ", c=" + c);
    }
}
