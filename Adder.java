package workshop1_1;
import java.util.Scanner;
public class Adder 
{	public static void main (String[] args)
	{	Scanner sc = new Scanner(System.in);
		System.out.print("Num1 => ");
		int num1 = sc.nextInt();
		System.out.print("Num2 => ");
		int num2 = sc.nextInt();
		int sum = num1+num2 ;
		System.out.print("Sum => "+sum);		
	}
}
