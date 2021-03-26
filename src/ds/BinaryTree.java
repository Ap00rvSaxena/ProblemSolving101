package ds;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left, right;

    public Node (int x){
        this.data = x;
        this.left = null;
        this.right = null;
    }
}
public class BinaryTree {
    Node root;

    public BinaryTree(){
        this.root = null;
    }

    public BinaryTree(int x){
        this.root = new Node(x);
    }

    public static void Inorder(Node x){
        if (x == null)
            return;
        Inorder(x.left);
        System.out.print(x.data + " ");
        Inorder(x.right);
    }

    public static void Preorder(Node x){
        if (x == null)
            return;
        System.out.print(x.data + " ");
        Preorder(x.left);
        Preorder(x.right);
    }

    public static void Postorder(Node x){
        if (x == null)
            return;
        Postorder(x.left);
        Postorder(x.right);
        System.out.print(x.data + " ");
    }

    public static void insert(Node temp, int key){
        Queue<Node>  q = new LinkedList<>();
        q.add(temp);

        while (!q.isEmpty()){
//            temp = q.peek();
//            q.remove();
            temp = q.poll();

            if (temp.left == null) {
                temp.left = new Node(key);
                break;
            }else{
                q.add(temp.left);
            }

            if (temp.right == null){
                temp.right = new Node(key);
                break;
            }else
                q.add(temp.right);
        }
    }

    private void BFSprint() {
        Queue<Node> q= new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()){
            Node temp = q.poll();
            System.out.print(temp.data+" ");

            if (temp.left != null)
                q.add(temp.left);
            if (temp.right != null)
                q.add(temp.right);
        }
    }



    public static int heightOfTree(Node root){
        if(root == null)
            return 0;
        else{
            int lheight = heightOfTree(root.left);
            int rheight = heightOfTree(root.right);
            if (lheight > rheight) return (lheight+1);
            else return (rheight+1);
        }
    }

    public static void levelOrder(Node root){
        int h = heightOfTree(root);
        for (int i=1; i<=h; i++)
            printLevelOrder(root, i);
    }

    public static void printLevelOrder(Node root, int lvl){
        if (root == null)
            return;
        else if (lvl == 1)
            System.out.print(root.data + " ");
        else {
            printLevelOrder(root.left, lvl-1);
            printLevelOrder(root.right,lvl -1);
        }
    }
/*
      7
    /  \
   6     5
  / \   / \
 4   3  2  1
 /
 8
 */

    public static void main(String[] args){
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(7);
        bt.root.left = new Node(6);
        bt.root.right = new Node(5);
        bt.root.left.left = new Node(4);
        bt.root.left.right = new Node(3);
        bt.root.right.left = new Node(2);
        bt.root.right.right = new Node(1);
        System.out.print( "Inorder traversal before insertion:");
        Inorder(bt.root);
        System.out.print( "\nPreorder traversal");
        Preorder(bt.root);
        System.out.print( "\nPostorder traversal before insertion:");
        Postorder(bt.root);
        //insert
        insert(bt.root, 8);
        System.out.print( "\nInorder traversal After insertion:");
        Inorder(bt.root);
        //BSF through Queue
        System.out.println("BSF - Level First Traversal:");
        bt.BFSprint();
        System.out.println("\nHeight of Tree: " + heightOfTree(bt.root));
        //BFS through Fxn
        System.out.println("BSF/LvlOrder through Fxn: ");
        levelOrder(bt.root);
    }
}
