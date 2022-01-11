package day13_String;
import java.util.Scanner;
public class replit3 {

    public static void main(String[] args) {


        System.out.println("Enter full name: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        if (name.equalsIgnoreCase("Max Payne")|| name.equalsIgnoreCase("Alan Wake")) {
            System.out.println("User found! ");
        }else{
            System.out.println("User not found! ");
        }


    }
}