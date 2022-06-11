import java.util.*;

class ArraySwapZero
{  
	public static void main(String[] args)
	{  
		Scanner sc= new Scanner(System.in);
        
        String [] s = sc.nextLine().split(",");

        int [] arr = new int[s.length];
        
        for(int i = 0;i<s.length;i++)
            arr[i] = Integer.parseInt(s[i]);

        int l = 0, r = arr.length-1;
        while(l<=r)
        {   
            while(arr[l] != 0) l++;
            while(arr[r] == 0) r--;
            int tmp = arr[l];
            arr[l] = arr[r];
            arr[r] = tmp;
            l++; r--;
        }

        for(int x:arr)
            System.out.print(x+" ");
	}
}
