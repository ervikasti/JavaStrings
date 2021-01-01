//String is non-pemitive data type

import java.util.Scanner;
class  FindSubString
{

	static
	{
		System.out.println("Hello from Static Block,");
		System.out.println("I am executed during Class loading Operation before Main Method,");
		System.out.println("Tata bye-bye");
	}

	public static void main(String [] args) 
	{
		Scanner s1 = new Scanner(System.in);
		String var1 = "Hello from Static Block,I am executed during Class loading Operation before Main Method,Tata bye-bye";
		System.out.println();		
		System.out.println("Enter String/Char to check it's present inside the above passage");
		String var = s1.nextLine();
		
		//Finding given string is present inside Var1 String or Not using string.contains(substring) method
		System.out.println("Is string present  "+ var1.contains(var));

	}
}
