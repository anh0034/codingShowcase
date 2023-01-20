class Solution {
    public int pivotIndex(int[] nums) {
        int left = 0;
        int right = 0;
        int index = 0;
        for(int j=0; j<nums.length;j++){

            for(int i=0;i<j;i++){
                left= nums[i]+left;               
            }
            for(int i=nums.length-1;i>j;i--){
                right = nums[i]+right;   
            }
            if(left == right){
                index = j;
                break;
            }
            else if(j == nums.length-1){
                index = -1;
            }
            else{
                left = 0;
                right = 0;
                continue;                
            } 
        }
        return index;
    }
}
