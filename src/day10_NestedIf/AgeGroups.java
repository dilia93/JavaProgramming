package day10_NestedIf;

public class AgeGroups {

    public static void main(String[] args) {
        int num = 25;
        String ageGroup = "";


        ageGroup = (num >= 21) ? "teenager" : (num >= 21 && num <= 55) ? "Adult" : (num >= 55) ? "Senior"
                : "Invalid";

        System.out.println("ageGroup = " + ageGroup);



       /* if(num <= 21){
             ageGroup = "Teenage";
         }else if(num >= 21 && num <= 55){
             ageGroup ="Adult";
         }else if (num >= 55){
             ageGroup = "Senior";
         }else{
             ageGroup = "Invalid";
        }

        System.out.println("ageGroup = " + ageGroup);

          */




    }
}

/*Create a class called AgeGroups, write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )

             if age is negative or greater than 150, print invalid

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

 */