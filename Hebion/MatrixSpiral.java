import java.util.*;

class MatrixSpiral
{  
	public static void main(String[] args)
	{  
		Scanner sc= new Scanner(System.in);

        int mat[][] = {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                        };

        int n = mat.length;
        int top = 0;
        int right = n-1;
        int left = 0;
        int bottom = n-1;

        int number =1;

        while(left<=right && top<=bottom)
        {
            // traverse left to right for top
            for(int col = left; col<= right; col++)
                System.out.print(mat[top][col]+" ");
            top++; // inc top val to step down
            System.out.print(" ");

            for(int row = top; row<=bottom; row++)
                System.out.print(mat[row][right]+" "); 
            right--;
            System.out.print(" ");
            
            for(int col = right; col>=left; col--)
                System.out.print(mat[bottom][col]+" ");
            bottom--;
                System.out.print(" ");
            
            for(int row = bottom; row >= top; row--)
                System.out.print(mat[left][row]+" ");
            left++;
            System.out.print(" ");
        }
	}  
}  
