package Ch5;

import java.util.Scanner;

public class ScoreDemo {
    public static void main(String[] args) {
        int score; 
        String grade;

        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入您的Java分數：");
        score = scn.nextInt();

        if (score >= 90) {
            grade = "A+";
        } else if (score >=85) {
            grade = "A";
        } else if (score >=80) {
            grade = "A-";
        } else if (score >=77) {
            grade = "B+";
        } else if (score >=73) {
            grade = "B";
        } else if (score >=70) {
            grade = "B-";
        } else if (score >=67) {
            grade = "C+";
        } else if (score >=63) {
            grade = "C";
        } else if (score >=60) {
            grade = "C-";
        } else if (score >=1) {
            grade = "F";
        } else {
            grade = "X";
        }

        System.out.println("等第成績：" + grade);
        scn.close();        
    }
}
