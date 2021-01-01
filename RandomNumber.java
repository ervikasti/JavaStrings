import java.util.Random;
class  RandomNumber
{
	public static void main(String[] args) 
	{
		Random ref = new Random();
		int no = ref.nextInt(49);
		System.out.println(no);
	}
}
