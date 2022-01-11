package Homework;

public class Equal_Numbers {

    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 20;
        int n3 = 10;

        boolean allEqual = n1 == n2 || n2 == n3;
        boolean n1n2 = n1 == n2;
        boolean n2n3 = n2 == n3;
        boolean n3n1 = n3 == n1;

        if (allEqual) {
            System.out.println("all Equal");
        } else if (n1n2) {
            System.out.println("n1n2");
        } else if (n2n3) {
            System.out.println("n2n3");
        } else if (n3n1) {
            System.out.println(n3n1);
        } else {
            System.out.println("None of them are equal");
        }
    }
}