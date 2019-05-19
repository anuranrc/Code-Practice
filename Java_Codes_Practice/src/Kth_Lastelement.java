public class Kth_Lastelement {

    public static Node find_kth_lstelmnt(Node head, int k){
        Node klast_node = new Node(0);
        Node tmp = head;
        int length = 1;
        int count = 1;
        while(tmp.next != null){
            length++;
            tmp = tmp.next;
        }
        tmp = head;
        int kth = length-k+1;
        while (tmp.next!= null){
            if (count< kth){
                count++;
            }
            else if (count == kth){
                klast_node = tmp;
            }
          tmp =tmp.next;
        }
        return  klast_node;
    }
    public  static void main(String[] args){
        //int x = 10;
        int k = 10;
        Node head = new Node(23);
        Node a = new Node(10);
        Node b = new Node(3);
        Node c = new Node(7);
        Node d = new Node(5);
        Node e = new Node(45);
        Node f = new Node(56);
        Node g = new Node(78);
        Node h = new Node(65);
        Node i = new Node(6);
        //Node j = new Node(7);
        //Node tmp =  head;
        head.next = a;
        a.next = b;
        b.next =c;
        c.next =d;
        d.next =e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = null;
        //i.next = j;
        //j.next = null;
        Node x = find_kth_lstelmnt(head,k);
        System.out.println("data    " + x.data);

    }
}
