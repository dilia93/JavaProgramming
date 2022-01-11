package day11_Switch_Scanner;

public class NumberOfDays {

    public static void main(String[] args) {

        int number = 12;

        if(number >= 1 && number <=12){ // number: 1~12

            switch (number){
                case 2:
                    System.out.println("28 days");
                    break;

                case 4: case 6: case 9: case 11:
                    System.out.println("30 days");
                    break;

                default:
                    System.out.println("31 days");


            }



        }else {
            System.out.println("Invalid number");

        }


    }
}

/*
4. number of days
        28 days: 2
        30 days: 4,6,9,11
        31 days: 1,3,5,7,8,10,12
 */