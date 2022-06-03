package com.masai_11thday_03;

import java.util.Scanner;

public class IPL {
	
	
	void homeTeamStadium(Stadium stadium){
		
		Stadium Teams = stadium;
		
		switch(Teams){
		case EDEN_GARDENS_STADIUM:
			System.out.println("This is the home ground of KKR");
			break;
		case WANKHEDE_STADIUM:
			System.out.println("This is the home ground of Mumbai Indians");
			break;
		case CHIDAMBARAM_STADIUM:
			System.out.println("This is the home ground of CSK");
			break;
		case M_CHINNASWAMY_STADIUM:
			System.out.println("This is the home ground of RCB");
			break;
		default:
			System.out.println("other Team");
		}
		

	}
	
	
	public static void main(String[] args) {
		Stadium[] arr = Stadium.values();
		
		IPL ipl = new IPL();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Stadium Name according to Enum");
		String  StadiumName = sc.next();
		int count = 0;
		Stadium input = Stadium.valueOf(StadiumName);
		System.out.println("sdvsdfsfd");
		
		for(Stadium arr1 : arr) {
			if(arr1.equals(input)) {
				count++;
				break;
			}
			
		}
		if(count==0) {
			System.out.println("Enter Proper Stadium Name according to Enum");
		}
		else {
			
			ipl.homeTeamStadium(input);
		}
		
		
		
		
	}

}
