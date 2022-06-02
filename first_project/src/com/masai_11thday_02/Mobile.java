package com.masai_11thday_02;

public class Mobile {
	
	String[] outdatedModels = {"note4","note5","note6","note7"};
	
	public void searchOutdatedModel(String CompanyName,String... ModelName){
		int count = 0;
		for(String arr : outdatedModels) {
			
			for(String arr1 : ModelName) {
				if(arr.equals(arr1)) {
					System.out.println(arr+"_OUTDATED");
					count++;
					break;
				}
			}
		}
		if(count==0) {
			System.out.println("Your Mobile is not OUTDATED");
		}
	}
	
	
	public static void main(String[] args) {
		Mobile mob = new Mobile();
		
		mob.searchOutdatedModel("Apple","note5","note4");
	}


	
}
