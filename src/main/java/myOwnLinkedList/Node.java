package myOwnLinkedList;

public class Node{

    Node next;
    Double data;

    public Node(Double data) {
        this.data = data;
    }

    public void add(Double data){
        Node current = this;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
    }
}
