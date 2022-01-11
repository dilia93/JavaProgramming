package day10_NestedIf;

public class Grade {

    public static void main(String[] args) {

        char variable = 'B';
        String grade ="";

        if (variable == 'A') {
            grade = "Excellent";
        }else if(variable == 'B'){
            grade ="Great job";
        }else if(variable == 'C'){
            grade = "Good";
        }else if(variable == 'D'){
            grade = "Passed";
        }else if(variable == 'F'){
            grade = "Failed";
        }else{
            grade="Invalid";
        }

        System.out.println("grade = " + grade);




    }
}


/*
Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */