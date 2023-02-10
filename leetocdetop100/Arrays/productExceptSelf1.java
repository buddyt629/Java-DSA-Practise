class  productExceptSelf1 {
    public int[] productExceptSelf(int[] nums) {
        int left[]=new int[nums.length];
        int right[]=new int[nums.length];
        int product[]=new int[nums.length];
          //updating left array
          left[0]=1;
          for(int i=1;i<nums.length;i++)
          {
            left[i]=left[i-1]*nums[i-1];
          }
          //updating right array
          right[nums.length-1]=1;
          for(int i=nums.length-2;i>0;i--)
          {
            right[i]=right[i+1]*nums[i+1];
          }
          //updating product
          for(int i=0;i<product.length;i++)
          {
            product[i]=left[i]*right[i];
          }
          return product;

    }
    public static void main(String[] args) {
        
    }
}