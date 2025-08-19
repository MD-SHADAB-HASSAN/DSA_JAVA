public class removeCycleinLinkedList {
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

    public static boolean isCycle() {
    Node slow = head;
    Node fast = head;
    boolean cycle = false;

    // Step 1: Detect the cycle
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) {
            return true;
        }
    }
    return false;
} 

   public static boolean removeCycle() {
    Node slow = head;
    Node fast = head;
    boolean cycle = false;

    // Step 1: Detect the cycle
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) {
            cycle = true;
            break;
        }
    }

    if (!cycle) {
        return false;
    }

    // Step 2: Find the start of the cycle
    slow = head;
    Node prev = null;
    while (slow != fast) {
        prev = fast; // The key change: prev now points to the node before fast
        slow = slow.next;
        fast = fast.next;
    }
    
    // Step 3: Remove the cycle
    prev.next = null; // prev is now the node before the cycle's start
    return true;
}


    public static void main(String[] args){
        
        head = new Node(2);
        Node temp = new Node(3);
        head.next = temp;
        head.next.next = new Node(7);
        head.next.next.next = temp;
        System.out.println(isCycle());
       removeCycle();
       System.out.println(isCycle());
    }
}
