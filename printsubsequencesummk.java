public class printsubsequencesummk{
static void printSubsequences(int[] input, int k, int index, String output) {
    if (index == input.length) {
        if (k == 0) {
            System.out.println(output);
        }
        return;
    }
    printSubsequences(input, k, index + 1, output);
    printSubsequences(input, k - input[index], index + 1, output + " " + input[index]);
}
public static void main(String[] args) {
printSubsequences(new int[] {1, 2, 3, 4}, 5, 0, "");
  
}
}