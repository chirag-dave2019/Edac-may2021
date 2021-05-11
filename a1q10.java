import java.util.*;
class a1q10{
	public static void main(String args[]){
		double formula = 1.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		for(double i=1; i<=n;i=i+2)
		{
			double series1 = (formula/i);
			double series2 = (formula/i);
			formula = 4*(series1 - series2);
		}
		System.out.println(formula);
	}
}


//4*((1/1)-(1/3)+1/5-...)