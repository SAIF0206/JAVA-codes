package array;

public class MultivalueArray {
	
	public static void main(String[] args) {
		int[][] worldsPopulation = {
				{1234,6543,54234,1265,3254},//Country 0
				{187654, 198753, 12453}, //Country 1
				{234,2134,222,2456} //Country 2
		};
		System.out.println("WorldPopulation [0]: " + worldsPopulation[0].length);
		System.out.println("WorldPopulation [0]: " + worldsPopulation[1].length);
		System.out.println("WorldPopulation [0]: " + worldsPopulation[2].length);
		
		//print the element in an array
		System.out.println("WorldPopulation [0]: " + worldsPopulation[0][1]);
		
		for(int i= 0 ; i<worldsPopulation.length; i++) {
			System.out.print("World population:" + "["+i+"] ");
			for(int j=0; j<worldsPopulation[i].length; j++) {
				System.out.print( worldsPopulation[i][j] + " ");
			}
	System.out.println();
		}
		
		for(int[]x: worldsPopulation) {
			for(int y: x) {
				System.out.println(y);
			}
		}
	}
	
	

}
