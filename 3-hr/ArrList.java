import java.util.ArrayList;

/*
ArrayList 
	1.	A resizable array
	2.	Elements can be added and removed after comilation phase
	3.	store reference data types
*/

public class ArrList{
	public static void main(String[] args) {
		ArrayList<String> food = new ArrayList<String>();

		food.add("pizza");
		food.add("borgur");
		food.add("pasta");

		food.set(0,"sushi");
		food.remove(2);

		for (int i = 0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}

		for (String x : food) {
			System.out.println(x);
		}

		food.clear();
	}
}