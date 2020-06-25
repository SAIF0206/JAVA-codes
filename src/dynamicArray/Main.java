package dynamicArray;

//Create Dynamic Array
public class Main {
	public static void main(String[] args) {
		Array numbers = new Array(3);
		numbers.insert(10);
		numbers.insert(20);
		numbers.insert(30);
		numbers.insert(40);
		numbers.insert(50);
		//numbers.removeAt(1);
		System.out.println(numbers.indexof(20));
		System.out.println("Largest element in an Array: " + numbers.max());
		
		numbers.print();
		
		System.out.println("Reversed array");
		numbers.reverseArray();
		
		numbers.insertAt(60,3);
		numbers.print();
	}
}
