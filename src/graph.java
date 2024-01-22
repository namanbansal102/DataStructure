import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class graph {
    static class Edge{
        int src;
        int dest;
        int weight;
        Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.weight=w;
        }
    }
    public static  void bfs(ArrayList<Edge> graph[],int V){
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        boolean vis[]=new boolean[V];
        while (!q.isEmpty()) {
            int curr=q.remove();
            if(!vis[curr]){
                System.out.print(curr+" ");
                vis[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }  
        }
    }
    public static void printAllPaths(ArrayList<Edge> graph[],int curr,int tar,String path,boolean vis[]){
        if(curr==tar){
            System.out.println(path);
            return;
        }
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                vis[curr]=true;
                printAllPaths(graph, e.dest, tar, path+e.dest, vis);
                vis[curr]=false;
                        }
        }
    }
    public static void dfs(ArrayList<Edge> graph[],int curr,boolean vis[]){
        System.out.print(curr+" ");
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph, e.dest, vis);
            }
        }
    }
    public static  void createGraph(ArrayList<Edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1,10));
        graph[0].add(new Edge(0, 2,10));
        graph[1].add(new Edge(1, 3,1));
        graph[1].add(new Edge(1, 0,0));
        graph[2].add(new Edge(2, 0,-1));
        graph[2].add(new Edge(2, 4,2));
        graph[2].add(new Edge(3, 1,10));
        graph[3].add(new Edge(3, 4,100));
        graph[3].add(new Edge(3, 5,100));
        graph[4].add(new Edge(4, 2,10));
        graph[4].add(new Edge(4, 3,10));
        graph[4].add(new Edge(4, 5,10));
        graph[5].add(new Edge(5, 3,10));
        graph[5].add(new Edge(5, 4,10));
        graph[5].add(new Edge(5, 6,10));
        graph[6].add(new Edge(6, 5,10));

    }
    public static void main(String[] args) {
        System.out.println("Making a Graph Data Structure in Java");
        ArrayList<Edge> graph[]=new ArrayList[7];
        createGraph(graph);
    //    bfs(graph,7);
       System.out.println();
       boolean get[]=new boolean[7];
    //    dfs(graph, 0, get);
       System.out.println();
       printAllPaths(graph, 0, 5, "0", new boolean[7]);

    }
 

    
}
