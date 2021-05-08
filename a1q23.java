import java.util.Scanner;

public class a1q23 {

	public static void main(String[] args) 
	{
	String Hexa;
	Scanner s=new Scanner(System.in);
		
	System.out.println("Enter Binary no:");
	String x=s.next();
	int dec=Integer.parseInt(x,2);
		
	Hexa=Integer.toHexString(dec);
	System.out.println("HexaDecimal no:"+Hexa);
	}
}