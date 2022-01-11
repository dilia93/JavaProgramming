package day10_NestedIf;

public class OxygenTank {
    public static void main(String[] args) {


        int oxyjenTank = 87;
        String level = " ";

        if (oxyjenTank >= 50 && oxyjenTank <= 100) {

            if (oxyjenTank >= 90)
                level = "Your tank is full";
            else if (oxyjenTank >= 80)
                level = "Still okay";
            else if (oxyjenTank >= 70)
                level = "Don't go too far";
            else if (oxyjenTank >= 60)
                level = "Start to head back";
            else {
                level = "Be careful now you at at 50%";
            }
        } else {
            level = "Not Level";
        }
        System.out.println(level);

    }




}



/*Create a class called OxygenTank. You are diving in the ocean. Your oxygen
    tank has a certain level (number) and you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY

 */