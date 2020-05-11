
public class LinkedList {
    
    class Node{
    int data;
    Node next;
    
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // Representing the head and tail of the singly linked list
    public Node head = null;
    public Node tail = null;
    
    // addNode() will add a new Node to the list
    public void addNode(int data) {
     
        // create a new Node
        Node newNode = new Node(data);
        // check if the list is empty
        if(head == null) {
        // if list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        } else {
           // newNode will be added after tail such that 
           // tail's next will point to newNode
           tail.next = newNode;
           // newNode will become new tail of the list
           tail = newNode;
        }        
    }
    
    public void prepend(int data) {
        // create a new Node
        Node newNode = new Node(data);
        if(head == null) {
        head = newNode;
        tail = newNode;
        }
        newNode.next = head;
        head = newNode;
    }
    
    public void insertAtParticularIndex(int index,int data){
        // check params
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        }
        if(index ==0) {
            newNode.next = head;
            head = newNode;
        }
        
        int i=0;
        Node prev = null;
        Node current = head;
        
        while(current !=null && i < index){  
            prev = current;
            current = current.next;
            i++;
        }
        newNode.next = prev.next;
        prev.next = newNode;
        
    }
      
    public void insertAtposition(int position, int data) {
        Node newNode = new Node(data);
        Node currentNode = head;
        
        int index1 =0;
        
        while(index1 < position-1) {
            currentNode = currentNode.next;
            index1++;
        }
        
        newNode.next = currentNode.next;
        currentNode.next = newNode;   
    }
   
    public void remove(int position) {
        Node currentNode = head;
        int counter =0;
        if(head == null) {
            System.out.println("list is empty");
            return;
        }
        while(counter < position-1) {
            currentNode = currentNode.next;
            counter++;
        }
        
        currentNode.next = currentNode.next.next;
        }

    // display() will display all the nodes present in the list
    public void display() {
     // Node current will point to head
     Node current = head;
     
     if(head == null) {
         System.out.println("List is empty");
         return;
     }
     System.out.println("Nodes of singly linked list:");
     while(current !=null) {
         System.out.print(current.data + " -->");
         current = current.next;
     }   
        System.out.println();
    }
    
    public static void main(String args[]) {
        // TODO code application logic here
        LinkedList ll = new LinkedList();  
        ll.prepend(5);
        ll.addNode(1);
        ll.addNode(2);
        ll.addNode(3);
        ll.addNode(4);
        ll.prepend(0);
        ll.remove(3);
        ll.insertAtParticularIndex(2,10);
        ll.insertAtposition(3,1);
        
        // display the nodes present in the list
        ll.display();
    }
}
