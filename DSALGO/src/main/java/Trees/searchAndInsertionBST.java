package Trees;


public class searchAndInsertionBST {

    public Node Search(Node root, int key) {
        
        // base casess: root is null or key is present at root
        if(root == null || root.key == key) return root;
        
        // val is greater than root's key
        if(root.key > key) return Search(root.left, key);
        
        // val is less than root's key
        return Search(root.right, key);
    }
    
    class Node {
        int key;
        Node left, right ;
        
        public Node(int item) {
            key = item;
            left = right = null;
        }
    }
    
    // root of BST
    Node root;
    
    // contructor
    searchAndInsertionBST() {
    root = null;
    }
    
     // This method mainly calls insertRec() 
    void insert(int key) { 
       root = insertRec(root, key); 
    } 
          
    /* A recursive function to insert a new key in BST */
    Node insertRec(Node root, int key) {
    
       /* If the tree is empty, return a new node */
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
  
        /* Otherwise, recur down the tree */
        if (key < root.key) 
            root.left = insertRec(root.left, key); 
        else if (key > root.key) 
            root.right = insertRec(root.right, key); 
  
        /* return the (unchanged) node pointer */
        return root; 
    }
    
    // This method mainly calls InorderRec()
     void inorder()  { 
       inorderRec(root); 
    } 
  
    // A utility function to do inorder traversal of BST 
    void inorderRec(Node root) { 
        if (root != null) { 
            inorderRec(root.left); 
            System.out.println(root.key); 
            inorderRec(root.right); 
        } 
    } 
    public static void main(String args[]) {
        // TODO code application logic here
         searchAndInsertionBST  tree = new searchAndInsertionBST(); 
  
        /* Let us create following BST 
              50 
           /     \ 
          30      70 
         /  \    /  \ 
       20   40  60   80 */
        tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80); 
        
        // print inorder traversal of the BST 
        tree.inorder(); 
  
    }
}
