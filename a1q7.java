import java.util.Scanner;
class a1q7{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int sol;
		for(int i=1;i<=10;i++)
		{
			sol = n * i;
			System.out.println(n+"x"+i+"="+sol);
		}
		
}
}
