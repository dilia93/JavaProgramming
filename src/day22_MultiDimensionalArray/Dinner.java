package day22_MultiDimensionalArray;

import java.util.Arrays;
public class Dinner {

    public static void main(String[] args) {
        int array[][] = {{1, 2, 3}, {4, 5, 6}};


        for (int i = array.length-1; i>=0; i--){
            for(int j = array[i].length-1; j>=0; j--){
                System.out.println(array[i][j]+ " " );
            }
        }
            }
        }









    /*
    1. Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};


		output:
			reverse = { {6,5,4}, {3,2,1},};
     */
