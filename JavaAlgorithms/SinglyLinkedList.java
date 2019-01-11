public class SinglyLinkedList{
    public Node head;
    public SinglyLinkedList(){
        this.head = null;
    };

    public void add(int value){
        Node newNode = new Node(value);
        if(this.head == null){
            this.head = newNode;
        }else{
            Node runner = this.head;
            while(runner.next != null){
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    public void remove(){
        if(this.head == null){
            System.out.println("Empty Node");
        } else{
            Node runner = this.head;
            while(runner.next !=null){
                if(runner.next.next == null){
                    runner.next = null;
                } else{
                    runner = runner.next;
                }
            }
        }
    }
    public void printValue(){
        Node runner = this.head;
        while(runner != null){
            System.out.println(runner.value);
            runner = runner.next;
        }
    }
    
}