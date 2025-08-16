public class LinkedListnew{
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


    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            System.out.println("Linkedlist is Empty");
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void print(){
        if(head == null){
            System.out.print(" Linkedlist is Empty");
            return;
        }
        Node tmp = head;
        while(tmp != null){
            System.out.print(tmp.data+"->");
            tmp = tmp.next;
        }
        System.out.println("null");
    }

   

    public static void main(String[] args){
        LinkedListnew ll = new LinkedListnew();
        ll.print();
        ll.addFirst(0);
        ll.addFirst(9);
        ll.addFirst(7);
        ll.addFirst(6);
        ll.addFirst(3);
        ll.print();
        
    }


}
