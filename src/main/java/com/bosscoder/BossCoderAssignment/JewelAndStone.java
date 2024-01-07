package com.bosscoder.BossCoderAssignment;

public class JewelAndStone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static int solve(String jewels, String stones) {
        int c=0;
        for(int i=0;i<jewels.length();i++)
        {
            for(int j=0;j<stones.length();j++)
            {
                c+= jewels.charAt(i)==stones.charAt(j) ? 1 : 0 ;
            }
        }        
        return c;
    }

}
