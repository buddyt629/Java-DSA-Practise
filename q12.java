import javax.lang.model.util.ElementScanner14;

public class q12 {
    public static void main(String[] args) {
        int arr[]={1,0,2,0,2,2,1};
        int zero=0;
        int one=0;
        int two=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==0)
            {
                zero++;
            }
            else if(arr[i]==1)
            {
                one++;

            }
            else if(arr[i]==2)
            {
                two++;
            }
            else
            {
                System.out.println("Elements are present other then 0,1,2");
            }
        }
        /////////////////////////////////////
        for(int i =0;i<arr.length;i++){
            if(zero > 0){
                arr[i] = 0;
                zero--;
            }
            else if(one >0){
                arr[i] = 1;
                one--;
            }
            else{
                arr[i] =2;
            }
        }
        //////////////////////////////////////////
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
}
