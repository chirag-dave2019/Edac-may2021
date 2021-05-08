import java.util.*;
class a1q18{
public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
		
	System.out.println("Enetr 1 binary no:");
	String x=s.next();
	System.out.println("Enetr 2 binary no:");
	String y=s.next();
		
	int n1=Integer.parseInt(x,2);
	int n2=Integer.parseInt(y,2);
		
	int n3=n1*n2;
		
	Integer.toBinaryString(n1);
	Integer.toBinaryString(n2);
	System.out.println("n3= "+Integer.toBinaryString(n3));
	}
}
