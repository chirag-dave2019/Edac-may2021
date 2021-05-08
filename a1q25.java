import java.util.Scanner;

public class a1q25{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Decimal no:");
		String x=s.next();
		int oct=Integer.parseInt(x,8);
		System.out.println("Ocatal no:"+oct);

	}
}