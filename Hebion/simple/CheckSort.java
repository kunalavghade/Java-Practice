
import java.util.*;

class CheckSort
{ 
    static boolean checkSort(int arr[],int i)
    {
        if(i == -1)
            return true;

        if(arr[i] > arr[i+1])
            return false;

        return checkSort(arr,i-1);

    }

	public static void main(String[] args)
	{  
		Scanner sc= new Scanner(System.in);
        int arr[] = {5,2,3,4};
        if(checkSort(arr,arr.length-2))
            System.out.println("Sorted");
        else
            System.out.println("Not Sorted");
	}
}
