import java.util.Scanner;

public class a1q17{

	public static void main(String[] args) 
	
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Ente 1:");
	String x=s.next();
		
	System.out.println("Enter 2:");
	String y=s.next();
		
	int n1=Integer.parseInt(x,2);
	int n2=Integer.parseInt(y,2);
		
		
		
	System.out.println("n1 :"+Integer.toBinaryString(n1));
	System.out.println("n2 :"+Integer.toBinaryString(n2));
	int n3=n1+n2;
	System.out.println("n3=n1+n2 :"+Integer.toBinaryString(n3));	
	}
}