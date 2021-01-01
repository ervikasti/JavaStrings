//String is non-pemitive data type

import java.util.Scanner;
class  EqualsMethods
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
		
		//Checking Strings are having same address
		if (var1 == var2)
		{
				System.out.println("Same Adrress in Constant Pool");
		}
		//Checking String having same value using .equals() method
		else if (var1.equals(var2))
		{
				System.out.println("Both String have same value ");
		}

		//Checking String value are equal or not by Ignoring there Upper or Lower case
		else if (var1.equalsIgnoreCase(var2))
		{
			System.out.println("Both values are equal using .EqualsIgnoreCase() Method");
		}
		else
		{
					System.out.println("Unique values");
		}

	}
}
