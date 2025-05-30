package dsa1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CreateGraph1 {
public static class Edge{
    int src;
    int dest;
    int weight;
    public Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
}
public static void createGraph(ArrayList<Edge> graph[]){

    for(int i=0;i< graph.length;i++){
        graph[i]=new ArrayList<Edge>();
    }


        graph[0].add(new Edge(0,2,2));

        graph[1].add(new Edge(1,2,10));
        graph[1].add(new Edge(1,3,0));

        graph[2].add(new Edge(2,0,2));
        graph[2].add(new Edge(2,1,10));
        graph[2].add(new Edge(2,3,-1));

        graph[3].add(new Edge(3,1,0));
        graph[3].add(new Edge(3,2,-1));

}
//Breadth first search
public static void bfs(ArrayList<Edge> graph[]){
    Queue<Integer> queue = new LinkedList<Integer>();
    boolean[] visited = new boolean[graph.length];
    queue.add(0);
    while(!queue.isEmpty()){
        int current = queue.remove();
        if(visited[current]==false) {

            System.out.print(current+" ");
            visited[current]=true;

            for (int i = 0; i < graph[current].size(); i++) {
                Edge edge = graph[current].get(i);
                queue.add(edge.dest);
            }
        }
    }

}
//depth first search
    public static void dfs(ArrayList<Edge> graph[],int current,boolean[] visited){
        System.out.print(current+" ");
        visited[current]=true;
        for (int i = 0; i < graph[current].size(); i++) {
            Edge edge = graph[current].get(i);
            if(visited[edge.dest]==false) {
                dfs(graph,edge.dest,visited);
            }
        }
    }
//printing all possible paths from source to target
    public static void printAllPaths(ArrayList<Edge> graph[], int current, boolean[] visited,String path,int target){
    if(current==target){
        System.out.print(path+" ");
        return;
    }

        for (int i = 0; i < graph[current].size(); i++) {
            Edge edge = graph[current].get(i);
            if (!visited[edge.dest]) {
                visited[current] = true;
                printAllPaths(graph, edge.dest, visited, path+edge.dest, target);
                visited[current] = false;
            }
        }


    }

    public static void main(String[] args) {
        int vertices = 5;
        ArrayList<Edge> graph[]=new ArrayList[vertices];
        boolean[] visited=new boolean[vertices];
        createGraph(graph);

        //printing the neighbours of node 2
        for(int i=0;i<graph[2].size();i++){
            Edge e = graph[2].get(i);
            System.out.println(e.dest+" , "+e.weight);
        }
        System.out.println("BFS");
        bfs(graph);
        System.out.println();
        System.out.println("DFS");
        dfs(graph,0,visited);
        System.out.println("Printing all paths");
        printAllPaths(graph,0,new boolean[vertices],"0",3);


    }
}
