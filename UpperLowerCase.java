//String is non-pemitive data type

import java.util.Scanner;
class  UpperLowerCase
{

	static
	{
		System.out.println("Hello from Static Block");
		System.out.println("I am executed during Class loading Operation before Main Method");
		System.out.println("Tata bye-bye");
	}

	public static void main(String [] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter two  String2");
		System.out.println("Enter 1st String");
		String var1 = s1.nextLine();
		System.out.println("Enter 2nd String");
		String var2 = s1.nextLine();
		
		//Converting String one in upper case using .toUpperCase()
		var1 = var1.toUpperCase();
		System.out.println("UpperCase String1 :"+ var1);

		//Converting String twoi] in lower case using .toLowerCase() method
		System.out.println("LowerCase String2 :"+ var2.toLowerCase());
	}
}
