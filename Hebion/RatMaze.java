
import java.util.*;

class RatMaze
{ 

    static boolean path( int[][] maze, int[][] sol, int m, int n, int r, int c )
    {
        if ( r == m-1 && c == n-1 )
        {
            sol[r][c]= 1;
            return true;
        }

        if ( maze[r][c] == 1)
        {
            sol[r][c] =1;
            if ( c < n-1 && path(maze, sol, m, n, r, c+1) )
                return true;
            if ( r < m-1 && path( maze, sol, m , n, r+1, c))
                return true;
            sol[r][c] = 0;
        }
        return false;
    }
	public static void main(String[] args)
	{  
		//Scanner sc= new Scanner(System.in);
        //
        int maze[][] = {
                        {1,1,0,0,0},
                        {1,1,1,0,0},
                        {1,1,0,0,0},
                        {1,1,1,1,1},
                        };
        
        int m = maze.length;
        int n = maze[0].length;
        int sol[][] = new int[m][n];
        
        if(path(maze,sol,4,5,0,0))
        {
            for ( int r = 0; r < m; r++)
               {
                   for ( int c =0; c < n; c++)
                   {
                       System.out.print( sol[r][c] + "\t");
                   }
                   System.out.println();
               }
        }
        else
            System.out.println("path dont exist");

	}
}
