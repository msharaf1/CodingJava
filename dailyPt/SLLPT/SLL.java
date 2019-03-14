

public class SLL{
    public Node head;

    public void addNode(int data){
        if(head == null){
            head = new Node(data);
            return;
        }
        Node runner = head;
        while(runner != null){
            runner = runner.next;
        }
        runner = new Node(data);
    }

    public void getNode(){
        Node runner = head;
        while(runner != null){
            System.out.println(runner.data);
            runner = runner.next;
        }

        // return 1;
    }
}