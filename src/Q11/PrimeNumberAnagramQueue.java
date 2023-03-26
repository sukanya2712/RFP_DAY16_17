package Q11;

public class PrimeNumberAnagramQueue<T> {
    Node head = null;
    Node tail = null;
    Node temp = null;



    public void add(T data){
        Node newNode = new Node((Integer) data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }



    public void queueprint() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
