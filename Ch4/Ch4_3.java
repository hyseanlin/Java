package Ch4;

public class Ch4_3 {
    public static void main(String[] args) {
        int a, b;

        a = 10;
        b = 3;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a += 10 + b * 5;

        System.out.print("經過複合設定運算後");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
