import java.util.Scanner;
class Trim 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the String with trialing/Leading or both side using spaces");
		String var = s1.nextLine();
		System.out.println(var.trim());
	}
}
