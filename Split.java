import java.util.Scanner;
class Split 
{
	static
	{
		System.out.println("Split method convert a string into Arrays of String\t The seperator is reoved from the String \n");
	}

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		/*System.out.println("Enter the line");
		String var = s1.nextLine();*/
		 String var = "Happy new year to all";
		System.out.println(var+"\n");
		System.out.println("Enter the seperator with which you want you split");
		String var1 = s1.nextLine();

		//Split() converts string into arrays
		String s[] = var.split(var1);

		//Displaying the spilleted array
		for (int i=0;i<s.length ;i++ )
		{
			System.out.println(s[i]);
		}
		System.out.println();

		//Split() converts string into arrays here we are taking another parameter to limit on the number of splits found
		String s3[] = var.split(var1,2);

		//Displaying the spilleted array
		for (int i=0;i<s3.length ;i++ )
		{
			System.out.println(s3[i]);
		}
		
	}
}
