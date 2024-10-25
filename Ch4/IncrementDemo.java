package Ch4;

public class IncrementDemo {
    public static void main(String[] args) {
        int a, b, c;
        //++a; // ++a 或 a++ 獨立寫成一行，沒有任何差異

        a = 5;
        b = (a--) - 3;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = 5;
        b = 2;

        b += a++;
        c = (++a) * (a++);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
