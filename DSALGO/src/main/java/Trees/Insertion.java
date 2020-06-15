/*
Given a binary tree and a key, insert the key into the binary tree at first position available in level order.
The idea is to do iterative level order traversal of the given tree using queue. 
If we find a node whose left child is empty, we make new key as left child of the node. 
Else if we find a node whose right child is empty, we make new key as right child. 
We keep traversing the tree until we find a node whose either left or right is empty.
*/

package Trees;
import java.util.LinkedList;
import java.util.Queue;

public class Insertion {

    /*
    A Binary tree node hass key, pointer to the left child and a pointer to the right child
    */
    
    static class Node{
        int key;
        Node left, right;
        
        // constructor
        Node(int key) {
            this.key = key;
            left = null;
            right = null;
        }
    }
    
    static Node root;
    static Node temp = root;
    
    /*InOrder traversal of a binary tree*/
    static void inOrder(Node temp) {
        if(temp == null) return;
        // left node right
        inOrder(temp.left);
        System.out.print(temp.key+" ");
        inOrder(temp.right);
    }
    
    /*Function to Insert element in binary tree*/
    static void insert(Node temp, int key) {
        Queue<Node>q = new LinkedList<Node>();
        q.add(temp);
        
        // Do a level order traversal until we find an empty place
        
        while(!q.isEmpty()) {
            temp = q.peek();
            q.remove();
            
            if(temp.left == null) {
                temp.left = new Node(key);
                break;
            } else {
                q.add(temp.left);
            }
            
            if(temp.right == null) {
                temp.right = new Node(key);
                break;
            } else {
                q.add(temp.right);
            }
        }
    }
    
    
    public static void main(String args[]) {
        // TODO code application logic here
        
        root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);
        
        System.out.println("InOrder traversal before insertion");
        inOrder(root);
        
        int key =12;
        insert(root,key);
        System.out.println("\n Inorder traversal after insertion");
        inOrder(root);
        
        int key1 = 18;
        insert(root,key1);
                
        System.out.println("\n Inorder traversal after insertion");
        inOrder(root);
                
    }
}
