import java.util.Scanner;


public class MathClass{
	public static void main(String[] args) {
		
		double x = 3.14;
		double y = -10;

		// max of two val
		System.out.println(Math.max(x,y));

		// absolute val 
		System.out.println(Math.abs(y));

		// sqrt of val
		System.out.println(Math.sqrt(x));

		// round of val
		System.out.println(Math.round(x));

		// round to upper value
		System.out.println(Math.ceil(x));

		// round to down value
		System.out.println(Math.floor(x));

		// find hypothesis of triangle
		Scanner sr = new Scanner(System.in);

		System.out.println("Enter S1 ");
		double s1 = sr.nextInt();

		System.out.println("Enter S2 ");
		double s2 = sr.nextInt();

		double hypo = Math.sqrt(Math.pow(s1,2)+Math.pow(s2,2));
		System.out.println("Hypothesis is "+hypo);
	}
}