import java.util.Scanner;

public class a1q15{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter two no:");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("Before swap value of a,b:"+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swap value of a,b:"+a+" "+b);

	}
}