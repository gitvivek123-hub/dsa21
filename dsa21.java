class Solution {
    public int searchInsert(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;

        while(first <= last){
            int mid = (first + last) / 2;

            if(target == nums[mid]){
                return mid;
            }
            if(target < nums[mid]){
                last = mid - 1;
            }
            else{
                first = mid + 1;
            }
        }
        return first;
    }
}
