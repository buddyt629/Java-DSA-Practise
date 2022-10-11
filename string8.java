import java.util.Arrays;

public class string8 {
    public static void main(String[] args) {
        String a="allergy";
        String b="allergic";
        char arr1[]=a.toCharArray();
        char arr2[]=b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1, arr2))
        {
            System.out.println("anagram");
        }
       else System.out.println("Not an anagram");
    }
}
