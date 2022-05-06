import sun.awt.image.ImageWatched;



public class ReverseLinkedList {

    public static void main(String[] args) {

        ReverseLinkedList solution = new ReverseLinkedList();

        LinkedList list = new LinkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        list.print();


        list.head=doReverse(list.head);

        list.print();


    }

    private static Node doReverse(Node head) {

        if (head == null || head.next == null) {
            return head;
        }
        Node p = doReverse(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }





    }


