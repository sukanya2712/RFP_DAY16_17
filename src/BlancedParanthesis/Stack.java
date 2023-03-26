package BlancedParanthesis;

public class Stack<T> {
    Node<T> head;
    Node<T> tail;

    int size;
    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else {
            newNode.next=head;
            head=newNode;
        }
        size++;
    }

    public T pop(T data) {
        if (head == null) {
            return null;
        }
         data = head.data;
        head = head.next;
        size--;
        return data;
    }

    public void display(){
        Node<T>temp = head;
        while (temp!=null){
            System.out.println(temp.data+"-> ");
            temp=temp.next;
        }
    }

    public void check() {
        if(head==null)
        {
            System.out.println("equation is balanced");
        }
        else {
            System.out.println("equation is not balanced ");
            display();
        }
    }
}
