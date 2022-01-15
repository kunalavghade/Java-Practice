public class Car{
	String make = "car";
	String model = "Maruti";
	int year = 2022;
	String color = "red";
	// double price = 50000.00;

/*	void drive(){
		System.out.println("Diving the car ...");
	}

	void pressBreak(){
		System.out.println("You pess the break !");
	}
*/
	@Override
	public String toString(){
		return make+"\n"+model+"\n"+color+"\n"+year;
	}
}