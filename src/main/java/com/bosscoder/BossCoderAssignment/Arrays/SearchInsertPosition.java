package com.bosscoder.BossCoderAssignment.Arrays;

public class SearchInsertPosition {

	public static void main(String[] args) {
		int[] original = {1,3};
		System.out.println(searchInsert(original,3));

	}
	
//	public static int searchInsert(int[] nums, int target) {
//		int index=0;
//        for(int i=0;i<nums.length;i++){
//        	int n= nums[i];
//        	if(i<nums.length-1) {
//            if(target==n){
//                index=i;
//                return index;
//            }else if(target!=n && (nums[i]<target && nums[i+1]>target)){
//            	index = i+1;
//            	return index;
//            }else if(target<n) {
//            	return index=i;
//            }
//        	}else if(target!=n && target>n){
//              i=(nums.length-1)+1;
//              index=i;
//        	}else {
//        		index=i;
//        	}
//        }
//		return index;
//    }
	
	
	public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) end = mid-1;
            else start = mid+1;
        }

        return start;
    }

}
