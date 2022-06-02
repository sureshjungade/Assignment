package com.Tenthday_02;

public class ScienceStudent extends Student{
	
	int phisicsMarks;
	int chemistryMarks;
	int mathsMarks;
	
	
	public ScienceStudent(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}

	public int getPhisicsMarks() {
		return phisicsMarks;
	}

	public void setPhisicsMarks(int phisicsMarks) {
		this.phisicsMarks = phisicsMarks;
	}

	public int getChemistryMarks() {
		return chemistryMarks;
	}

	public void setChemistryMarks(int chemistryMarks) {
		this.chemistryMarks = chemistryMarks;
	}

	public int getMathsMarks() {
		return mathsMarks;
	}

	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}


	@Override
	public int getPercentage() {
		double sum = chemistryMarks+mathsMarks+phisicsMarks;
		//System.out.println((x/300)*100);
		//double y = (x/300)*100;
		
		double PCMarks = ((sum)/(300))*100;
		int percentage = (int)PCMarks;
		return percentage;
	}

	

}
