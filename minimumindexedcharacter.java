public class minimumindexedcharacter {
    public static int minimumindex(String str,String patt)
    {
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(patt.contains(String.valueOf(c)))
            {
                return i;

            }
           
        } return -1;
    }
    public static void main(String[] args) {
        String str="adcffaet";
        String patt="onkl";
        System.out.println(minimumindex(str, patt));
    }
}
