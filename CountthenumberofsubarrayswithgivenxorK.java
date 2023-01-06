import java.io.*;
public class CountthenumberofsubarrayswithgivenxorK {
    public int solve(int[] A, int B) {
        int c=0;
        for(int i=0;i<A.length;i++){
            int current_xor = 0;
            for(int j=i;j<A.length;j++){
                current_xor^=A[j];
                if(current_xor==B) c++;
            }
        }
        return c;
    }
}
class TUF {
	public static void main (String[] args) {
		Solution obj = new Solution();
		int[] A = new int[]{4,2,2,6,4};
		int countTotal=obj.solve(A,6);
		System.out.println("The total number of subarrays having a given XOR k is "+countTotal);
	}
}