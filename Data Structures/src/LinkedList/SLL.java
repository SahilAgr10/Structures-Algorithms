package LinkedList;

public class SLL {
    private Node head;
    private Node tail;
    private int size;

    public SLL() {
        this.size = 0;
    }
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next=head;
        head=node;
        size+=1;
        if(tail==null){
            tail=head;
        }
    }
    public void insertLast(int value){
        if(head==null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next=head;
        tail=node;
        size+=1;

    }

    public class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
