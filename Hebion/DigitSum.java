import java.util.*;  

class DigitSum  
{  

    static void sumDig(int n)
    {
        if(n < 10)
        {
            if(n == 9)
                System.out.println("Accepted");
            else
                System.out.println("Rejected");
            return;
        }
        int sum = 0;
        while(n != 0)
        {
            sum += n%10;
            n/=10;
        }
        sumDig(sum);
    }

	public static void main(String[] args)  
	{  
		Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        sumDig(n);
	}  
}  
