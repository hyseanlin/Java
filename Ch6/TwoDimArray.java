package Ch6;

public class TwoDimArray {
    public static void main(String[] args) {
        int[][] scores = {
                          {20, 50, 80, 100},    // 第r=0列
                          {90, 40, 30,  10},    // 第r=1列
                          { 2,  5,  8,   1},    // 第r=2列
                         };


        for (int[] row_scores: scores)
        {
            for (int score: row_scores)
            {
                System.out.print(score + ", ");
            }
            System.err.println();

        }


        // for (int r=0; r<scores.length; r++)
        // {
        //     for (int c=0; c<scores[r].length; c++)
        //     {
        //         System.out.print("scores[" + r + "][" + c + "]=" + scores[r][c] + ", ");
        //     }
        //     System.out.println();
        // }

        
        // for (int c=0; c<scores[0].length; c++)
        // {
        //     for (int r=0; r<scores.length; r++)
        //     {
        //         System.out.print("scores[" + r + "][" + c + "]=" + scores[r][c] + ", ");
        //     }
        //     System.out.println();
        // }

    }
}
