package Ch4;

public class DivisionDemo {
    public static void main(String[] args) {
        // 整數除法
        int nNom, nDenom, nResult; // 整數變數
        nNom = 456;
        nDenom = 10;
        nResult = nNom / nDenom; // 整數除法
        System.out.println("整數除法：");
        System.out.println(nNom + " / " + nDenom + " = " + nResult);

        // 浮點數除法
        double dbNom, dbDenom, dbResult; // 浮點數變數
        dbNom = 456.0; // 可以改成 456
        dbDenom = 10.0; // 可以改成 10
        dbResult = dbNom / dbDenom; // 浮點數除法
        System.out.println("浮點數除法：");
        System.out.println(dbNom + " / " + dbDenom + " = " + dbResult);

        dbResult = nNom / dbDenom; // (int) / (double) => (double)
        System.out.println("浮點數除法：");
        System.out.println(nNom + " / " + dbDenom + " = " + dbResult);

        dbResult = dbNom / nDenom; // (double) / (int) => (double)
        System.out.println("浮點數除法：");
        System.out.println(nNom + " / " + dbDenom + " = " + dbResult);

    }
}
