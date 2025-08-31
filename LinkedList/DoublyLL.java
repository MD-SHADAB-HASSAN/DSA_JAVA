public class DoublyLL {
    public static class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static Node head;
    public static Node  tail;
    public static int size;

    public void addFirst(int data){     //Logic to add value in First of Double Linkedlist
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;

        head.prev = newNode;

        head = newNode;
    }

    public void addLast(int data){      //Logic to add value in Last of Double Linkedlist
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail =newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public int removeFirst(){        //Logic to Remove First value in Double Linkedlist
        if(head == null ){
            System.out.println("DLL is Empty");
            return Integer.MIN_VALUE;
        }

        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    public int removelast(){        //Logic to Remove Last value in Double Linkedlist
        if(head == null){
            System.out.println("Dll is Empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size --;
            return val;
        }
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }

    public void print(){           //Logic to Print Double Linkedlist
        Node temp =head;
        System.out.print("null<->");
        while(temp != null){
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverse(){         //Logic to Reverse Double Linkedlist
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        dll.addLast(4);
        dll.addLast(5);
        dll.addLast(6);
        dll.print();
        System.out.println(dll.size);
        dll.removeFirst();
        dll.print();
        System.out.println(dll.size);
        dll.removelast();
        
        dll.print();
        System.out.println(dll.size);
        dll.reverse();
        dll.print();
        
    }
}

