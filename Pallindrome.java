import java.util.Scanner;
class Pallindrome 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the String");
		String var = s1.nextLine();
		String s2 = "";//there should be now space btw double inverted commas

		//Converting the var in lower case
		var  = var.toLowerCase();
		
		
		//converting the string into char Array to reverse it
		char ch[] = var.toCharArray();

		System.out.println("Checking it is pallindrome or not \n");

		//Reversing the String
		System.out.println(" --> Reversing the string");

		for (int i=0;i<ch.length ;i++ )
		{
			s2 = ch[i]+s2;
			System.out.println(s2);
		}

		System.out.println();

		// checking the both string (var and s2 )are equal or not using .equals() method
		if (var.equals(s2))
		{
			System.out.println("It is pallindrome ");
		}
		else
		{
			System.out.println("It is not a pallindrome");
		}


		
	}
}
