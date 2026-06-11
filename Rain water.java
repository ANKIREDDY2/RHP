class Solution {
    public int trap(int[] height) {
        int n=height.length-1;
        int left=0;
        int right=n;
        int leftmax=height[0];
        int rightmax=height[n];
        int water=0;
        while(left<right)
        {
            if(leftmax<rightmax)
            {
                left++;
                leftmax=Math.max(leftmax,height[left]);
                
                water+=leftmax-height[left];
            }else{
                {
                right--;
                rightmax=Math.max(rightmax,height[right]);
                
                water+=rightmax-height[right];
            }
            }
        }
        return water;
    }
}




