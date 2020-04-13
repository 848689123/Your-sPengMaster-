package Solution100_300;

public class Solution206 {
    public ListNode reverseList(ListNode head) {

        int count = 0;
        int []nums = new int[10000];
        if(head==null||head.next==null)
            return head;
        for(;head!=null;count++){
            nums[count] = head.val;
            head = head.next;
        }
        ListNode listNode = new ListNode(nums[count]);
        ListNode p = listNode;
        for(int i=count-1; i>=0; i--){
            p.next = new ListNode(nums[i]);
            p = p.next;
        }
        return listNode;
    }
}
