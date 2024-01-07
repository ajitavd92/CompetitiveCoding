package com.bosscoder.BossCoderAssignment.Maths;

public class SubtractProduct {

	public static void main(String[] args) {
		System.out.println(subtractProductAndSum(234));

	}
	
	public static int subtractProductAndSum(int n) {
        int p=1,s=0;
        while(n!=0){
            int rem=n%10; //234%10=4-->23%10=3-->2%10=2
            p*=rem;//1*4=4-->4*3=12-->12*2=24
            s+=rem;//0+4=4-->4+3=7-->7+2=9
            n/=10;//234/10=23-->23/10=2-->2/10=0
        }
        return p-s;
    }

}
