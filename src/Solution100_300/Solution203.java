package Solution100_300;

public class Solution203 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode. next= new ListNode(1);
        listNode.next.next = new ListNode(0);
        listNode.next.next.next = new ListNode(1);
        removeElements(listNode,1);
        System.out.println("success");
    }
    public static ListNode removeElements(ListNode head, int val) {
        if(head==null)
            return head;
        while (head.val==val){
            if(head.val==val&&head.next!=null)
                head = head.next;
            if(head.val==val&&head.next==null)
                return null;
        }
        ListNode p = head;
        while(p.next!=null&&p.next.next!=null){
            if(p.next.val==val)
                p.next = p.next.next;
            else p = p.next;
        }
        if(p.next!=null&&p.next.val==val)
            p.next = null;
        if(p.val==val&&p.next!=null)
            p = p.next;
        if(p.val==val&&p.next==null)
            return null;
        return head;
    }
}
