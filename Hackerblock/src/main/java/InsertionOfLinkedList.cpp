#include <iostream>
using namespace std;

class Node {
public:
    int data;
    Node*next;

    Node(int d) {
        data = d;
        next = NULL;
    }
};

//passing a pointer by refernce
void insertAtHead(Node*&head, int d) {

    if(head == NULL) {
        head = new Node(d);
        return;
    }

    Node *n = new Node(d);
    n->next = head;
    head = n;
}

int length(Node*head) {
    int count=0;
    while(head !=NULL) {
        count++;
        head = head->next;
    }
    return count;
}

void insertAtTail(Node*head, int data) {
    // corner case
    if(head == NULL) {
        head = new Node(data);
        return;
    }
    Node*tail = head;
    while(tail->next  != NULL) {
        tail = tail->next;
    }
    tail->next = new Node(data);
    return;
}


void insertAtMiddle(Node*head, int data, int p ){

    // handling corner cases first
    if(head == NULL || p==0) {
        insertAtHead(head,data);
    }
    else if(p>length(head)) {
        insertAtTail(head,data);
    } 
    else{
        // take (p-1) jumps
        int jump=1;
        Node*temp=head;
        while(jump <=p-1) {
            temp = temp->next;
            jump++;
        }
        // create a new node
        Node*n = new Node(data);
        n->next = temp->next;
        temp->next = n;
    }   
}

void print(Node*head) {
    cout<<endl;
    while(head !=NULL) {
        cout<<head->data<<"->";
        head = head->next;
    }
}

void deleteAtHead(Node*&head){
    if(head == NULL) {
        return;
    }
    Node*temp = head->next;
    delete head;
    head = temp;
}

int main() {
    Node*head = NULL;
    insertAtHead(head,3);
    insertAtHead(head,2);
    insertAtHead(head,1);
    insertAtHead(head,0);
    print(head);
    insertAtTail(head,6);
    insertAtTail(head,7);
    insertAtMiddle(head,4,4);
    insertAtMiddle(head,5,5);
    print(head);
    deleteAtHead(head);
    print(head);
}
