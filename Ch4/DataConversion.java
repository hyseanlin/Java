package Ch4;

public class DataConversion {
    public static void main(String[] args) {
        int nValue, nNom, nDenom;
        double dbValue;

        // int -> double
        dbValue = 123;

        // 強制轉型 (casting, cast) 的範例 double -> int
        dbValue = 123.0; // 此結果來自於一些程式所產生的計算結果
        nValue = (int) dbValue;
       
        System.out.println("nValue = " + nValue);

        nNom = 123; // 此結果來自於一些程式所產生的計算結果
        nDenom = 10; // 此結果來自於一些程式所產生的計算結果

        dbValue = nValue + nNom / nDenom;
        System.out.println("dbValue = " + dbValue);

        dbValue = nValue + nNom / (double) nDenom;
        System.out.println("dbValue = " + dbValue);


    }
}
