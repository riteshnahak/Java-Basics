package dsa.linkedlist;

public class LinList {
    private Node head;
    private Node tail;
    private int size;
    public LinList() {
        this.size = 0;
    }

    public void insert(int val,int index){
        if(head==null){
            insertFirst(val);
            return;
        }
        if(tail==null){
            insertLast(val);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;
    }
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }
    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
    }
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }

    private class Node{
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
