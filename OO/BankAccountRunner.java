package OO;

public class BankAccountRunner {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount("Hsueh-Yi Lin", 10000, 12345678, 110);
        BankAccount ba2 = new BankAccount("Hua-WenTsai", 100000, 987654321, 110);

        System.out.println(ba1);
        System.out.println(ba2);

        System.out.println("示範：存款 2000");
        ba1.deposit(2000);
        System.out.println(ba1);

        System.out.println("示範：提款 5000");
        ba2.withdraw(5000);
        System.out.println(ba2);

    }
}
