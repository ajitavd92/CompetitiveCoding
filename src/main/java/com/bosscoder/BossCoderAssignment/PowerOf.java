package com.bosscoder.BossCoderAssignment;

public class PowerOf {

	public static void main(String[] args) {
		System.out.println(check(8));
	}
	
	 static boolean check(int n){
			if(n==0){
	            return false;
	        }
	        while(n!=1){
	            if(n%2 !=0){
	                return false;
	            }
	            n=n/2;
	        }
	        return true;
	    }

}
