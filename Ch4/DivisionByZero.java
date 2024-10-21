package Ch4;

public class DivisionByZero {
    public static void main(String[] args) {
        double EPISLON = 1e-10;

        double dbNom, dbDenom, dbResult;
        dbNom = 123;
        dbDenom = 0;
        dbResult = dbNom / (dbDenom + EPISLON);
        System.out.println("dbResult = " + dbResult);

        int nNom, nDenom, nResult;
        nNom = 123;
        nDenom = 0;
        nResult = nNom / nDenom;
        System.out.println("nResult = " + nResult);

        System.out.println("Proram ends.");
    }
}
