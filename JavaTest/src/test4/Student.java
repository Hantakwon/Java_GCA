package test4;

public class Student {
	
	private String name;
	private String studentId;
	private Subject[] subjects;
	private int[] scores;
	private int subjectCount;

	public Student(String name, String studentId) {
		this.name = name;
		this.studentId = studentId;
		this.subjects = new Subject[10];
		this.scores = new int[10];
		this.subjectCount = 0;
	}

	public void enrollSubject(Subject subject) {
		subject.addStudent(this);
		System.out.println(name + " - " + subject.getSubName() + " 과목 신청완료");
	}

	public void setScore(Subject subject, int score) {
		this.subjects[subjectCount] = subject;
		this.scores[subjectCount] = score;
		subjectCount++;
		System.out.println(name + " - " + subject.getSubName() + " 점수 입력완료");
	}

	public void printStudentInfo() {
		System.out.println("학생 이름 : " + name);
		System.out.println("ID : " + studentId);
		System.out.println("성적");
		for (int i = 0; i < subjectCount; i++) {
			System.out.println(" - " + subjects[i].getSubName() + ":" + scores[i]);
		}
	}

	public String getName() {
		return name;
	}

}
