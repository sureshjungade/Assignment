package com.sixday_02;

public class EvenSuminColumns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 3;
		int M = 3;
		
		int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0; i<N; i++) {
			int sum = 0;
			for(int j=0; j<M; j++) {
				if(arr[j][i]%2==0) {
					sum = sum + arr[j][i];
					//System.out.println(arr[i][j]);
				}
			}System.out.println(sum);
		}
	}
	

}
