package test7;

import java.util.ArrayList;
import java.util.List;

class Person {
	protected String name;
	protected String birth;

	public Person(String name, String birth) {
		super();
		this.name = name;
		this.birth = birth;
	}

	public void printPersonInfo() {
		System.out.println("이름 : " + name);
		System.out.println("생년월일 : " + birth);
	}

}

class Employee extends Person {

	protected String employeedId;
	protected String dept;
	protected int salary;

	public Employee(String name, String birth, String employeedId, String dept, int salary) {
		super(name, birth);
		this.employeedId = employeedId;
		this.dept = dept;
		this.salary = salary;
	}

	public void raiseSalary(int salary) {
		this.salary += salary;
		System.out.println("급여 인상");
	}

	public void changeDepartment(String dept) {
		this.dept = dept;
		System.out.println("부서 변경");
	}

	public void printEmployeeInfo() {
		System.out.println("이름 : " + name);
		System.out.println("생년월일 : " + birth);
		System.out.println("직원 아이디 : " + employeedId);
		System.out.println("부서 : " + dept);
		System.out.println("급여 : " + salary);
	}
}

class Developer extends Employee {

	private String field;

	public Developer(String name, String birth, String employeedId, String dept, int salary, String field) {
		super(name, birth, employeedId, dept, salary);
		this.field = field;
	}

	public void changeField(String field) {
		this.field = field;
		System.out.println("개발 분야 변경");
	}

	public void printDeveloperInfo() {
		System.out.println("이름 : " + name);
		System.out.println("생년월일 : " + birth);
		System.out.println("직원 아이디 : " + employeedId);
		System.out.println("부서 : " + dept);
		System.out.println("급여 : " + salary);
		System.out.println("개발분야 : " + field);
	}
}

public class Test03 {
	public static void main(String[] args) {
		Person person = new Person("김유신", "1990-05-07");
		person.printPersonInfo();
		System.out.println("-------------------");

		Employee emp = new Employee("김춘추", "1992-07-14", "E001", "영업부", 200);
		emp.printEmployeeInfo();
		System.out.println("-------------------");
		Developer dev = new Developer("이순신", "1995-10-21", "D001", "개발부", 300, "프론트");
		dev.printDeveloperInfo();
		System.out.println("-------------------");
		// 부서 변경 테스트
		emp.changeDepartment("인사부");
		emp.printEmployeeInfo();
		System.out.println("-------------------");
		// 급여 인상 테스트
		dev.changeField("백엔드");
		dev.raiseSalary(50);
		dev.printDeveloperInfo();
		System.out.println("-------------------");
	}
}
