package Solution400_500;

import java.util.ArrayList;
import java.util.List;

public class Solution412 {
    String str1 = "Fizz";
    String str2 = "Buzz";
    String str3 = "FizzBuzz";
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0) list.add(str3);
            else if(i % 3 == 0) list.add(str1);
            else if(i % 5 == 0) list.add(str2);
            else list.add(String.valueOf(i));
        }
        return list;
    }
}
