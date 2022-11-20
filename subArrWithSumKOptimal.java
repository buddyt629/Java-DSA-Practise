import java.util.HashMap;

public class subArrWithSumKOptimal {
    public static void subArrWithSumKOptimal(int arr[],int n,int sum)
    {
        int currsum=0;
        int start=0;
        int end=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            currsum+=arr[i];
            if(currsum==sum)
            {
                start=0;
                end=i;
                break;


            }
            else if(map.containsKey(currsum-sum))
            {
                start=map.get(currsum-sum)+1;
                end=i;
                break;

            }
            map.put(currsum, i);
            if(end==-1)
            {
                System.out.println("Not found");
            }
            else{
                System.out.println(start+"   "+end);
            }



        }
    }
    public static void main(String[] args) {
        
    }
}
