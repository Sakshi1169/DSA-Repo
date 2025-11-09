package DataStructuresAndAlgotithm.LinkedList;
//Gfg Remove loop in linked list
// time complexity O(n)
//space complexity O(1)
class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class RemoveLoop {
    public static void removeLoop(Node head) {
        if(head == null || head.next == null) return;

        Node slow = head;
        Node fast = head;

        // Step 1: Detect loop
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                break;
            }
        }

        // No loop
        if(fast == null || fast.next == null) return;

        // Step 2: Remove loop
        slow = head;

        if(slow != fast) {
            while(slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;
            }
            fast.next = null;
        } else {
            // Loop starts at head
            while(fast.next != slow) {
                fast = fast.next;
            }
            fast.next = null;
        }
    }
}
