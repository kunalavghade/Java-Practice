/*

------------------------------------------ Data Types -----------------------------------------------

|---------------------------------------------------------------------------------------------------|
|	No	|	data type 	|	size 	|	premetive/referance 	|				value 				|
|---------------------------------------------------------------------------------------------------|
|	1	|	boolean 	|	1 bit 	|		primitive			|			true/false				|
|	2	|	byte		|	1 byte	|		primitive			|			-128 to 127				|
|	3	|	short			2 byte			primitive			| 		-32,768 to 32,767			|
|---------------------------------------------------------------------------------------------------|
|	4	|	int 		|	4 byte	|		primitive			|	-2 billion to 2 billion			|
|	5 	|	long		|	8 byte	|		primitive			|	-9 quinitillon to 9 quinitillon	|
|---------------------------------------------------------------------------------------------------|
|	6 	|	float 		|	4 byte	|		primitive			| fractional number up to 6-7 digit |
|	7 	|	double 		|	8 byte 	|		primitive			| fractional number up to 15 digits |
|---------------------------------------------------------------------------------------------------|
|	8 	|	char 		|	2 byte 	|		primitive			|	Single Character/letter/ASCII   |
|	9	|	String 		|	vatible	|		referance 			|		Sequnce of character		|
|---------------------------------------------------------------------------------------------------|

|-----------------------------------------------------------------------|
|			Primitive 				|		 	Referance 				|
|-----------------------------------------------------------------------|											
|	8 types (boolean, byte, etc)	|	unlimited (user defined)		|
|	Store data						|	Store an address				|
|	can only hold 1 value 			|	could hold more than 1 value 	|
|	less memory 					|	More memory 					|
|	Faster 							|	Slower 							|
|-----------------------------------------------------------------------|
*/

public class Variables{
	public static void main(String[] args){

		int i = 123;
		System.out.println("Integer value is " + i);

		float f = 3.14f;
		System.out.println("Floating value is " + f);

		double d = 3.145;
		System.out.println("Double value is " + d);

		char c = '@';
		System.out.println("Character value is " + c);

		String s = "\"HELLO THERE";
		System.out.println("String value is " + s);

		// Swaping variable
		String x = "Water";
		String y = "Blood";

		System.out.println("Value of X " + x);
		System.out.println("Value of Y " + y);

		String temp;

		temp = x;
		x = y;
		y = temp;

		System.out.println("Value of X " + x);
		System.out.println("Value of Y " + y);

	}
}