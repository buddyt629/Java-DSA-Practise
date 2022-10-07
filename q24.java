import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

import javax.lang.model.util.ElementScanner14;

public class q24 {
public static void rearrange(int arr[],int n)
{
    Stack<Integer> ps=new Stack<Integer>();
    Stack<Integer> ns=new Stack<Integer>();
    for(int i=0;i<n;i++)
    {
      if(arr[i]>=0)
      {
        ps.push(arr[i]);
      }
      else
      ns.push(arr[i]);
    }
    for(int i=0;i<n;i++)
    {
        if(i%2==0&&!ps.isEmpty())
        {
            arr[i]=ps.pop();
        }
        else if(i%2!=0&&!ns.isEmpty())
        {
            arr[i]=ns.pop();
        }
        else if(!ps.isEmpty())
        {
            arr[i]=ps.pop();
        }
        else if(!ns.isEmpty())
        {
            arr[i]=ns.pop();
        }
                    
    }
    
}
public static void main(String[] args) {
    int arr[]={9, 4, -2, -1, 5, 0, -5, -3, 2};
    int n=arr.length;
     rearrange(arr, n);
     for(int i=0;i<n;i++)
     {
        System.out.print(arr[i]+" ");
     }
}
}

