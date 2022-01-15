/*

Object 	:	an instance of class that may contains attributes and methods
example	:	(phone, desk, computer, tea, cup)

*/
public class Main{
	public static void main(String[] args) {
		Car myCar = new Car();

		System.out.println(myCar.model);
		System.out.println(myCar.price);

		myCar.drive();
		myCar.pressBreak();
	}
}