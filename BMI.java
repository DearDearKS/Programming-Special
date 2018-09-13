package workshop1_2;
import java.util.Scanner;
public class BMI 
{	public static void main (String[] args)
	{	Scanner sc = new Scanner(System.in);
		System.out.print("Height (cm.) =>\t");
		int height = sc.nextInt();
		System.out.print("Weight (Kg.) =>\t");
		int weight = sc.nextInt();
		System.out.println("-------------------------------");
		double bmi = weight/((height*height)/10000.00);
		System.out.printf("BMI =>\t%.1f", bmi);
		if ( bmi < 18.5 || bmi == 18.5 ) 
		{	System.out.print("\tToo skinny");}
		else if( bmi == 18.6 || bmi < 23.0 )
		{	System.out.print("\tNormal weight");}
		else if( bmi == 23.0 || bmi < 25.0 )
		{	System.out.print("\tOver weight");}
		else if( bmi == 25.0 || bmi < 30.0 )
		{	System.out.print("\tFat");}
		else if( bmi == 18.6 || bmi < 22.9 )
		{	System.out.print("\tVery fat");}	
	}
}
