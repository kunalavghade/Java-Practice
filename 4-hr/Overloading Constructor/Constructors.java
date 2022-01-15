/*

Overloaded Constructors:
	1.	multiple constructors within a class with the same name,
	2.	But have different parameters
	3.	name + parameter = signature

*/

public class Constructors{
	public static void main(String[] args) {
		
		Pizza pizza1 = new Pizza("Thicc Crust","tomato","mozzerella","pepperoni");
		pizza1.odder();

		Pizza pizza2 = new Pizza("Thicc Crust","tomato","mozzerella");
		pizza2.odder();

		Pizza pizza3 = new Pizza("Thicc Crust","tomato");
		pizza3.odder();

		Pizza pizza4 = new Pizza("Thicc Crust");
		pizza4.odder();
	}
}