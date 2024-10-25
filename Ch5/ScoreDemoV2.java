package Ch5;

import java.util.Scanner;

public class ScoreDemoV2 {
    public static void main(String[] args) {
        int score; 
        String grade;

        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入您的Java分數：");
        score = scn.nextInt();

        if (score == 0) {
            grade = "X";
        } else if (score <= 59) {
            grade = "F";
        } else if (score <= 62) {
            grade = "C-";
        } else if (score <= 66) {
            grade = "C";
        } else if (score <= 69) {
            grade = "C+";
        } else if (score <= 72) {
            grade = "B-";
        } else if (score <= 76) {
            grade = "B";
        } else if (score <= 79) {
            grade = "B+";
        } else if (score <= 84) {
            grade = "A-";
        } else if (score <= 89) {
            grade = "A";
        } else {
            grade = "A+";
        }

        System.out.println("等第成績：" + grade);
        scn.close();        
    }
}
