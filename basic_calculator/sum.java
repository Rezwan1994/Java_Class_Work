import java.util.Scanner;
class sum
{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		double fname,sname,answer;
		System.out.println("Enter your first num:");
		fname=input.nextDouble();
		System.out.println("Enter your second num:");
		sname=input.nextDouble();
		answer=fname+sname;
		System.out.println(answer);
		
	}
}