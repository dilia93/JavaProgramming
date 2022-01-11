package day10_NestedIf;

public class SalaryAfterTax {

    public static void main(String[] args) {


        int salary = 70000;
        boolean isMarried = true;
        double tax35 = (salary - (salary * 0.35));
        double tax30 = (salary - (salary * 0.30));
        double tax25 = (salary - (salary * 0.25));
        double tax20 = (salary - (salary * 0.20));
        double tax15 = (salary - (salary * 0.15));


        if (isMarried && salary >= 130000) {
            System.out.println("after tax = " + tax35);
        } else if (isMarried && salary >= 129000 || isMarried && salary <= 100000) {
            System.out.println("after tax = " + tax30);
        } else if (isMarried && salary >= 80000 || isMarried && salary <= 99000) {
            System.out.println("after tax = " + tax25);
        } else if (isMarried && salary >= 79000) {
            System.out.println("after tax = " + tax20);
        } else if (isMarried && salary <= 79000) {
        } else {
            System.out.println("Invalid");
        }


    }
}