package day28_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class DinnerSwapElement {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println(numbers);

        Collections.swap(numbers, 0, 4);
        System.out.println(numbers);
    }
}


/*

write a program that can swap the first and last elements of an integer arraylist
	            ex:
	                list = [1,2,3,4,5];
	                output: [5,2,3,4,1];
 */