package com.bosscoder.BossCoderAssignment.Maths;

public class FourDivisor {

	public static void main(String[] args) {
		int a[] = { 21, 4, 7 };
		System.out.println(sumFourDivisors(a));
	}

	public static int sumFourDivisors(int[] nums) {
		int sum=0;
		for(int i=0; i<nums.length;i++) {
			sum+=fourFactorSum(nums[i]);
		}
		return sum;
	}

	public static int fourFactorSum(int n) {
		int count=0,sum=0;
		for(int i=1;i*i<=n;i++) { //i*i=1,4,9,16
			if(n%i == 0) {    //21%1=0 -->21%3=0
				if(n/i==i) { //21/1!=1 --> 21/3!=3
					return 0;
				}
				count+=2; //0+2=2-->2+2=4
				sum+=i;//0+1=1-->22+3=25
				sum+=(n/i);//1+21=22 -->25+(21/3)=25+7=32
			}
			if(count>4) return 0;
		}
		return count==4?sum:0;
	}
}
