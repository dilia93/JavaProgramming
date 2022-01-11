package day17_While_DoWhile;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;
        int result = 0;
        do{
            System.out.println("Enter a number");
        num = scan.nextInt();
        result +=num;

        }
        while (num>0);
        System.out.println(result-num);
    }

}
