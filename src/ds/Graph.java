package ds;

import java.util.LinkedList;

public class Graph {

    static class graph{
        int V;
        LinkedList<Integer>[] adjArray;

        graph(int V){
            this.V = V;
            adjArray = new LinkedList[V];

            for(int i=0; i<V; i++){
                adjArray[i] = new LinkedList<>();
            }
        }
    }

    static void addEdge(graph G, int src, int dst){
        G.adjArray[src].add(dst);
        G.adjArray[dst].add(src);
    }

    static void printGraph(graph G)
    {
        for(int v = 0; v < G.V; v++)
        {
            System.out.println("Adjacency list of vertex "+ v);
            System.out.print("head");
            for(Integer pCrawl: G.adjArray[v]){
                System.out.print(" -> "+pCrawl);
            }
            System.out.println("\n");
        }
    }

    // Driver program to test above functions
    public static void main(String args[])
    {
        // create the graph given in above figure
        int V = 5;
        graph G = new graph(V);
        addEdge(G, 0, 1);
        addEdge(G, 0, 4);
        addEdge(G, 1, 2);
        addEdge(G, 1, 3);
        addEdge(G, 1, 4);
        addEdge(G, 2, 3);
        addEdge(G, 3, 4);

        // print the adjacency list representation of
        // the above graph
        printGraph(G);
    }
}
