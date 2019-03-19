class Solution(object):
    def mergeTwoLists(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        head = ListNode(None)
        cur = head
        while l1 or l2:
            if not l1:
                cur.next = l2
                break
            if not l2:
                cur.next = l1
                break
            if l1.val < l2.val:
                cur.next = l1
                l1 = l1.next
            else:
                cur.next = l2
                l2 =l2.next
            cur = cur.next
        return head.next
