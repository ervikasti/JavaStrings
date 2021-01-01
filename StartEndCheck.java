import java.util.Scanner;
class StartEndCheck 
{
	static
	{
		System.out.println("Program Checks Whether String starts with or ends with given substring \n");
	}

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);

		System.out.println("type the string");
		String var1 = s1.nextLine();

		//Take the substring
		System.out.println("Type the substring you want");
		String var2 = s1.nextLine();

		//Checking var1 starts with var2 using .startsWith() method 
		System.out.println("Does -->"+var1+" starts with "+var2+ " "+var1.startsWith(var2));
		
		//Checking var1 ends with var2 using .endsWith() method
		System.out.println("Does --> "+var1+" ends with "+var2+ " "+var1.endsWith(var2));
		
	}
}
