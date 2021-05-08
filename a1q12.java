import java.util.Scanner;

public class a1q12 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		double a,b,c,sum,avg;
		System.out.println("Enter 3 no:");
		a=s.nextDouble();
		b=s.nextDouble();
		c=s.nextDouble();
		
		sum=a+b+c;
		avg=sum/3;
		
		System.out.println("Addition of 3 no="+sum);
		System.out.println("Average of 3 no="+avg);
	}
}