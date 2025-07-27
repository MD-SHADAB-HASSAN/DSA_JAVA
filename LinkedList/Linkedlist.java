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

    public void addFisrt(int data) {
        // create newnode
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Link head with newnode
        newNode.next = head;

        // head-->newNode
        head = newNode;
    }

    public void addLast(int data) {
        // craete newNode
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Link NewNode with Tail
        tail.next = newNode;
        // tail-->newNode
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.print("ll is Empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.print();
        ll.addFisrt(5);
        ll.print();
        ll.addFisrt(3);
        ll.print();
        ll.addFisrt(1);
        ll.print();
        ll.addLast(6);
        ll.print();
        ll.addLast(8);
        ll.print();
        ll.addLast(9);
        ll.print();
    }
}
