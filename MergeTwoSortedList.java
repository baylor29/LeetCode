import Algorithms.DateSort.Insertion;

public class MergeTwoSortedList {

    public static void main(String[] args) {
        ListNode n = new ListNode(5);
        n.next = new ListNode(3);
        n.next.next = new ListNode(7);
        System.out.println(n.next.val);

    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode r = null;
        if (l1 ==null) return l2;
        if (l2 ==null) return l1;
        ListNode c1 = l1;
        ListNode c2 = l2;
        //initialize
        if (c1.val == c2.val){
            r = new ListNode(c1.val);
            c1 = c1.next;
        }else if (c1.val > c2.val){
            r = new ListNode(c2.val);
            c2 = c2.next;
        }else {
            r = new ListNode(c1.val);
            c1 = c1.next;
        }
        //general case
        while (c1 != null && c2 != null){

            if (c1.val > c2.val){
                addLast(r,c2.val);
                c2 = c2.next;
            }
            else {
                addLast(r,c1.val);
                c1 = c1.next;
            }
        }
        while(c1 != null){
            addLast(r,c1.val);
            c1 = c1.next;
        }
        while (c2 != null){
            addLast(r,c2.val);
            c2 = c2.next;
        }
        return r;

    }
        public void addLast(ListNode r, int i) {
            ListNode current = r;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(i);

        }
}
