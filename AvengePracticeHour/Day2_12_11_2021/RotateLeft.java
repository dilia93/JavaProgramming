package Day2_12_11_2021;
import java.util.Scanner;
public class RotateLeft {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = "Hello";
        String temp = word.substring(2)+word.substring(0,2);

        System.out.println("temp = " + temp);



    }
}
