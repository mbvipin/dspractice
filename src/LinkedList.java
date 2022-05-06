public class LinkedList {

        Node head;



        public void add(int data)
        {
            Node node=new Node(data);
            if(head==null)
            {
                this.head=node;
            }

            Node current=this.head;

            while(current.next!=null)
            {
                current=current.next;
            }

            current.next=node;
            node.next=null;
        }

    public void print()
    {
        StringBuilder result=new StringBuilder();
        Node current=this.head;



        while(current.next!=null)
        {
            result.append(current.data);
            result.append("->");
            current=current.next;

        }

        result.append(current.data);

        System.out.println(result.toString());

    }
    }

