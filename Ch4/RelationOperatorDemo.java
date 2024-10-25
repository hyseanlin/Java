
package Ch4;

public class RelationOperatorDemo
{
    public static void main(String[] args) {
        int score, passThreshold;
        boolean passOrNot;

        passThreshold = 60;
        score = 50;

        passOrNot = score >= passThreshold;

        System.out.println("Pass or not: " + passOrNot);


    }

}