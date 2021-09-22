package org.student;

import org.department.Department;

public class Student extends Department {
	
	
	
	public static void main(String[] args) {
		
		Student stud = new Student();
		stud.CollegeCode();
		stud.collegeName();
		stud.collegeRank();
		stud.departName();
		stud.studentName();
		stud.studentDept();
		stud.studentId();
		

}
	public void studentName() {
	
	System.out.println("Student name Swathi");
	
	}
	
	public void studentId() {
	System.out.println("111");
	
	}
	public void studentDept() {
	
	System.out.println("medical");
	}
}
