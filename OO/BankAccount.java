package OO;

public class BankAccount {
    /* BankAccount 具備的屬性 */
    private String name; // 姓名
    private double balance; // 餘額
    private int account_id; // 帳號
    private int bank_id; // 銀行代號

    // 功能：建構 BankAccount 物件的函式
    // 使用方法：
    //      BankAccount ba1 = new BankAccount("林學億", 10000, 123456789, 110);
    public BankAccount(String n, double b, int aid, int bid)
    {
        name = n;
        balance =b;
        account_id = aid;
        bank_id = bid;
    }

    // 功能：提款
    public int withdraw(int amount)
    {
        balance = balance - amount;
        return (int) (balance + 0.5); // 四捨五入，並強制轉型成 int
    }

    // 功能：存款
    public int deposit(int amount)
    {
        balance += amount;
        return (int) Math.round(balance); // 四捨五入，並強制轉型成 int
    }

    // 功能：建構 BankAccount 物件的 toString 函式
    // 使用方法：
    //      BankAccount ba1 = new BankAccount("林學億", 10000, 123456789, 110);
    //      System.out.println(ba1); => System.out.println(ba1.toString());
    public String toString()
    {
        String msg="";

        msg = "姓名：" + name + "; 餘額：" + balance +
              "(銀行代號：" + bank_id + "，銀行帳號：" + account_id + ")";

        return msg;
    }

}
