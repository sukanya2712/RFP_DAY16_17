package OrderedList;

import com.unorderedlist.Node;

public class LinkedListNo<T> {

    NodeNo<T> head;
    NodeNo<T> tail;
    public void addData(T data){
        NodeNo<T> newNode = new NodeNo(data);
        if(head == null){
            head=newNode;
            tail=newNode;
        }
        else {
            tail.next=newNode;
            tail=newNode;
        }
    }
    public void display() {
        NodeNo<T> temp = head;
        while(temp!= null)
        {
            System.out.print(temp.data + "-> ");
            temp= temp.next;
        }
    }
    public void deleteanyelement(T delete) {
        if (head == null) {
            return;
        }

        if (head.data == delete) {
            head = head.next;
            return;
        }

        NodeNo<T> prev = head;
        NodeNo<T> current = head.next;

        while (current != null) {
            if (current.data.equals(delete)) {
                System.out.println("DATA DELETED SUCESSFULLY");
                prev.next = current.next;
                return;
            }
            prev = current;
            current = current.next;
        }
    }
    public void search(T search) {
        NodeNo <T> temp = head;
        boolean flag= false;
        while(temp!=null)
        {
            if(temp.data == search)
            {
                flag=true;
                deleteanyelement(search);
            }
            temp=temp.next;
        }
        if(!flag){
            addData(search);
            System.out.println("data added successfully");
        }
    }

}
