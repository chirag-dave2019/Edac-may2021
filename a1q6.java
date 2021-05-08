import java.util.*;
public class a1q6{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two numbers: ");
	float n1,n2;
	float add,sub,mul,div,rem;
	n1 = sc.nextFloat();
	n2 = sc.nextFloat();
	add = n1 + n2;
	sub = n1 - n2;
	mul = n1 * n2;
	div = n1 / n2;
	rem = n1 % n2;
	System.out.println("The calculations for addition is =  " +add+" ,subraction is "+sub+" ,multiplication is "+mul+" ,division is "+div+"\n and remmainder is "+rem);
	}
}
			