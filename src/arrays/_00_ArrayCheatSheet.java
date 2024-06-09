package arrays;

import java.lang.reflect.Array;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class _00_ArrayCheatSheet {
	

	
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] five = {
				"String", "1", "2", "3", "4", "5"
		};
		//2. print the third element in the array
	//	System.out.println(five[3]);
		
		//3. set the third element to a different value
		five[3] = "22";
		//4. print the third element again
//		System.out.println(five[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i<6; i++) {
//			System.out.println(five[i]);
		}
		Random r = new Random();
		//6. make an array of 50 integers
		int[] fifty = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for(int a = 0; a<50; a++) {
			fifty[a] = r.nextInt(100);
		}
		
		//8. without printing the entire array, print only the smallest number in the array
	int check = 100;
		for(int i = 0; i<50; i++) {
			if(fifty[i] < check) {
				check = fifty[i];
			}
		}
		System.out.println(check);
		//9 print the entire array to see if step 8 was correct
		for(int i = 0; i<fifty.length; i++) {
		//	System.out.println(fifty[i]);
		}
		//10. print the largest number in the array.
		check = 0;
		for(int i = 0; i<50; i++) {
			if(fifty[i]> check) {
				check = fifty[i];
			}
		}
		System.out.println(check);
		
	}
}
