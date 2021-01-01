//String is non-pemitive data type

import java.util.Scanner;
class  FindChar
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
		System.out.println("Enter the Index Number to find which char is at which Index");
		int var = s1.nextInt();
		
		//Finding which value is Present at what Index using stringvariable.charAt(indexno.)
		System.out.println("The char at "+ var +" index is "+var1.charAt(var));

	}
}
