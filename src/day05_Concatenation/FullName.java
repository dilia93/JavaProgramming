package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Jimmy";
        String lastName = "King";
        int age = 45;
        String jobTitle = "Senior SDET";
        String companyName = "Apple Inc";
        double salary = 10000.58;

        String fullName = firstName + " " + lastName;

        // Full name of the person is ____

        System.out.println("Full name of the person is " + fullName);

        //____ is ____ years old

        System.out.println(fullName + " is " + age + " years old" );

        //FullName is JobTitle, works at CompanyName

        System.out.println(fullName + " is " + jobTitle +", works at " + companyName
                +", and "+fullName +"'s salary is $"+salary);

    }
}

