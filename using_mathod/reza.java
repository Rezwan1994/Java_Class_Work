import java.util.Scanner;
class reza{
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		hello helloObject = new hello();
		System.out.println("Enter your name here: ");
		String name = input.nextLine();
		
		helloObject.SimpleMassage(name);
		
	}
}