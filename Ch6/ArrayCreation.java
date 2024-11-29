package Ch6;
public class ArrayCreation
{
    public static void main(String[] args) {
        int[] scores;
        scores = new int[5];

        double heights[];
        heights = new double[5];

        String[] names;
        names = new String[5];

        String[] courses = {"C++", "Java", "Python", "R", "C#"}; // initialization list

        for (int i=0; i<courses.length; i++)
        {
            System.out.println(courses[i]);
            courses[i] = "NONE";
        }

        for (String course: courses)
        {
            System.out.println(course);
            course = "NONE";
        }
        for (String course: courses)
        {
            System.out.println(course);
        }
        

    }
}