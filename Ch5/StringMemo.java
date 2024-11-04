package Ch5;

public class StringMemo {
    public static void main(String[] args) {
        String name = "Sean   Lin";

        System.out.println("名字的長度：" + name.length());

        System.out.println("每一個字母：");
        for (int i=0; i<name.length(); i++)
        {
            System.out.println(name.substring(i, i+1));
        }

        // 設計一個程式，判斷 n 出現幾次
        int count = 0;
        String targetC = " ";
        for (int i=0; i<name.length(); i++)
        {
            String c = name.substring(i, i+1); // 取出一個字母
            if (c.equals(targetC))
                count++;
        }
        System.out.println(targetC + " 出現次數：" + count);
    }
}
