import java.util.Scanner;

class ReverseString 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the String");
		String var = s1.nextLine();

		//Converting the var into uppercase using .toUpperCase
		var = var.toUpperCase();

		//Declaring an empty string var
		String s = "";

		//Converting String var into character Array using .toCharArray()
		char ch[] = var.toCharArray();
		
		//Reversing the String
		System.out.println("Reversing the array");
		for (int i=0;i<ch.length ;i++ )
		{
			s = ch[i]+s;
			
			System.out.println(s);
		}

		//Displaying the reversed String
		System.out.println("The reversed String is "+s);
	}
}
	