package com.evalC2_4Que;

public class Main {
	
	
	public static Person generatePerson(Person person) {
		
		if(person instanceof Student) {
			Student s1 = (Student)person;
			s1.setName("Suresh");
			s1.setGender("Male");
			s1.setStudentId(123);
			s1.setCourseEnrolled("JA111");
			s1.setCourseFee(300000);
			
			Address address = new Address();
			address.setCity("surat");
			address.setPinCode("34221");
			address.setState("Gujarat");
			s1.setAddress(address);
			
			return s1;
		}
		else {
			Instructor s1 = (Instructor)person;
			s1.setName("Gaurav");
			s1.setGender("Male");
			s1.setInstructorId(45);
			s1.setSalary(50000);
			
			Address address = new Address();
			address.setCity("Mumbai");
			address.setPinCode("40002");
			address.setState("Maharashtra");
			s1.setAddress(address);
			return s1;
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		Person newStudent = generatePerson(new Student());
		Person newTeacher = generatePerson(new Instructor());

		System.out.println(newStudent);
		System.out.println(newTeacher);
		
		
	}
	

}
