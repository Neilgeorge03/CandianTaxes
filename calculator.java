import java.text.NumberFormat;
import java.util.Scanner;

public class Calculator {
	
  private static Scanner sc;

	public static void main(String[]args) {
		double ans1,ans2,income;
		/* Provincial/State prices */
		double P1= 43790;
		double P2= 87575;
		double P3= 106555;
		/* Provincial/State taxes */
		double t1= .15;
		double t2= .20;
		double t3= .24;
		double t4= .2575;
		/* Federal prices */
		double F1= 47630;
		double F2= 95259;
		double F3= 147667;
		double F4= 210371;
		/* Federal taxes */
		double T1= .15;
		double T2= .205;
		double T3= .26;
		double T4= .29;
		double T5=.33;
		
		sc= new Scanner(System.in);
		System.out.println("How	do	you	make a year?");
		income= sc.nextDouble();
			
			/*Provincial Tax Calculator*/
			if (income >= P3) /*Fourth pocket*/ {
			ans1= P1*t1+(P2-P1)*t2+(P3-P2)*t3+(income-P3)*t4;
			NumberFormat formatter = NumberFormat.getCurrencyInstance();
			System.out.println("You spend "+ formatter.format(ans1) +" a year on provincial taxes!");
			}
			else if (income>=P2) /*Third pocket*/ {
			ans1= P1*t1+(P2-P1)*t2+(income-P2)*t3;
			NumberFormat formatter = NumberFormat.getCurrencyInstance();
			System.out.println("You spend "+ formatter.format(ans1) +" a year on provincial taxes!");	
			}
		
			else if (income>=P1) /*Second pocket*/ {
			ans1= P1*t1+(income-P1)*t2;
			NumberFormat formatter = NumberFormat.getCurrencyInstance();
			System.out.println("You spend "+ formatter.format(ans1) +" a year on provincial taxes!");	
			}
			else /*First pocket*/{
			ans1= income*t1;
			NumberFormat formatter = NumberFormat.getCurrencyInstance();
			System.out.println("You spend "+ formatter.format(ans1) +" a year on provincial taxes!");	
			}
			/*Federal tax calculator*/
			if (income >= F4) /*Fifth pocket*/ {
			ans2= F1*T1+(F2-F1)*T2+(F3-F2)*T3+(F4-F3)*T4+(income-F4)*T5;
			NumberFormat formatter = NumberFormat.getCurrencyInstance();
			System.out.println("You spend "+ formatter.format(ans2) +" a year on federal taxes!");
			}
			else if (income>=F3) /*Fourth pocket*/ {
			ans2= F1*T1+(F2-F1)*T2+(F3-F2)*T3+(income-F3)*T4;
			NumberFormat formatter = NumberFormat.getCurrencyInstance();
			System.out.println("You spend "+ formatter.format(ans2) +" a year on federal taxes!");
			}
			else if (income>=F2) /*Third pocket*/ {
			ans2= F1*T1+(F2-F1)*T2+(income-F2)*T3;
			NumberFormat formatter = NumberFormat.getCurrencyInstance();
			System.out.println("You spend "+ formatter.format(ans2) +" a year on federal taxes!");
			}
			else if (income>=F1) /*Second pocket*/ {
			ans2= F1*T1+(income-F1)*T2;
			NumberFormat formatter = NumberFormat.getCurrencyInstance();
			System.out.println("You spend "+ formatter.format(ans2) +" a year on federal taxes!");
			}
			else /*First pocket*/{
			ans2= income*T1;
			NumberFormat formatter = NumberFormat.getCurrencyInstance();
			System.out.println("You spend "+ formatter.format(ans2) +" a year on federal taxes!");
			}
	}	
}
