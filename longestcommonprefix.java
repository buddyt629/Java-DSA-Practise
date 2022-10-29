import java.util.Arrays;

class longestcommonprefix {
    public static String longestCommonPrefix(String[] strs) {
        String ans="";
        int n=strs.length;
        char[] first=strs[0].toCharArray();
        char[] last=strs[n-1].toCharArray();
      Arrays.sort(strs);
        for(int i=0;i<first.length;i++)
        {
            if(first[i]!=last[i])
            {
                break;
            }
            ans+=first[i];
        }
        
        return ans.toString();
    }
    public static void main(String[] args) {
        String str[]= {"ab","a"};
        System.out.println(longestCommonPrefix(str));
    }
}