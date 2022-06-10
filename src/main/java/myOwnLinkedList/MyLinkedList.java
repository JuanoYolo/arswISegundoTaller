package myOwnLinkedList;

public class MyLinkedList {
    Node head;
    Double data;

    public void add(Double data){
        if(head == null){
            head = new Node(data);
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void prepend(Double data){
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void deleteWithValue(Double data) {
        if(head == null){
            return;
        }
        if(head.data == data){
            head = head.next;
            return;
        }

        Node current = head;
        while(current.next != null){
            if(current.next.data == data){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
}
