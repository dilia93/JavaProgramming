package day28_ArrayList;

import java.util.ArrayList;

public class DinnerMultiplyOddNumbers {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println(numbers);

         ArrayList<Integer> list = new ArrayList<>();
         for(Integer each:numbers){
             if(each %2 != 0){
                 each*=2;
             }
             list.add(each);
         }
        System.out.println(list);
        }
    }



/*
write a program that can multiply each odd number by 2
	            ex: list = [1,2,3,4,5];
	                output: [2,2,6,4,10]

 */