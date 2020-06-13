package Trees;
import java.util.*;

class Node {
    int key;
    Node left,right;
    
    public Node(int item) {
        key = item;
        left = right = null;
    }
}

// java program to introduce Binary Tree

public class BinaryTree {
    
    // Root of binary tree
    Node root;
    
    // constructors
    BinaryTree(int key) {
        root = new Node(key);
    }
    BinaryTree() {
        root = null;
    }
    
    public static void main(String args[]) {
        // TODO code application logic here
        BinaryTree tree = new BinaryTree();
        
        /* Create Root*/
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        
        System.out.print(tree);
    }
}
