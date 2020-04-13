package Solution000_100;

public class Solution2 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        System.out.println(addTwoNumbers(l1,l2));
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int flag = 0;
        ListNode p = l1;
        while (l1.next != null && l2.next != null) {
            l1.val += l2.val + flag;
            if (l1.val > 9) {
                l1.val %= 10;
                flag = 1;
            } else flag = 0;
            l1 = l1.next;
            l2 = l2.next;
        }
        if(l1.next != null && l2.next != null)
            l1.val += l2.val;
        else if (l2.next == null) {
            while (l1.next != null) {
                l1.val += l2.val + flag;
                if(l1.val > 9){
                    flag = 1;
                    l1.val %= 10;
                }else flag = 0;
                l1 = l1.next;
                l2.val = 0;
            }
        }else if (l1.next == null) {
            while (l2.next != null) {
                l1.val += l2.val + flag;
                if(l1.val > 9){
                    flag = 1;
                    l1.val %= 10;
                }else flag = 0;
                l2 = l2.next;
                l1.next = new ListNode(0);
                l1 = l1.next;
            }
        }
        l1.val += l2.val + flag;
        if(l1.val > 9){
            flag = 1;
            l1.val %= 10;
        }else flag = 0;
        if (flag == 1)
            l1.next = new ListNode(1);
        return p;
    }
}
