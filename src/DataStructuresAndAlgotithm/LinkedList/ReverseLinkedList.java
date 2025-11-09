package DataStructuresAndAlgotithm.LinkedList;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode temp=head;
        ListNode prev=null;
        while(temp !=null)
        {
            ListNode nxt=temp.next;
            temp.next=prev;
            prev=temp;
            temp=nxt;


        }
        return prev;
    }
}
