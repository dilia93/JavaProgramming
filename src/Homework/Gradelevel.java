package Homework;

public class Gradelevel {

    public static void main(String[] args) {

        byte n = 7;                     // 1~ 18
        String gradeLevel = "";


        if (n >= 1 && n <= 18) {

            if (n >= 1 && n <= 5) {
                gradeLevel = "Elementary school";

            } else if (n >= 6 && n <= 8) {
                gradeLevel = "Middle school";

            } else if (n >= 9 && n <= 12) {
                gradeLevel = "High school";
            } else if (n >= 13 && n <= 16) {
                gradeLevel = "College";
            } else if (n >= 17 && n <= 18) {
                gradeLevel = "Grad school";
            } else {
                gradeLevel = "Invalid grade";
            }
            System.out.println(gradeLevel);
        }
    }
}

/*Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

 */