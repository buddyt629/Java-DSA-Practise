class nextGreaterElement2 {
    static int[] nextGreaterElement(int N, int arr[]) {
       Stack<Integer>stack=new Stack<>();
        int a[]=new int[N];
        for(int i=0;i<N;i++)a[i]=-1;
               for(int i = 0;i< N * 2;i++){
           int curr = arr[i % N] ;
           while(!stack.empty() && arr[stack.peek()] < curr){ 
              a[stack.peek()] = curr;
              stack.pop();
           }
           if(i<N)stack.push(i);}
     return a;
    }
}
