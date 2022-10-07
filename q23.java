public class q23 {
    public static void main(String[] args) {
        String arr[]={"geeksforgeeks","geeks","geek","gee"};
        int n=arr.length;
        String ans="";
        for(int i=0;i<arr[0].length();i++)
        {
            char ch=arr[0].charAt(i);
            boolean flag=true;
            for(int j=1;j<n;j++)
            {
                if(i>=arr[j].length()||ch!=arr[j].charAt(i))
                { 
                  flag=false;
                  break;
                }
            }
            if(flag==false)
            {
                break;
            }
              ans=ans+ch;
        }
        System.out.println(ans);
    }
    
}
