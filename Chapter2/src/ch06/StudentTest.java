package ch06;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student();
		
		System.out.println(studentLee.showStudentInfo());
		
		Student studentAhn =  new Student(1234, "¾ÈÅÂ¹Î", 6);
		System.out.println(studentAhn.showStudentInfo());
	}

}
