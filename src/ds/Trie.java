package ds;

public class Trie {

    static int alphaSize = 26;
    static class TrieNode{
        boolean isEnd;
        TrieNode[] children;

        public TrieNode(){
            isEnd = false;
            children = new TrieNode[alphaSize];
            for(int i=0; i<alphaSize; i++){
                children[i] = null;
            }
        }
    }

    static TrieNode root;

    public static void insert(String key){
        int n = key.length();
        int index;
        TrieNode temp = root;
        for (int i=0; i<n; i++){
            index = key.charAt(i) - 'a';
            if (temp.children[index] == null)
                temp.children[index] = new TrieNode();

            temp = temp.children[index];
        }
        temp.isEnd = true;
    }

    public static boolean search(String key){
        TrieNode temp = root;
        int index;
        int n = key.length();
        for (int i=0; i<n; i++){
            index = key.charAt(i) - 'a';
            if(temp.children[index] == null)
                return false;
            temp = temp.children[index];
        }
        return temp.isEnd;
    }

    // Driver
    public static void main(String args[])
    {
        // Input keys (use only 'a' through 'z' and lower case)
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

    }

}
