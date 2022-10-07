public class q7 {
    public static void main(String[] args) {
        int arr[]={ 1, 3, 5, 5, 5, 5, 67, 123, 125 };
        int n=9;int x=5;
        int first=-1;
        int last=-1;
        for(int i=0;i<=n-1;i++)
        {
           if(arr[i] == x)
          {
            if(first==-1)
            first=i;
           
           else last=i;
        }}
        System.out.println(first);
        System.out.println(last);
    }
}
