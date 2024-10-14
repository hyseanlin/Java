package Ch4;

public class Ch4_1 {
    public static void main(String[] args) {
        double val1, val2, val3;
        int number, remainder, denom, nom;

        number = 1;
        remainder = number % 2; // 檢驗是否為奇數或偶數
        System.out.println(number + " % 2 = " + remainder);


        nom = 123; // 被除數
        denom = 2; // 除數
        number = nom / denom; // 整數除法
        System.out.println(nom + " / " + denom + " = " + number);

        val1 = 123.0;
        val2 = 2.0;
        val3 = val1/ val2; // 浮點數除法
        System.out.println(val1 + " / " + val2 + " = " + val3);


        val3 = val1 / denom;
        System.out.println(val1 + " / " + denom + " = " + val3);

        val3 = nom / val2;
        System.out.println(nom + " / " + val2 + " = " + val3);

    }
}
