package Homework;
import java.util.Scanner;
public class Burger {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String in = s.next();

        double output = 0;

        switch (in){
            case "chicken":
            case "burger":
                output =10.0;
                break;
            case "soda":
                output = 2.0;
                break;
            case "fries":
                output = 3.5;
                break;


        }
        System.out.println(output);
        }


    }


/*
 fast food company has two main order types, burger meal and chicken meal.

Both have the same prices, so if a cashier enters "burger" or "chicken " he will get the same price of 10.0.

If the order is burger price is 10.0
If the order is chicken price is 10.0
If the order is soda price is 2.0
If the order is fries price is 3.5
hint: or operator in java is ||

Examples:

burger

10.0
burger

10.0
chicken

10.0
chicken

10.0
soda

2.0
 */
