public class arraysq14 {
    public static void sort(int arr[])
    {
       int zero=0;int one=0;int two=0;
       for(int i=0;i<arr.length;i++)
       {
        if(arr[i]==0)
        {
            zero++;
        }
        else if(arr[i]==1)
        {
            one++;
        }
        else two++;

       }
       for(int i=0;i<arr.length;i++)
       {
        if(zero>0)
        {
            arr[i]=0;
            zero--;
        }
        else if(one>0)
        {
            arr[i]=1;
            one--;
        }
        else 
        {
            arr[i]=2;
         
        }

       }
       for(int i=0;i<arr.length;i++)
       {
        System.out.print(arr[i]+" ");
       }
    }
    public static void main(String[] args) {
        int arr[]={0,2,1,2,0,1};
        sort(arr);
    }
}
