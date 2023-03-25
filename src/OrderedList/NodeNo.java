package OrderedList;

import com.unorderedlist.Node;

public class NodeNo<T> {
    T data;
    NodeNo<T> next;

    public NodeNo() {

    }

    public NodeNo(T data){
        this.data = data;
    }
}
