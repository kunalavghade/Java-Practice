/*
Overloaded methods

*/
public class MethodOverloading{
	public static void main(String[] args) {
		System.out.println(add(3,5));
		System.out.println(add(3,5,5));
		System.out.println(add(3.6,5.8));
	}

	static int add(int a, int b){
		return a+b;
	}

	static int add(int a, int b, int c){
		return a+b+c;
	}

	static double add(double a, double b){
		return a+b;
	}
}