package Solution400_500;

public class Solution434 {

    public int countSegments(String s) {
        if(s==null||s.length()==0)  return 0;
        int count = 0;
        char str[] = s.toCharArray();
        if(str[0]!=' ') count++;
        for(int i=1;i<str.length;i++)
            if(str[i]!=' '&&str[i-1]==' ')
                count++;
        return count;
    }
}
