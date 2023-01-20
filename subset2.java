import java.util.HashSet;

public class printallsubsequence{
public static void printSubsequences(int[] arr, int index, String current,HashSet< String > res) {
    if (index == arr.length) {
        res.add(current);
        System.out.println(res.toString());
        return;
    }
    printSubsequences(arr, index + 1, current,res);
    printSubsequences(arr, index + 1, current + " " + arr[index],res);
}
public static void main(String[] args) {
    int[] arr = {1,2,2};
    HashSet<String> hs=new HashSet<>();
    printSubsequences(arr, 0, "",hs);  
}

}   