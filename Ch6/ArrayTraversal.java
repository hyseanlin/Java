package Ch6;

public class ArrayTraversal {
    public static void main(String[] args) {
        int[] scores = new int[5];

        scores[0] = 100;
        scores[1] = 80;
        scores[2] = 90;
        scores[3] = 45;
        scores[4] = 60;

        for (int i=0; i<scores.length; i++)
            System.out.println("scores[" + i + "]=" + scores[i]);

        System.out.println("----------");
        for (int i=scores.length-1; i>=0; i--)
            System.out.println("scores[" + i + "]=" + scores[i]);


    }
}
