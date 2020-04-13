package Solution400_500;

import java.util.ArrayList;
import java.util.List;

public class Solution401 {
    public List<String> readBinaryWatch(int num) {
        List<String> list = new ArrayList();
        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 60; j++){
                if(Integer.bitCount(i) + Integer.bitCount(j) == num)
                    if(j < 10) list.add(i + ":" + "0" + j);
                    else list.add(i + ":" + j);
            }
        }
        return list;
    }
}
