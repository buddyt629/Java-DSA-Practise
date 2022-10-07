public class q25 {
    public static void main(String[] args) {
        int arr1[]={1,2,4,5,7};
        int arr2[]={5,6,3,4,8};
        int x=9;
        int n2=arr2.length;
        int n1=arr1.length;
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
               if(arr1[i]+arr2[j]==x){
                System.out.println(arr1[i]+"  "+arr2[j]);
            }}
        }
    }
}
