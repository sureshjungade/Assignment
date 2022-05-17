package com.first_project;

public class JavaTotalScore {

	public static void totalScoreSum(int one, int two, int three, int four,int six) {
		
		int totalscore = ((one*2) + (two*1) + (three*2) + (four*4) + (six*8));
		System.out.println(totalscore);
  	}

	public static void main(String[] args){

		totalScoreSum(1,2,3,4,6);

	}

}
