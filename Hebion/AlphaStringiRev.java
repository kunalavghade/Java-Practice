import java.util.*;

class AlphaStringiRev
{  
	public static void main(String[] args)
	{  
		Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();

        char[] arr =  str.toCharArray();

        int l = 0, r = str.length()-1;
        
        while(l<r)
        {
            if(l<r && !Character.isAlphabetic(arr[l])) l++;
            if(l<r && !Character.isAlphabetic(arr[r])) r--;
            char c =arr[l];
            arr[l] =arr[r];
            arr[r] = c;
            l++;r--;
        }

        //str = arr.toString();
        for(char c : arr)
        System.out.print(c);

	}
}
