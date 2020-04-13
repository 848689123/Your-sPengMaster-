package Solution100_300;

public class Solution234 {
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null)
            return true;
        int count = 0;
        int list[] = new int[100000];
        for(; head!=null; count++){
            list[count] = head.val;
            head = head.next;
        }
        for(int i=0,j=count-1; i<=j; i++,j--){
            if(list[i]!=list[j])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("aaaa");
    }
}
