import java.util.*;

class LongSuffPre
{  

    static int suffpre(String s)
    {
        int n = s.length();
        for(int i = 0;i<n/2;i++)
        {  
            if(s.substring(0,(n/2)-i).equals(s.substring((n/2)+i+1,n)))
            {
                return i;
            }
            System.out.println(s.substring(0,(n/2)-i)+" "+(s.substring((n/2)+1+i,n)));
        }
        return -1;
    }

	public static void main(String[] args)
	{  
		Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        
        if(suffpre(s) != -1)
            System.out.print(suffpre(s));
        else
            System.out.print("Not found");
	}
}
