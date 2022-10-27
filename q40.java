class q40

{

    int minEle;

    Stack<Integer> s=new Stack<>();

 

    /*returns min element from stack*/

    int getMin()

    {

 // Your code here

 if(s.isEmpty())

 return -1;

        minEle=s.peek();

        for(int i=0;i<s.size();i++){

        if(minEle>s.get(i))

        minEle=s.get(i);

 }

        return minEle;

    }

    

    /*returns poped element from stack*/

    int pop()

    {

 // Your code here

 if(s.isEmpty()){

     return -1;

 }

    return s.pop();

    }

 

    /*push element x into the stack*/

    void push(int x)

    {

 // Your code here

    s.push(x);

    } 

}