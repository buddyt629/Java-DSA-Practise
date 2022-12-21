public class checkforprime {
    public static void checkprime(int num)
    {
        int count=0;
         for(int i=2;i*i<=num;i++)
         { 
            if(num%i==0)
            {
                count++;
                break;
            }
         }
         if(count==0)
         {
            System.out.println("No is priime");
         }
         else 
         {
            System.out.println("No is not prime");
         }
    }
    public static void main(String[] args) {
        int num=12;
        checkprime(num);
    }
}
