/*

Printf()
	1.	An optional method to control, format, and display text to the console window
	2.	Two arguments = format string + (object/Variable/Value)
	3.	% [flags] [precision] [width] [conversation-character]

	conversion character
	b = boolean
	d = int
	c = char
	s = String
	f = double

*/
public class PrintfMathod{
	public static void main(String[] args) {
		System.out.printf("This is %d format String ",123);

		/*
		[width]
			1.	minimum number of Characters to be writtern as output
			2.	right justyfied (+)
			3.	left justyfied (-)
		*/
		String s = "123456789";
		System.out.printf("\nHello %10s",s); 
		System.out.printf("\nHello %-10s",s);

		/*
		[precision]
			1.	sets number of digits of precision when outputing floating-point values
		*/
		double num = -5333.2222254464;
		System.out.printf("\nThe Number is %.1f",num);

		/*
		[flags]
			1.	add an effect to output based on the flag added to formmat spacifier
			2.	- :	left justify
			3.	+ : output a plus ( + ) or minus ( - ) sign for a numaric value
			4.	, : comma grouping seperator if numbers > 1000 
		*/
		System.out.printf("\nThe Number is %020f",num);
		System.out.printf("\nThe Number is %+f",num);
		System.out.printf("\nThe Number is %,f",num);
	}
}