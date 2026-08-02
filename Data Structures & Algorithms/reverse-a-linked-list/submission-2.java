
class Solution {
    public ListNode reverseList(ListNode head) {
       ListNode curr = head;
       ListNode prew = null;
       ListNode fwd = null;
       while(curr != null){
        fwd = curr.next;
        curr.next = prew;
        prew = curr;
        curr = fwd;

       }
       return prew;

    }
}
