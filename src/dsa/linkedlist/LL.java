package dsa.linkedlist;

public class LL {
    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size=0;
    }

    public void insert(int val,int index){
        Node temp=head;
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+",");
            temp=temp.next;
        }
        System.out.println("End");

    }
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
            // written return; means after insertFirst execution remaining
            //line of insertionLast will execute
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size+=1;
    }
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
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
