package week3practice;

public class Week3ArrayAndMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] students = new String[3];
		
		students[0] = "Chris Hernandez";
		students[1]	= "Tom Sawyer";
		students[2]	= "Jackie Chan";
		
		System.out.println(students[0]);
		System.out.println(students[1]);
		System.out.println(students[2]);
		
		for (int i = 0; i < students.length; i++)	{
			System.out.println(students[i]);
		}
		
		//to print every element in the array
		
		
		for (String student : students)	{
			System.out.println(student);
		}
		
		
		String[] products = new String[5];
		
		products[0]	= "Carrots";
		products[1]	= "Pinapples";
		products[2]	= "Tomatoes";
		products[3]	= "Potatoes";
		products[4]	= "Cereal";
		
		for (String product : products)	{
			System.out.println("Product: " + product);
		}
		
		int[] multiplesOf3 = new int[10];
		
		for(int i = 1; i <= multiplesOf3.length; i++)	{
			multiplesOf3[i - 1]	= i * 3;
			System.out.println("number: " + multiplesOf3[i - 1]);
		}
		
		String[] foodArray = {"Apple", "Carrots", "Milk", "Juice", "Probiotics"};
		
		for (int i = 0; i < foodArray.length; i++)	{
			System.out.println("Grocery Item: " + foodArray[i]);
			
			
			
			
			
			
		//multi deminsional array 
			
		 String[][] names = {
			            {"Mr. ", "Mrs. ", "Ms. "},
			            {"Smith", "Jones"}
			        };
		 // Mr. Smith
		 System.out.println(names[0][0] + names[1][0]);
		 // Ms. Jones
		 System.out.println(names[0][2] + names[1][1]);
		 
		 
		 
		 
		 //Array Manipulations/copy method/java.util.arrays
	        String[] copyFrom = {
	                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
	                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
	                "Marocchino", "Ristretto" };
	            
	            String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);        
	            for (String coffee : copyTo) {
	                System.out.print(coffee + " ");           
	            }            
			
			
		}
	
	}
	

}
