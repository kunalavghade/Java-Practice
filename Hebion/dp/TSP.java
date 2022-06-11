import java.util.*;

class TSP
{  
    
    static int tsp(int graph[][],boolean visited[], int pos,int n, int count, int cost, int sol){
        
        // base condition
        if(count == n && graph[pos][0]>0) //  remove graphs sec statement
            return Math.min(sol,cost+graph[pos][0]); // return only cost for shortest path

        for(int i =0; i<n;i++)
        {
            if(!visited[i] && graph[pos][i] > 0)
            {
                visited[i] = true;
                sol = tsp(graph,visited,i,n,count+1,cost+graph[pos][i],sol);                
                visited[i] = false; // backtrack
            }
        }
        return sol;
    }

	public static void main(String[] args)
	{  
		Scanner sc= new Scanner(System.in);
        int n = 4;
        int graph[][] = {
                            {0,10,15,20},
                            {10,0,35,25},
                            {15,35,0,30},
                            {20,25,30,0}
                        };
        // false indicate not visited nodes
        boolean visited[] = new boolean[4];
        
        int sol = Integer.MAX_VALUE;
        
        visited[0] = true;
        sol = tsp(graph,visited,0,n,1,0,sol);
        System.out.println(sol);

	}
}
