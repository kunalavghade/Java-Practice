import java.util.*;

class Edge implements Comparable<Edge>
{
    int scr, dst, wt;
    Edge( int  scr, int dst, int wt)
    {
        this.scr = scr;
        this.dst = dst;
        this.wt = wt;
    }

    public int compareTo( Edge edgeToCompare )
    {
        return wt - edgeToCompare.wt > 0 ? 1 : -1 ;
    }
}

class MinWeightPath{


    static HashMap<Integer,Integer> parent = new HashMap<Integer,Integer>();

    public static void makeParentSet(int n)
    {

        for(int v = 0 ; v<n ; v++ )
            parent.put(v,v);
    }

    public static int find(int v)
    {
        if(parent.get(v) == v)
            return v;
        return find(parent.get(v));
    }

    public static void unioun(int u,int v){
        int i = find(u);
        int j = find(v);

        parent.put(i,j);
    }

    public static List<Edge> findMinPath(List<Edge> edge,int n)
    {
        List<Edge> MST = new ArrayList<>();

        makeParentSet(n);

        int index = 0;
        while(MST.size() != n -1)
        {
            Edge next_edge = edge.get(index);
        
            int u = find(next_edge.scr);
            int v = find(next_edge.dst);
            
            if(u != v)
            {
                MST.add(next_edge);
                unioun(u,v);
            }
            index++;

        }
        return MST;
    }
}

class Graph
{  
	public static void main(String[] args)
	{  
		Scanner sc= new Scanner(System.in);
        
        List<Edge> edges = Arrays.asList(
                new Edge(0,1,7), new Edge(0,3,5),
                new Edge(1,2,8), new Edge(1,3,9),
                new Edge(1,4,7), new Edge(2,4,5),
                new Edge(3,4,15),new Edge(3,5,6),
                new Edge(4,5,8), new Edge(4,6,9),
                new Edge(5,6,11)
                );

        Collections.sort(edges);

      /*  Iterator<Edge> itr = edges.listIterator();
        while(itr.hasNext())
        {
            Edge edge = itr.next();
            System.out.println(edge.scr+" "+edge.dst+" "+edge.wt);
        }
        */
        //MinWeightPath obj = new MinWeightPath();
        int n = 7;
        List<Edge> MST = MinWeightPath.findMinPath(edges,n);

        for(Edge edge : MST)
            System.out.println(edge.scr + " -> "+ edge.dst +" : "+ edge.wt);

	}
}
