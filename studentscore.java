package collection.array.assignment;

import java.util.*;

public class studentscore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
			        // Input size of array
	        System.out.println("Enter the size of the array:");
	        int n = scanner.nextInt();

	        // Input array elements
	        System.out.println("Enter the elements of the array separated by space:");
	        int[] scoresArray = new int[n];
	        for (int i = 0; i < n; i++) {
	            scoresArray[i] = scanner.nextInt();
	        }

	        // Create an ArrayList to store scores
	        ArrayList<Integer> scoresList = new ArrayList<>();

	        // Copy elements from array to ArrayList
	        for (int score : scoresArray) {
	            scoresList.add(score);
	        }

	        // Output the elements inside the ArrayList
	        System.out.println("Elements in the ArrayList:");
	        for (int score : scoresList) {
	            System.out.println(score);
	        }

	        scanner.close();
	}

}
