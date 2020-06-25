package array;
import java.util.*;
//Find Minimum Index and Minimum value in an array
public class Minimum {

	//Function to print an array
	public static void print(String name, int a[]) {
		System.out.print(name + "= [");
		for(int i = 0; i < a.length-1; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.println(a[a.length-1] + "]");
	}
	
	//Function to find minimum value in an array
	public static int min(int a[]) {
		int var = a[0];
		for(int i = 1; i< a.length; i++) {
			if(a[i] < var) {
				var = a[i];
			}
		}
		return var;
	}
	
	//Function to print min index
	public static int minIndex(int a[]) {
		int index = 0;
		int var = a[0];
		for(int i = 1; i<a.length; i++) {
			if(a[i] < var) {
				var = a[i];
				index = i;
			}
		}
		return index;
	}
	
	//main Function
	public static void main(String args[]) {
		int[] arrayA = {1,2,0,3,4,5};
		int [] arrayB = new int[10];
		for(int i = 0; i< arrayB.length; i++) {
			arrayB[i] = (int) (Math.random()*100);
		}
		print("A", arrayA);
		System.out.println("Minimum Value of Array= " + min(arrayA));
		System.out.println("Index = " + minIndex(arrayA));
		print("A", arrayB);
		System.out.println("Minimum Value of Array= " + min(arrayB));
		System.out.println("Index = " + minIndex(arrayB));
	}
}
