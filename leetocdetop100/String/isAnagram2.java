import java.util.Arrays;

class isAnagram2 {
    public static boolean isAnagram(String s, String t) {
       
                int[] alphabet = new int[26];
                for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
                for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
                for (int i : alphabet) if (i != 0) return false;
                return true;
            }
    
    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";

        System.out.println(isAnagram(s, t));
    }
}