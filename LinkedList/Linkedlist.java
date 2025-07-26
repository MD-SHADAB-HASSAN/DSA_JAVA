public class Linkedlist{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;

    public void addFisrt(int data){
        //create newnode
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        //Link head with newnode
        newNode.next = head;

        //head-->newNode
        head = newNode;
    }

    public void addLast(int data){
        //craete newNode
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        //Link NewNode with Tail
        tail.next = newNode;
        //tail-->newNode
        tail = newNode;
    }
    

    public static void main(String[] args) {
     Linkedlist ll= new Linkedlist();
     ll.addFisrt(5);
     ll.addFisrt(3);
     ll.addFisrt(1);
     ll.addLast(6);
     ll.addLast(8);
     ll.addLast(9);
     Node currNode = head;
     while(currNode!=null){
        System.out.println(currNode.data);
        currNode = currNode.next;
     }   
    }
}