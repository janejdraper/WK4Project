package wk4Project1;

import java.lang.StringBuilder; //for wordRepeater()
import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
		
		//		Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		//		Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		ages[ages.length-1] -= ages[0];
		for (int i=0; i<ages.length; i++) {
			if (i<ages.length-1) {
				System.out.print(ages[i] + ", ");
			} else {
				System.out.println(ages[i]); //wanted to add commas without one at the end.
			}
		}
		
		//		Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		int[] agesNew = {3, 9, 23, 64, 2, 8, 28, 93, 17};
		agesNew[agesNew.length-1] -= agesNew[0];
		for (int i=0; i<agesNew.length; i++) {
			if (i<agesNew.length-1) {
				System.out.print(agesNew[i] + ", ");
			} else {
				System.out.println(agesNew[i]); //wanted to add commas without one at the end.
			}
		}
		
		//		Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		double totAge = 0;
		for (int i=0; i<agesNew.length; i++) {
			totAge += agesNew[i];
		}
		double avgAge = totAge/agesNew.length;
		System.out.println("Average Age = " + avgAge);
		
		
		//		Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		//		Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		double totLength = 0;
		for (int i=0; i<names.length; i++) {
			totLength += names[i].length();
		}
		double avgLength = totLength/names.length;
		System.out.println("Average Length = " + avgLength);
		
		//		Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		String concatNames = names[0];
		for (int i=1; i<names.length; i++) {
			concatNames += " " + names[i];
			}
		System.out.println(concatNames);
		
		//		How do you access the last element of any array?
				// For fixed length, use array[#-1] where # is the number of elements in the array
				// For unknown length (or changing), use array[array.length-1]. 
				
		//		How do you access the first element of any array?
				// The first element is always in the "0" position. Simply use array[0]
		
		
		//		Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		int[] nameLengths = new int[names.length];
		for (int i=0; i<names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		//		Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		int sumNameLength = 0;
		for (int i=0; i<nameLengths.length; i++) {
			sumNameLength += nameLengths[i];
		}
		System.out.println(sumNameLength);
		
//METHOD CALLING
		System.out.println(wordRepeater(names[3], ages[2]));
		
		System.out.println("Fullname is " + fullNameMaker(names[0], names[4]));
		
		System.out.println("Is the sum greater than 100 for ages[]? " + greaterThan100(ages));
		int[] extra = {5, 6, 23};
		System.out.println("Is the sum greater than 100 for extra[]? " + greaterThan100(extra));
		
		double[] numbers1 = {3.14159, 1.414, 25, 0.866};
		System.out.println("Average of elements: " + avgElements(numbers1));
		
		double[] numbers2 = {23, 6, 51};
		double[] numbers3 = {10000, 250};
		System.out.println("Average of numbers1 is bigger than numbers2? " + avgCompare(numbers1, numbers2));
		System.out.println("Average of numbers3 is bigger than numbers2? " + avgCompare(numbers3, numbers2));
				
		boolean hot1 = true;
		boolean hot2 = false;
		double pocketChange1 = 11.20;
		double pocketChange2 = 1.50;
		System.out.println("It's hot and you've got $" + pocketChange1 + ". Drink today? " + willBuyDrink(hot1, pocketChange1));
		System.out.println("It's hot and you've got $" + pocketChange2 + ". Drink today? "  + willBuyDrink(hot1, pocketChange2));
		System.out.println("It's not hot and you've got $" + pocketChange1 + ". Drink today? "+ willBuyDrink(hot2, pocketChange1));
		System.out.println("It's not hot and you've got $" + pocketChange2 + ". Drink today? " + willBuyDrink(hot2, pocketChange2));
		
		System.out.println(factorialFinder(7));
	}		
		
//METHODS - OUTSIDE MAIN BODY	
	//		Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	public static String wordRepeater(String word, int n) {
		StringBuilder repeats = new StringBuilder();
		for (int i = 0; i < n; i++) {
			repeats.append(word);
		}
		return repeats.toString();
		 
	}
	//		Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
	public static String fullNameMaker(String firstName, String lastName) {
		StringBuilder fullName = new StringBuilder();
		fullName.append(firstName);
		fullName.append(" " + lastName);
		return fullName.toString();
	}
	
	//		Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	public static boolean greaterThan100(int[] numbers) {
		int sum = 0;
		for (int i=0; i<numbers.length; i++) {
			sum += numbers[i];
		}
		return (sum>100);
	}
	
	//		Write a method that takes an array of double and returns the average of all the elements in the array.
	public static double avgElements(double[] elements) {
		double totEle = 0;
		for (int i=0; i<elements.length; i++) {
			totEle += elements[i];
		}
		return totEle/elements.length; 
	}
	
	//		Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	public static boolean avgCompare(double[] array1, double[] array2) {
		double avgArray1 = avgElements(array1);
		double avgArray2 = avgElements(array2);
		return avgArray1 > avgArray2;
	}
	
	//		Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && moneyInPocket>10.50;
	}
	
	
	//		Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	//		This method will take the speed of your travel and 
	public static int factorialFinder(int start) {
		int finalProduct = 1;
		for (int i=start; i>0; i--) {
			finalProduct = i*finalProduct;
		}
		return finalProduct;
		}
	

}
