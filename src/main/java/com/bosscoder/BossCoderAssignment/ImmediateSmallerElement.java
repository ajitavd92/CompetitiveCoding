package com.bosscoder.BossCoderAssignment;

public class ImmediateSmallerElement {

	public static void main(String[] args) {
		int[] a1= {4, 2, 1, 5, 3};
		smaller(a1);
	}
	
	static int[] smaller(int[]  input){
        for(int i=0;i<input.length;i++){
        	if(i>=input.length-1) {
            	input[input.length-1]=-1;
            	break;
            }
            if(input[i]>input[i+1]){
                input[i]=input[i+1];
            }else{
                input[i]=-1;
            }
        }
        return input;
    }

}
