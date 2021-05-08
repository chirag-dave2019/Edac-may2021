
import java.util.Scanner;
class a1q5{
	public static void main(String args[]){
		System.out.println("Enter two numbers: ");
		Scanner sc = new Scanner(System.in);
		int n1,n2;
		int ans;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		ans = n1*n2;
		System.out.println("The multiplication of "+n1+" and "+n2+" is = "+ans);
	}
}
	
