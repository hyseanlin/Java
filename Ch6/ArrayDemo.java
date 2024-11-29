package Ch6;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] scores = new int[5];
        for (int i=0; i<scores.length; i++)
        {
            System.out.println(scores[i]);
        }

        String name = "Sean Lin";
        for (int i=0; i<name.length(); i++)
        {
            System.out.println(name.substring(i, i+1));
        }
    }
}
