import java.util.Random;

public class DiceRoller{

	Random ran;							// global
	int num;
	
	DiceRoller(){
		Random random = new Random(); 	// local
		ran = new Random(); 	// local
		int number = 0;
		roll1(random, number);
		roll();
	}

	void roll1(Random random,int number){
		number =  random.nextInt(6)+1;
		System.out.println(number);
	}

	void roll(){
		num =  ran.nextInt(6)+1;
		System.out.println(num);
	}


}