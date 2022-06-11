import java.util.*;

class AlphaStrign
{  
	public static void main(String[] args)
	{  
		Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();

        int ans= 0;
        
        for(int i = 0;i<str.length();i++)
            if(Character.isAlphabetic(str.charAt(i)))
                ans++;
        
        System.out.println(ans);

	}
}
