package com.evalC2_4Que;

public class Student extends Person{
	
	int studentId;
	String courseEnrolled;
	int courseFee;
	
	public Student() {
	}
	
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getCourseEnrolled() {
		return courseEnrolled;
	}

	public void setCourseEnrolled(String courseEnrolled) {
		this.courseEnrolled = courseEnrolled;
	}

	public int getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(int courseFee) {
		this.courseFee = courseFee;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", courseEnrolled=" + courseEnrolled + ", courseFee=" + courseFee
				+ ", Address="+this.address +"]";
	}

}
