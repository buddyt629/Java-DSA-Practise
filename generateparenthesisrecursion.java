class generateparenthesis {
    
   public List<String> AllParenthesis(int n) 
    {
        List<String> ans = new ArrayList<>();
        generate(n, "(", 1, 0, ans);
        return ans;
    }
    
    public void generate(int n, String str, int open, int close, List<String> ans){
        if(str.length()==2*n){
            ans.add(str);
            return;
        }
        
        if(open < n)
            generate(n, str+"(", open+1, close, ans);
        if(close < open)
            generate(n, str+")", open, close+1, ans);
    }
}