package leetCode;



class MergeLists {
    ListNode head;

    /* Method to insert a node at
       the end of the linked list */
    public void addToTheLast(ListNode node) {
        if (head == null) {
            head = node;
        } else {
            ListNode temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }

    /* Method to print linked list */
    void printList() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[])
    {
    /* Let us create two sorted linked
       lists to test the methods
       Created lists:
           llist1: 5->10->15,
           llist2: 2->3->20
    */
        MergeLists llist1 = new MergeLists();
        MergeLists llist2 = new MergeLists();

        // Node head1 = new Node(5);
        llist1.addToTheLast(new ListNode(5));
        llist1.addToTheLast(new ListNode(10));
        llist1.addToTheLast(new ListNode(15));

        // Node head2 = new Node(2);
        llist2.addToTheLast(new ListNode(2));
        llist2.addToTheLast(new ListNode(3));
        llist2.addToTheLast(new ListNode(20));

        llist1.printList();
        llist2.printList();

        llist1.head = new LLTwoSum().mergeTwoLists(llist1.head,
                llist2.head);
        llist1.printList();

    }
}


public class LLTwoSum {


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode first = l1, second = l2;
        ListNode head = new ListNode();
        ListNode tail = head;
        if(first.val <= second.val) {
            tail = first;
            head = first;
            first = first.next;
        }else {
            tail = second;
            head = second;
            second = second.next;
        }

        while(first != null || second != null){

            if(first == null) {
                tail.next = second;
                break;
            }
            if(second == null ) {
                tail.next = first;
                break;
            }

            if(first.val < second.val ){
                tail.next =  first;
                first = first.next;
            }else if(first.val > second.val){
                tail.next = second;
                second = second.next;
            }


            tail = tail.next;

        }
        return head;
    }


}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }