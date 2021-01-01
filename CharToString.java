
class CharToString 
{
	public static void main(String[] args) 
	{
		char ch[] = {'a','b','c'};
		
		//Converting Char into String using new keyword
		String s1 = new String(ch);
		System.out.println("Converting Char into String using new keyword\n");
		System.out.println(s1);

		//Converting Char array int string using .valueOf() method
		System.out.println("Converting Char array int string using String.valueOf(character Array) method \n");
		System.out.println(String.valueOf(ch));
	}
}
