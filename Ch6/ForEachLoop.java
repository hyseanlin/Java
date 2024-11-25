package Ch6;

public class ForEachLoop {
    public static void main(String[] args) {
        String[] courses = {"C++", "Java", "Python", "R", "C#"}; // initialization list

        for (String course: courses)
        {
            System.out.println(course);
        }

        // A
        int[] scores = {78, 60, 90, 50, 49};
        for (int score: scores)
        {
            System.out.println(score);
        }

        for (int score: scores)
        {
            System.out.println(score);
        }

        // B
        for (int i=0; i<scores.length; i++)
        {
            System.out.println(scores[i]);
            scores[i] = 100;
        }

        for (int i=scores.length-1; i>=0; i--)
            System.out.println(scores[i]);


    }
}
