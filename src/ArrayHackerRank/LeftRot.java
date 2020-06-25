package ArrayHackerRank;

import java.util.Arrays;


/*
A left rotation operation on an array shifts each of the array's elements  unit to the left. For example, if  left rotations are performed on array , then the array would become .

Given an array  of  integers and a number, , perform  left rotations on the array. Return the updated array to be printed as a single line of space-separated integers.
 */
public class LeftRot {

	// Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        for(int j = 0; j<d;j++){
            int temp = a[0];
            for(int i = 0; i< a.length-1; i++){
                a[i] = a[i+1];
            }
            a[a.length-1] = temp;
        }
        System.out.println("I am in rotate left");
        System.out.println(Arrays.toString(a));
        return a;
        }
    public static void main(String[] args) {
    	int[] a = {1,2,3,4,5};
    	int d = 2;
    	System.out.println(Arrays.toString(a));
	    rotLeft(a,d);

		
	}
}
