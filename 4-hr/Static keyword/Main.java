/*

static 	:
	1.	Modifier, A *single copy* of variable/method is created and shared.
	2.	The class "owns" the static member 

*/
public class Main{
	public static void main(String[] args) {

		Friend friend1 = new Friend("Tom");
		Friend friend2 = new Friend("Jerry");
		Friend friend3 = new Friend("Mikky");
		Friend friend4 = new Friend("Ben");

		// Recommended way
		System.out.println(Friend.numberOfFriends);
		// or
		// ClassName.Methode
		Friend.displayFriends();

		// Posssible but not recommended way
		System.out.println(friend1.numberOfFriends);
	}
}