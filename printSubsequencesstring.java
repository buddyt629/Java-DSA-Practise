public class printSubsequencesstring{
public static void printSubsequences(String input, String output) {
    if (input.length() == 0) {
        System.out.println(output);
        return;
    }
    printSubsequences(input.substring(1), output);
    printSubsequences(input.substring(1), output + input.charAt(0));
}
public static void main(String[] args) {
    printSubsequences("abc", "");

}}