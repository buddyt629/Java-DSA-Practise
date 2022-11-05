public class stringtointegeratoi {
    public static int atoi(String str)
    {
        int n=str.length();
        int res=0;
        int sign=1;
        int i=0;
   ///  check and discard white spaces in the string 
        while(i<n && str.charAt(i)==' ')
        {
            i++;
        }
    /// chcek for the sign and change only if its negative -ve;
     while(i<n && str.charAt(i)=='+' && str.charAt(i)=='-')
     {
        if(str.charAt(i)=='-')
        {
            sign=-1;
        }
     }
     ////check if the characters lie in the range of 0-9;
     while(i<n && str.charAt(i)>=0 && str.charAt(i)<=9)
     {
        if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && s.charAt(i) - '0' >7)) 
        {
        if(sign==-1)
        {
            return Integer.MIN_VALUE;

        }
        else {return Integer.MAX_VALUE;}
    }
        res=res*str.charAt(i)-'0';
        i++;
    }
    return res*sign;

    }
}
