class sortedSquares {
    public int[] sortedSquares(int[] nums) {
        int[] array = new int[nums.length];
        int i = 0;
        int j = nums.length-1;
        int k = nums.length-1;
        while(i<=j){
            int val1 = nums[i]*nums[i];
            int val2 = nums[j]*nums[j];
            if(val1 > val2){
                array[k] = val1;
                i++;
            }else{
                array[k] = val2;
                j--;
            }
            k--;
        }
        return array;
    }
}