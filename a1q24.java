import java.util.Scanner;

public class a1q24 {

	public static void main(String[] args) 
	{
		String Oct;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Binary no:");
		String x=s.next();
		int dec=Integer.parseInt(x,2);
		
		
		Oct=Integer.toOctalString(dec);
		System.out.println("Ocatal no:"+Oct);
	}
}