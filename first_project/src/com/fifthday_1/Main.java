package com.fifthday_1;

import java.util.Scanner;

public class Main {

public static Employee getEmployeeDetails() {
Employee e1 = new Employee();

Scanner scanner = new Scanner(System.in);

System.out.println("Enter Id ");
e1.setEmployeeId(scanner.nextInt());

System.out.println("Enter name");
e1.setEmployeeName(scanner.next());

scanner.nextLine();

System.out.println("Enter Salary");
e1.setSalary(scanner.nextDouble());

System.out.println("Enter PF Percentage");
e1.setNetSalary(scanner.nextDouble());

return e1;

}

public static void main(String[] args) {

        Employee e = new Employee();

        //Scanner scanner = new Scanner(System.in);


e = getEmployeeDetails();

double x  = e.getNetSalary();

System.out.println("Id: "+ e.getEmployeeId());
System.out.println("Name: "+ e.getEmployeeName());

System.out.println("Salary: "+ e.getSalary());


System.out.println("Net Salary: " +  e.calculateNetSalary(x));
 




}

}
