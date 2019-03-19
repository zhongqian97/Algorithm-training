class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null)return l2;
        if(l2 == null)return l1;
        ListNode left;
        ListNode head;
        if(l1.val <= l2.val){
            head = l1;
            left = l1;
            l1 = l1.next;
        }else{
            head = l2;
            left = l2;
            l2 = l2.next;
            head.next = l1;
        }
        while(l1 != null || l2 != null){
            if(l1 == null){
                left.next = l2;
                break;
            }else if(l2 == null){
                break;
            }
            if(l1.val <= l2.val){
                left = l1;
                l1 = l1.next;
            }else{
                left.next = l2;
                l2 = l2.next;
                left.next.next = l1;        
                left = left.next;
            }
        }
        return head;
    }
}
