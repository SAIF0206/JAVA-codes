package dynamicArray;

import java.util.Arrays;

public class Array {
	private int[] items;
	private int count;
	public Array(int length) {
		items = new int[length];
	}
	//insert an element in an Array
	public void insert(int item) {
		//If array is full resize it
		if(items.length == count) {
			
			//create new Array twice the sieze of old
			int[] newItem = new int[count * 2];
			
			//copy the old array to new array
			for(int i= 0 ; i < count; i++) {
				newItem[i] = items[i];
			}
			
			//set items to newArray
			items = newItem;
		}
		items[count] = item;
		count++;
	}
	
	//remove from array
	public void removeAt(int index) {
		//validate the index
		if(index < 0 || index >= count)
			throw new IllegalArgumentException();
		for(int i = index; i< count; i++) {
			items[i] = items[i+1];
			
		}
		count--;
	}
	
	public int indexof(int item) {
		for(int i=0; i<count; i++) {
			if(items[i] == item) {
				return i;
			}
		}
		return -1;
	}
	
	public int max() {
		int largest = items[0];
		for(int i = 1; i< count; i++) {
			if(items[i] > largest)
				largest = items[i];
		}
		return largest;
	}
	
	public void print() {
		System.out.print("[");
		// TODO Auto-generated method stub
		for(int i= 0 ; i< count-1; i++) {
			
			System.out.print(items[i]+",");
		}
		System.out.print(items[count-1]+"]\n");
		
		
		
	}
	
	public void reverseArray() {
		System.out.print("[");
		for(int i = count-1; i>0 ; i--) {
			System.out.print(items[i]+ ",");
		}
		System.out.println(items[0]+ "] \n");
	}
	
	public void insertAt(int item, int index) {
		
		for(int i=count ; i > index; i--) {
			items[i] = items[i-1];
		}
		items[index] = item;
		count++;
	}
}
