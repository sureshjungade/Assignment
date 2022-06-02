package com.Tenthday_02;

import java.util.Scanner;

public class AllStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Name");
		String  ScienceStudentName = sc.next();
		System.out.println("Enter Your Address");
		String  ScienceStudentAddress = sc.next();
		
		Student Sciencestudent = new ScienceStudent(ScienceStudentName,ScienceStudentAddress);
		ScienceStudent SC = (ScienceStudent) Sciencestudent;
		System.out.println("Enter Your Physics Marks");
		int ChemistryMarks = sc.nextInt();
		System.out.println("Enter Your Maths Marks");
		int MathsMarks = sc.nextInt();
		System.out.println("Enter Your Phisics Marks");
		int PhisicsMarks = sc.nextInt();
		
		SC.setChemistryMarks(ChemistryMarks);
		SC.setMathsMarks(MathsMarks);
		SC.setPhisicsMarks(PhisicsMarks);
		
		int PercentageofScienceMarks = Sciencestudent.getPercentage();
		System.out.println("Science Student Name: "+SC.getName());
		System.out.println("Science Student Address: "+SC.getAddress());
		System.out.println("Science Marks Percentage :"+PercentageofScienceMarks + " %");
		
		System.out.println("==========================================================");
		
		System.out.println("Enter Your Name");
		String  HistoryStudentName = sc.next();
		System.out.println("Enter Your Address");
		String  HistoryStudentAddress = sc.next();
		Student Historystudent = new HistoryStudent(HistoryStudentName,HistoryStudentAddress);
		
		HistoryStudent history = (HistoryStudent) Historystudent;
		
		System.out.println("Enter Your Civics Marks");
		int CivicsMarks = sc.nextInt();
		System.out.println("Enter Your History Marks");
		int HistoryMarks = sc.nextInt();
		
		history.setCivicsMarks(CivicsMarks);
		history.setHistoryMarks(HistoryMarks);
		
		int PercentageofHistoryMarks = Historystudent.getPercentage();
		System.out.println("History Student Name: "+history.getName());
		System.out.println("History Student Address: "+history.getAddress());
		System.out.println("History Marks Percentage :"+PercentageofHistoryMarks + " %");
	}

}
