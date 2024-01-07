package com.bosscoder.BossCoderAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DiagonalPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[][]={{1,2,3},{5,6,7},{9,10,11}}; 
		List<List<Integer>> input = new ArrayList<List<Integer>>();
		input.add(Arrays.asList(2,2,1));
		input.add(Arrays.asList(1,4,4));
		input.add(Arrays.asList(9,10,11));
		//diagonalPrime(input);
		System.out.println("count=" + diagonalPrime(input));
	}
	
	public static int diagonalPrime(List<List<Integer>> input) {

		int result =0; 
        int m= input.get(result).size();
        for(int i=0; i<input.size(); i++){
            if(prime(input.get(i).get(i))){
                result=Math.max(result, input.get(i).get(i));
            }
            if(prime(input.get(i).get(m-1-i))){
                result=Math.max(result, input.get(i).get(m-1-i));
            }
        }
        return result;
    }
	
	public static boolean prime(int n){
	    if (n<=1){
	        return false;
	    }
	    for (int i=2; i<=Math.sqrt(n); i++){
	        if (n%i==0){
	            return false;
	        }
	    }
	    return true;
	}
}
