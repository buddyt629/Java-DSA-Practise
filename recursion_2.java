public class recursion_2 {
    public static void towerofhanoi(int n,String from,String to,String aux)
    {
        if(n==1)
        {
            System.out.println("from"+from+"to"+to+"aux"+aux);
            return;
        }
        towerofhanoi(n-1,from,to,aux);
        System.out.println("from"+from+"to"+to+"aux"+aux);
        towerofhanoi(n-1,from,to,aux);
    }
    public static void main(String[] args) {
        int n=4;
        String from="";
        String to="";
        String aux="";
        System.out.println(towerofhanoi(n,from,to,aux));
    }
}
