import java.util.*;  

class Palindrom   
{  
    static boolean is_pal(int n)
    {
        int rev = 0;
        int tmp = n;
        while(n>0)
        {
            rev = (rev*10) + (n%10);
            n /= 10;
        }
        return rev == tmp; 
    }

	public static void main(String[] args)  
	{
        Scanner sc= new Scanner(System.in);  
	    // int n = sc.nextInt();
        //if(is_pal(n))
        //    System.out.println("Palindrome");
        //else
        //    System.out.println("Not Palindrome");
        //
        int arr[] = {121,131,45,787,969,55,2569};
        int ans = 0;
        for(int x: arr)
            if(is_pal(x))
                ans++;
        System.out.println(ans);
    }
}  
