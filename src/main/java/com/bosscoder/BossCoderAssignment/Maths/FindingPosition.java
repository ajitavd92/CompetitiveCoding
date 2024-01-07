package com.bosscoder.BossCoderAssignment.Maths;

import java.util.ArrayList;
import java.util.List;

public class FindingPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nthPosition(5);
	}
	
	static long nthPosition(long n){
        List<Integer> ans = new ArrayList<>();
        for(int i=1;i<=n;i++){  //2,4
            if(i%2==0){
                ans.add(i);
            }
        }
        nthPosition(ans.size());
        
        return ans.get(0);
    }
	

}
