package com.first_project;

public class VowelAndConsonant {
	
	public void vC(char x) {
		// TODO Auto-generated method stub
		String Lower = "abcdefghijklmnopqrstuvwxyz";
		String Upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String LowerC = "aeiou";
		String UpperC = "AEIOU";
		int count = 0;
		int count1 = 0;
		
		for(int i=0; i<Lower.length(); i++) {
			if(x==Lower.charAt(i) || x==Upper.charAt(i)) {
				count1++;
				
				for(int j=0; j<LowerC.length(); j++) {
					if(x==LowerC.charAt(j) || x==UpperC.charAt(j)) {
						System.out.println("Vowel");
						count++;
					}
				}if(count==0) {
					System.out.println("Consonant");
				}
			}
		}
		if(count1==0) {
			System.out.println("invalid character");
	}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VowelAndConsonant findVC = new VowelAndConsonant();
				char Vowel = 'e';
				char Consonant = 'j';
				char InvaildChar = '5';
						findVC.vC(Vowel);
						findVC.vC(Consonant);
						findVC.vC(InvaildChar);
		
	}

}
