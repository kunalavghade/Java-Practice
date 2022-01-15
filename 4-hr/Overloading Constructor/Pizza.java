public class Pizza{

	String beard;
	String sauce;
	String chease;
	String topping;

	Pizza(String beard, String sauce, String chease, String topping){
		this.beard = beard;
		this.sauce = sauce;
		this.chease = chease;
		this.topping = topping;
	}

	Pizza(String beard, String sauce, String chease){
		this.beard = beard;
		this.sauce = sauce;
		this.chease = chease;
	}

	Pizza(String beard, String sauce){
		this.beard = beard;
		this.sauce = sauce;
	}


	Pizza(String beard){
		this.beard = beard;
	}

	void odder(){
		System.out.println("Here are the ingradients of pizza: ");
		System.out.println(this.beard);
		System.out.println(this.sauce);
		System.out.println(this.chease);
		System.out.println(this.topping);
	}

}