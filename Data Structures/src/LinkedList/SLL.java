package LinkedList;

public class SLL {
    private Node head;
    private Node tail;
    private int size;

    public SLL() {
        this.size = 0;
    }
    public void insertFirst(int value){

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
