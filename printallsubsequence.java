public class printallsubsequence{
public static void printSubsequences(int[] arr, int index, String current) {
    if (index == arr.length) {
        System.out.println(current);
        return;
    }
    printSubsequences(arr, index + 1, current);
    printSubsequences(arr, index + 1, current + " " + arr[index]);
}
public static void main(String[] args) {
    int[] arr = {1,2,1};
    printSubsequences(arr, 0, "");  
}

}