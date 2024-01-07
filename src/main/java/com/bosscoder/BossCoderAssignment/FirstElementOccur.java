package com.bosscoder.BossCoderAssignment;

import java.util.HashMap;

public class FirstElementOccur {

	public static void main(String[] args) {
		int arr[] = { 10, 1, 2, 3, 4, 5, 5, 5, 5, 4, 2, 3 };
		//solve(arr,2);
		System.out.println(solve(arr,4));
	}

	static int solve(int[] input, int k) {
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		int n = input.length;
		int count =1;
		for(int i=0;i<n;i++){
			if(!map.containsKey(input[i])) {
				map.put(input[i],count);
			}else {
				map.put(input[i],++count);
			}
			if(count==k)
				return input[i];
		}
		
        
//        for(int i=0;i<n;i++){
//
//            map.put(input[i],map.getOrDefault(input[i],0)+1);
//
//            if(map.get(input[i])==k) return input[i];
//
//        }
//
       return -1;

	}

}
