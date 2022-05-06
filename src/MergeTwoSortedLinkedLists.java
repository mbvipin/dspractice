public class MergeTwoSortedLinkedLists {

    public static void main(String[] args) {

        LinkedList list1=new LinkedList();

        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(7);
        list1.add(9);

        LinkedList list2=new LinkedList();

        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);
        list2.add(10);

        Node merged=merge(list1.head,list2.head);


        Node current=merged;

        while(current.next!=null)
        {
            System.out.println(current.data);
            System.out.println("->");
            current=current.next;
        }

        System.out.println(current.data);
    }

    private static Node merge(Node first, Node second) {

        if(first==null) return second;
        if(second==null) return first;

        if( first.data <= second.data)
        {
            first.next=merge(first.next,second);
            return first;
        }

        else
        {
            second.next=merge(first,second.next);

            return second;

        }



    }
}
