public class string9
{
    public static void main(String[] args) {
        String str="geeksforgeeks";
        char element='e';
        char c1[]=str.toCharArray();
        String res="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=element)
            {
                res+=str.charAt(i);
            }
        }
        System.out.println(res);
    }
}