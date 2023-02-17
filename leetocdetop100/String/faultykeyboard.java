public class faultykeyboard{
    public static boolean isLongPressedName(String name, String typed) {
        int i=0;
        int j=0;
        while(i<name.length() && j<typed.length()){
            if(name.charAt(i) == typed.charAt(j)){
                i++;
                j++;
            }
            
            else {  
                if(typed.charAt(j) == typed.charAt(j-1))
                    j++;
                
                else
                    return false;    
            }
        }
        
        
        //Case 1 : i and j both reached end of the String
        if(i == name.length() && j == typed.length())
            return true;
        
        //Case 2 : First word is not yet complete traversed. The second word is complete
        else if(i != name.length() && j == typed.length())
            return false;
        
        //Case 3: First word complete. The second word still has some characters left.
        else{
            while(j != typed.length()){
                if(typed.charAt(j) == typed.charAt(j-1))
                    j++;
                
                else
                    return false;
            }
        }
        return true;
    }
    }
    }
    public static void main(String[] args) {
        System.out.println(isLongPressedName(name,typed));
    }
}