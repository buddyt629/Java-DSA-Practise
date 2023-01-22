import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {
        int[] arr = {4,5,2,25};
        int[] result = nextGreaterElement(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(arr[i] + " -- " + result[i]);
        }
    }

    public static int[] nextGreaterElement(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] >= stack.peek()) {
                stack.pop();
            }
           // result[i] = stack.isEmpty() ? -1 : stack.peek();
            if(stack.isEmpty())
            {
                result[i]=-1;
            }
            else 
            {
                result[i]=stack.peek();
            }
            stack.push(arr[i]);
        }

        return result;
    }
}
