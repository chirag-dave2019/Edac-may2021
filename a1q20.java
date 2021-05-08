import java.util.Scanner;

public class a1q20{

	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
		
	System.out.println("Enter Decimal no:");
	int x=s.nextInt();
	String y=Integer.toHexString(x);
	System.out.println("HexaDecimal no:"+y);
	}
}