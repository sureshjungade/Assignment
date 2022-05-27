package com.sixday_04;

public class CommandLineArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int num1 = Integer.parseInt(args[0]);
		//System.out.println(num1);
		int sum = 1;
		if(args.length == 1){
			int num1 = Integer.parseInt(args[0]);
			for(int i=num1; i>0; i--) {
				sum = sum*i;
			}
			System.out.println(sum);
		}
		else if(args.length == 2){
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int diff = Math.abs(num2-num1);
			for(int i=diff; i>0; i--) {
				sum = sum*i;
			}
			System.out.println(sum);
	}
		else {
			System.out.println("Error");
		}

}
}
