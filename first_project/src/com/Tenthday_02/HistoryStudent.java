package com.Tenthday_02;

public class HistoryStudent extends Student{
	
	int historyMarks;
	int civicsMarks;
	
	

	public HistoryStudent(String name, String address) {
		super(name, address);
		
	}

	public int getHistoryMarks() {
		return historyMarks;
	}

	public void setHistoryMarks(int historyMarks) {
		this.historyMarks = historyMarks;
	}

	public int getCivicsMarks() {
		return civicsMarks;
	}

	public void setCivicsMarks(int civicsMarks) {
		this.civicsMarks = civicsMarks;
	}

	@Override
	public int getPercentage() {
		double sum = civicsMarks+historyMarks;
		double PCMarks = ((sum)/(2*100))*100;
		int percentage = (int)PCMarks;
		return percentage;
	}

}
