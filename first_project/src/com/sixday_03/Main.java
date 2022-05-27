package com.sixday_03;

	
	public class Main{
		public int[] findAndReturnPrimeNumbers(int[] inputArray){
		
			int[] A = new int[80];
			int k = 0;
			int count1 = 0;
			for(int i=0; i<inputArray.length; i++) {
				int count = 0;
				for(int j=1; j<=inputArray[i]; j++) {
					if(inputArray[i]%j==0) {
						count++;
						
					}
				}if(count==2) {
					A[k++] = inputArray[i];
				}else {
					count1++;
				}
			}if(count1<inputArray.length) {
				return A;
				//System.out.println(A);
			}else {
				return A;
				//System.out.println(A);
			}
		
	
		}
		public static void main(String[] args){
			int[] arr = {10,12,5,50,11,14,15};
			Main obj = new Main();
			int[] ans = obj.findAndReturnPrimeNumbers(arr);
			System.out.println(ans);
			for(int i=0; i<ans.length; i++) {
				
				if(ans[0]==0) {
					System.out.println("Prime number not found in the supplied Array");
					break;
				}
				else if(ans[i]!=0) {
					System.out.println(ans[i]);
				}
				else {
					break;
				}
			}
		
		
		}
		}


