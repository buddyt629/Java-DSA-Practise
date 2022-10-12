public class string13 {
    public static int strstr(String s,String x)
    {
        if(s.contains(x))
        {
           return s.indexOf(x);
           
        }
        else return -1;
        
    }
    public static void main(String[] args) {
        String s="geeksforgeeks";
        String x="for";
        System.out.println(strstr(s,x));
       
}
}
