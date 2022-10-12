public class string14 {
    public static void main(String[] args) {
        String s="i.like.this.very.much";
String[] arr = s.split("\\.");
String ans = "";
for (int i = 0; i < arr.length; i ++) {
    ans = arr[i] + "." +ans;
}
System.out.println(ans.substring(0, s.length()));

    }
}
