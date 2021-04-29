package basecamp;

//create two 1D arrays
//subtract first array with second array
//store subtracted in resultant array
//create new array and store only negative elements

import java.util.Scanner;

//comments
//not to use same line of code, if there is same task
//meaningfull name should be given
//if possible use single for loop avoid nested loop
//naming format

public class Question1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 1st and 2nd 1D array size");
		int size = scan.nextInt();
		int[] Arr= new int[size];

		System.out.println("enter 1st 1D " + size + " elements");
		for (int i = 0; i < firstArr.length; i++) {
			firstArr[i] = scan.nextInt();
		}

		int[] secondArr = new int[size];

		System.out.println("enter 2nd 1D " + size + " elements");
		for (int i = 0; i < secondArr.length; i++) {
			secondArr[i] = scan.nextInt();
		}

		int[] resultantArr = subtractFirstAndSecondArray(firstArr, secondArr);
		display(resultantArr);

		// int noOfNegativeCount = checkNegativeCount(resultantArr);
		int[] newArr = newArray(resultantArr, checkNegativeCount(resultantArr));
		displayNewArray(newArr);

	}

	// to display new array
	private static void displayNewArray(int[] newArr) {
		// TODO Auto-generated method stub
		System.out.println("Array with negative numbers ");
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");

		}

	}

	// create new array and return
	private static int[] newArray(int[] resultantArr, int count) {
		// TODO Auto-generated method stub

		System.out.println();
		int j = -1;
		int[] newArr = new int[count];
		for (int i = 0; i < resultantArr.length; i++) {
			if (resultantArr[i] < 0) {
				// System.out.println(resultantArr[i]);
				j++;
				newArr[j] = resultantArr[i];

			}
		}
		return newArr;
	}

	// check no of negative elements in an array
	private static int checkNegativeCount(int[] resultantArr) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < resultantArr.length; i++) {
			if (resultantArr[i] < 0) {
				count++;
			}
		}
		return count;

	}

	// display the Resultant array
	private static void display(int[] resultantArr) {
		// TODO Auto-generated method stub
		System.out.println("Resultant array");
		for (int i = 0; i < resultantArr.length; i++) {
			System.out.print(resultantArr[i] + " ");
		}

	}

	// subtract the first and second array and return
	private static int[] subtractFirstAndSecondArray(int[] firstArr, int[] secondArr) {
		// TODO Auto-generated method stub
//		for (int i = 0; i < firstArr.length; i++) {
//			for (int j = 0; j < secondArr.length; j++) {
//				if (i == j) {
//					firstArr[i] = firstArr[i] - secondArr[j];	
//				}
//			}
//		}  
//		for (int i = 0,j=0; i < firstArr.length && j< secondArr; i++,j++) {
//			if (i == j) {
//		firstArr[i] = firstArr[i] - secondArr[i];
//			}
//		}

		// use single for loop for multiple for loops
		for (int i = 0; i < firstArr.length; i++) {
			// if (i == j) {
			firstArr[i] = firstArr[i] - secondArr[i];
			// }
		}
		return firstArr;
	}
}
