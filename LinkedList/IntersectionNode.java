
public class IntersectionNode {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public static void print(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+"->");
            curr =curr.next;
        }

        System.out.println("null");
    }

    public static Node getIntersectionNode(Node head1, Node head2){
        if(head1 == null || head2 == null){
            return null;
        }

        Node pA = head1;
        Node pB = head2;

        while(pA != pB){
            if(pA == null){
                pA = head2;
            }
            else{
                pA = pA.next;
            }

            if(pB == null){
                pB = head1;
            }
            else{
                pB = pB.next;
            }
        }
        return pA;
    }

    public static void main(String[] args){
        Node node1 = new Node(3); //List A: 3->2->1->null
        Node node2 = new Node(2);
        Node node3 = new Node(1);
        node1.next = node2;
        node2.next = node3;

        Node head1 = new Node(4); //List B: 4->5->3->2->1->null
        Node node4 = new Node(5);
        head1.next = node4;
        node4.next = node1; 

        Node head2 = new Node(6);
        Node node5 = new Node(7);
        Node node6 = new Node(8);
        head2.next = node5;
        node5.next = node6;
        node6.next = node1;

        System.out.print("List 1:");
        print(head1);

        System.out.print("list 2:");
        print(head2);

        Node intersect = IntersectionNode.getIntersectionNode(head1, head2);

        if(intersect != null){
            System.out.println("Intersection found at node with value " + intersect.data);
        }else{
            System.out.println("No intersection found");
        }
    }
}
