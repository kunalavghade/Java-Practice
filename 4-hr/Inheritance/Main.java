/*

Inheritance
	1.	The process where one class acquires, the attributes and methods of another class

*/
public class Main{
	public static void main(String[] args) {

		Car car = new Car();
		car.stop();

		Bicycle bicycle =  new Bicycle();
		bicycle.stop();

		System.out.println(bicycle.speed);
		System.out.println("Car info \n"+car.wheels+"\n"+car.door);
		System.out.println("Bicycle info \n"+bicycle.wheels+"\n"+bicycle.padle);

	}
}