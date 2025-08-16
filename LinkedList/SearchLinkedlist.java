

public class Linkedlist {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFisrt(int data) {//O(1)
        // create newnode
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Link head with newnode
        newNode.next = head;

        // head-->newNode
        head = newNode;
    }

    public void addLast(int data) {//O(n)
        // craete newNode
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Link NewNode with Tail
        tail.next = newNode;
        // tail-->newNode
        tail = newNode;
    }

    public void print() {//print func T>C-->O(n)
        if (head == null) {
            System.out.print("ll is Empty ");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");

    }

   
        public int helper( Node head,int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return  -1;
        }
        return idx+1;

    }
    public int recSearch(int key){
        return helper(head, key);
    }

    public int help(Node stNode,int key){
        Node temp = stNode;
        int idx = 0;

        while(temp != null){
            if(temp.data == key){
                return  idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }
    public int iterSearch(int key){
        return help(head, key);
    }

    
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.print();
        ll.addFisrt(5);
        ll.addFisrt(7);
        ll.addLast(9);
        ll.addLast(3);
        ll.add(2, 11);
        ll.print();
        // ll.reverse();
        // ll.print();
        System.out.println(ll.recSearch(7));
        // System.out.println(ll.recSearch(12));
        // System.out.println(ll.iterSearch(5));
        // System.out.println(ll.iterSearch(0));

         
        
    }

}
