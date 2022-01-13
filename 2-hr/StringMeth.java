
public class StringMeth{
	public static void main(String[] args) {

		String name = "    Kunal    ";

		boolean result = name.equals("kunal");
		System.out.println(result);

		result = name.equalsIgnoreCase("kunal");
		System.out.println(result);

		System.out.println(name.length());

		System.out.println(name.charAt(0));

		System.out.println(name.indexOf("a"));

		System.out.println(name.isEmpty());

		System.out.println(name.toUpperCase());

		System.out.println(name.toLowerCase());

		// removes extra spaces
		System.out.println(name.trim());

		System.out.println(name.replace("K","k"));
	}	
}