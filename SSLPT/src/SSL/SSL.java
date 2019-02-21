package SSL;

public class SSL {
    public Node head;

    //Node runner

    public void addVal(int val){
        if(head == null){
            head = new Node(val);
            return;
        }
        Node runner = head;

        while (runner != null){
            runner = runner.next;
        }

        runner.next = new Node(val);

    }
    public int getNodeVal(){
        return head.value;
    }
}
