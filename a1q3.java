
import java.util.Scanner;
class a1q3{
	public static void main(String args[]){
		System.out.println("Enter two numbers: ");
		Scanner sc = new Scanner(System.in);
		float n1,n2;
		float ans;
		n1 = sc.nextFloat();
		n2 = sc.nextFloat();
		ans = n1/n2;
		System.out.println("The division of "+n1+" and "+n2+"is = "+ans);
	}
}
