import java.util.Scanner;
class Replace 
{

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);

		
		String var1 = "Hello, Happy new Year ";
		System.out.println("string is : "+var1);


		//Replacing the chaaracter or string using .replace("what to replace","with whom to replace") method
		System.out.println(var1.replace("e","8"));

		//Replacing only first char/String occurance using .replaceFirst() method
		System.out.println("Replacing only first char/String occurance using .replaceFirst() method");
		System.out.println(var1.replaceFirst("e","8"));
		
		
	}
}
