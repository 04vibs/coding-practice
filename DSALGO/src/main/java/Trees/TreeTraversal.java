package Trees;
import java.util.*;

class Node1 {
    int key;
    Node1 left, right;
    
    public Node1(int item) {
        key = item;
        left = right = null;
    }
}
public class TreeTraversal {

    // root of binary tree
    Node1 root;
    
    TreeTraversal() {
        root = null;
    }
    
    /*
    Given a binary tree, print its nodes according to the "bottom-up" postorder Traversal
    */
    
    void printPostOrder(Node1 node1) {
        if(node1 == null) {
            return;
        }        
        // first recur on left subtree
        printPostOrder(node1.left);
        
        // the recur on right subtree
        printPostOrder(node1.right);
        
        // deal with the node
        System.out.print(node1.key+ " ");
    }
    
    void printInOrder(Node1 node1) {
        if(node1 == null) 
            return;
        
        // recur on left subtree
        printInOrder(node1.left);
        
        // node
        System.out.print(node1.key+ " ");
        
        // recur on right subtree
        printInOrder(node1.right);
        
    }
    
    void printPreOrder(Node1 node1) {
        if(node1 == null) return;
        
        System.out.print(node1.key + " ");
        
        // recur on left subtree
        printPreOrder(node1.left);
        
        // recur on right subtree
        printPreOrder(node1.right);
        
    }
    
    // Wrappers over above recursive functions 
    
        void printPostOrder()  {     printPostOrder(root);  } 
        void printInOrder()    {     printInOrder(root);   } 
        void printPreOrder()   {     printPreOrder(root);  }

    public static void main(String args[]) {
        // TODO code application logic here
        
        TreeTraversal tree = new TreeTraversal(); 
        tree.root = new Node1(1); 
        tree.root.left = new Node1(2); 
        tree.root.right = new Node1(3); 
        tree.root.left.left = new Node1(4); 
        tree.root.left.right = new Node1(5); 
  
        System.out.println("Preorder traversal of binary tree is "); 
        tree.printPreOrder(); 
  
        System.out.println("\nInorder traversal of binary tree is "); 
        tree.printInOrder(); 
  
        System.out.println("\nPostorder traversal of binary tree is "); 
        tree.printPostOrder(); 
    }
}
