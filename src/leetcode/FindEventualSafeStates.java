import java.util.*;

class Solution {

    public static void main(String[] args){
        int[][] graph = {{}, {0,2,3,4}, {3}, {4}, {}};
        System.out.println(eventualSafeNodes(graph));
    }

    public static List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> res = new ArrayList<>();
        if (graph == null || graph.length == 0)
            return res;
        HashSet<Integer> terminal = new HashSet<>();
        int n = graph.length;
        
        for (int i=0 ; i<n; i++){
            if (graph[i].length == 0)
                terminal.add(i);
        }
        
        HashSet<Integer> visited = new HashSet<>();
        HashSet<Integer> visiting = new HashSet<>();
        HashSet<Integer> safe = new HashSet<>();
        
        
        for (int i=0; i<n; i++){   
            if ( dfs(i, visiting, visited, safe, terminal, graph))
                res.add(i);
            visited.add(i);
        }
        
        return res;
    }
    
    public static boolean dfs(int curr, HashSet<Integer> visiting, HashSet<Integer> visited, HashSet<Integer> safe, HashSet<Integer> terminal, int[][] g){
        if (safe.contains(curr) || terminal.contains(curr))
            return true;
        
        if (visiting.contains(curr))
            return false;
        
        visiting.add(curr);
        boolean isSafe = true;
        
        for (int nei : g[curr]){
            if (!dfs(nei, visiting, visited, safe, terminal, g)){
                isSafe = false;
                visiting.remove(nei);
                break;
            }
            visiting.remove(nei);
        }
        visiting.remove(curr);
        
        if (isSafe)
            safe.add(curr);
        
        return isSafe;
    }
}