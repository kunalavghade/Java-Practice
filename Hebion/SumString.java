import java.util.*;

class SumString
{  
	public static void main(String[] args)
	{  
		Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        
        int sum = 0;
        for(int i = 0;i<str.length();i++)
            if(Character.isDigit(str.charAt(i)))
                sum+= str.charAt(i)- '0';
        System.out.println(sum);
	}
}
