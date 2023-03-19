package week3practice;

import java.lang.reflect.Array;

public class Week3Labs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		int[] value = {1, 5, 2, 8, 13, 6};
		

		
		// 2. Print out the first element in the array
		

		System.out.println(value[0]);
		
		
		// 3. Print out the last element in the array without using the number 5
		System.out.println(value[value.length - 1]);
		
		// 4. Print out the element in the array at position 6, what happens?
		//System.out.println(value[6]);
		//There are only 5 elements in this array so this command will present an error of '6 out of bounds for length 6.
				
		// 5. Print out the element in the array at position -1, what happens?
		//System.out.println(value[-1]);
		// Here as far as I understand, the element count always starts at 0 and never -1 which is why we also get an error here. There are no assigned negative elements ever with arrays 
					
		// 6. Write a traditional for loop that prints out each element in the array
		
		for (int i = 0; i < value.length; i++)	{
			System.out.println(value[i]);
		}
		
		
		// 7. Write an enhanced for loop that prints out each element in the array
		
		for (int number : value)	{
			System.out.println(number);
		}
				
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
		
		int sum = 0;
		
		for (int i = 0; i < value.length; i++)	{
			sum = (sum + value[i]);
		}
		
		System.out.println(sum);
		
		
		// 9. Create a new variable called average and assign the average value of the array to it
		
		int average = 0;
		
		for (int i = 0; i < value.length; i++)	{
			average = (average + value[i]) % 6;
		}
		
		System.out.println(average);

				
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
		
		for(int i = 0; i < value.length; i++)	{
			if(value[i] % 2 != 0)	{
				System.out.println(value[i]);
			}
		}

				
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		
		String[] firstNames = {"Sam", "Sally", "Thomas", "Robert"};

				
		// 12. Calculate the sum of all the letters in the new array

		int sum1 = 0;
		
		for (String firstName : firstNames)	{
			sum1 += firstName.length();
		}
		
		
		//
		// Methods:
		//
				
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		
		greet("Chris");
		greet("Mom");
				
				
		// 14. Write and test a method that takes a String name and  
		// returns a greeting.  Do not print in the method.
		 greet1 ("Nick");
		 System.out.println(greet1("Nick"));
				
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		// 13 will print something, you can't store value here. 
		// 14 will return something, you can access value outside 
				
				
		// 15. Write and test a method that takes a String and an int and 
		// returns true if the number of letters in the string is greater than the int
		System.out.println(isStringLongerThanNumber("Hello", 3));
				
		// 16. Write and test a method that takes an array of string and a string and 
		// returns true if the string passed in exists in the array
		System.out.println(doesArrayContainString(firstNames, "Sam"));
				
		// 17. Write and test a method that takes an array of int and 
		// returns the smallest number in the array
//		System.out.println(smallestNumberInArray(array));
		
			
				
		// 18. Write and test a method that takes an array of double and 
		// returns the average
//		double[] doubles = {45.7, 30.2, 67.3};
//		System.out.println(calculateAverage(doubles));

		// 19. Write and test a method that takes an array of Strings and 
		// returns an array of int where each element
		// matches the length of the string at that position	
		int[] nameLengths =  extractStringLengths(firstNames);
		for (int number : nameLengths)	{
			System.out.println(number);
		}

						
		// 20. Write and test a method that takes an array of strings and 
		// returns true if the sum of letters for all strings with an even amount of letters
		// is greater than the sum of those with an odd amount of letters.
		
		System.out.println(hasMoreEvenWordCharacters(firstNames));
		
		

			
		// 21. Write and test a method that takes a string and 
		// returns true if the string is a palindrome
		
		System.out.println(isPalindrome("chris"));

	}
	
	// Method 13 Write and test a method that takes a String name and prints out a greeting. 
	// This method returns nothing.:
	
	public static void greet(String name)	{
		System.out.println("Hello, " + name + "!");
	}


	// Method 14 14. Write and test a method that takes a String name and  
	// returns a greeting.  Do not print in the method.:
	
	public static String greet1(String name)	{
		return "Hi, " + name + "!";
	}

	
	// boolean true/ false Method 15. Write and test a method that takes a String and an int and 
	// returns true if the number of letters in the string is greater than the int:
	
	public static boolean isStringLongerThanNumber(String string, int number)	{
		return string.length() > number;
	}
	
	

	
	// Method 16. Write and test a method that takes an array of string and a string and 
	// returns true if the string passed in exists in the array:
	
	public static boolean doesArrayContainString(String[] array, String string)	{
		for (String str : array)	{
			if (str.equals(string))	{
				return true;
			}
		}
		return false;
	}
	
	

	
	// Method 17 Write and test a method that takes an array of int and 
	// returns the smallest number in the array:
	
	public static int smallestNumberInArray(int[] numbers)	{
		int smallest = numbers[0];
		for (int number : numbers)	{
			
			if (number < smallest)	{
				smallest = number;
			}
		}
		return smallest;
	}

	
	// Method 18. Write and test a method that takes an array of double and 
	// returns the average:
	
//	public static double calculateAverage(double[array])	{
//		double sum = 0;
//		for (deouble number : array)	{
//			sum += number; 
//		}
//		return sum / array.le;
//	
//	}

	
	// Method 19. Write and test a method that takes an array of Strings and 
	// returns an array of int where each element
	// matches the length of the string at that position:
	
	public static int []	extractStringLengths(String[] strings)	{
		int[]	results = new int[strings.length];
		for (int i = 0; i < strings.length; i++)	{
			results[i] = strings[i].length();
		}
		return results;
	}

	
	// Method 20:
	
	public static boolean hasMoreEvenWordCharacters(String[] array)		{
		int evenLetters = 0;
		int oddLetters = 0;
		
		for (String string : array)	{
			if (string.length() % 2 == 0)	{
				evenLetters += string.length(); 
			} else {
				oddLetters += string.length();
			}
		}
		
		return evenLetters > oddLetters;
	}
	
	
	// Method 21. Write and test a method that takes a string and 
	// returns true if the string is a palindrome:
	
	public static boolean isPalindrome(String string)	{
		for (int i = 0; i < string.length() / 2; i++)	{
			if (string.charAt(i) != string.charAt(string.length() - i - 1))	{
				return false;
			}
		}
		return true;
	}


}
