package ch09;

public class SubjectTest {

	public static void main(String[] args) {

		Student studentLee = new Student(100, "Lee");
		studentLee.setKoreaSubject("국어", 100);
		studentLee.setMathSubject("수학", 80);
		
		Student studentLKim = new Student(200, "Kim");
		studentLee.setKoreaSubject("국어", 50);
		studentLee.setMathSubject("수학", 40);
		
		studentLee.showScoreInfo();
		studentLKim.showScoreInfo();
	}

}
