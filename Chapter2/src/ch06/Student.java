package ch06;

public class Student {
	
	public int studentNumber;
	public String studentName;
	public int grade;
	
	public Student() {}
	
	public Student(int studentNumber, String studentName, int grade) {
		
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
		
		System.out.println("student ����");
	}
	
	public String showStudentInfo() {
		return studentName + "�л��� �й��� " + studentNumber + "�̰�, " + grade + "�г� �Դϴ�.";
	}
	
}
