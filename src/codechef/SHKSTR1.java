package codechef;

import java.util.*;

public class SHKSTR1 {

    static final int size = 26;

    static class TrieNode{
        TrieNode[] children = new TrieNode[size];
        boolean isWordEnd;
        TrieNode(){
            isWordEnd = false;
            for (int i=0; i< size; i++){
                children[i] = null;
            }
        }
    }

    static TrieNode root;

    static void insert(String key){
        int level = 0;
        int length = key.length();
        int index;

        TrieNode pCrawl = root;
        for (level=0; level<length; level++ ){
            index = key.charAt(level) - 'a';
            if (pCrawl.children[index] == null)
                pCrawl.children[index] = new TrieNode();

            pCrawl = pCrawl.children[index];
        }
        pCrawl.isWordEnd = true;
    }

    static boolean search(String key){
        int level = 0;
        int length = key.length();
        int index;
        TrieNode pCrawl = root;
        for (level=0; level<length; level++ ){
            index = key.charAt(level) - 'a';
            if (pCrawl.children[index] == null)
                return false;

            pCrawl = pCrawl.children[index];
        }
        return (pCrawl != null && pCrawl.isWordEnd);
    }


    public static void main(String arg[]){

        String keys[] = {"the", "a", "there", "answer", "any",
                "by", "bye", "their"};

        String output[] = {"Not present in trie", "Present in trie"};


        root = new TrieNode();

        // Construct trie
        int i;
        for (i = 0; i < keys.length ; i++)
            insert(keys[i]);

        // Search for different keys
        if(search("the") == true)
            System.out.println("the --- " + output[1]);
        else System.out.println("the --- " + output[0]);

        if(search("these") == true)
            System.out.println("these --- " + output[1]);
        else System.out.println("these --- " + output[0]);

        if(search("their") == true)
            System.out.println("their --- " + output[1]);
        else System.out.println("their --- " + output[0]);

        if(search("thaw") == true)
            System.out.println("thaw --- " + output[1]);
        else System.out.println("thaw --- " + output[0]);

        /*Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] s = new String[n];
        for (int i =0; i<n; i++){
            s[i] = scanner.next();
        }
        int q = scanner.nextInt();
        int[] r = new int[q];
        String[] p = new String[n];
        for (int i =0; i<q; i++){
            r[i] = scanner.nextInt();
            p[i] = scanner.next();
        }
        for (int i=0; i<q; i++){
            int maxPrefix = 0;
            List<String> maxPrefixString = new ArrayList<>();
            String smallest;
            int[] prefixes = checkPrefix(s, p[i], r[i]);
            for (int j=0; j<prefixes.length; j++){
                //System.out.println(prefixes[j]);
                int prefix = prefixes[j];
                if (maxPrefix < prefix){
                    maxPrefix = prefix;
                    maxPrefixString.clear();
                    maxPrefixString.add(s[j]);
                }
                else if (maxPrefix == prefix){
                    maxPrefixString.add(s[j]);
                }
            }
            if (maxPrefixString.size() < 1)
                maxPrefixString = Arrays.asList(s);
            smallest = maxPrefixString.get(0);
            for (int j=0; j<maxPrefixString.size(); j++){
                if (smallest.compareTo(maxPrefixString.get(j)) > 0){
                    smallest = maxPrefixString.get(j);
                }
            }
            maxPrefixString.clear();
            System.out.println(smallest);
        }*/

    }

    private static int[] checkPrefix(String[] s, String p, int r) {
        String allString="";
        String temp = p;
        for (int i=0; i<r; i++){
            allString = allString.concat(s[i]+".");
        }
        //System.out.println("AllString: " + allString);
        //System.out.println("pString: " + p);
        int prefixes[] = new int[r];
        int prefixLength = -1;
        int sIndex = 0;
        int pindex = 0;
        while (pindex != r){
            //System.out.println("p of " + pindex + " = " + p);
            if (prefixLength != -1){
               //System.out.println("prefix Lenth: " + prefixLength );
                prefixes[pindex] = prefixLength;
                sIndex += s[pindex].length()+1;
                pindex++;
                prefixLength = -1;
                p = temp;
                //System.out.println("p is new: " + p);
            }
            else {
                if (allString.startsWith(p, sIndex)){
                    //System.out.println("String matches");
                    prefixLength = p.length();
                }
                else {
                    if (p != null && p.length() > 0) {
                        p = p.substring(0, p.length() - 1);
                        //System.out.println("Last Element Removed: " + p);
                    }
                    else{
                        prefixes[pindex] = 0;
                        sIndex += s[pindex].length()+1;
                        pindex++;
                        p = temp;
                        //System.out.println("P is empty so: " + p);
                    }
                }
            }
        }
        return  prefixes;
    }
/*
4
abcd
abce
abcdex
abcde
4
3 abcy
3 abcde
4 abcde
4 efgh
 
Example Output
abcd
abcdex
abcde*/
}
 