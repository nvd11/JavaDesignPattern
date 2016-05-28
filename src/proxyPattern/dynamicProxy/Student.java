package proxyPattern.dynamicProxy;

public class Student implements Studyable {
	
	private String name;
	private int examResult;

	public Student(String name, int examResult) {
		super();
		this.name = name;
		this.examResult = examResult;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", examResult=" + examResult + "]";
	}

	@Override
	public void study() {
		System.out.println(this + " is studying");
	}

	@Override
	public int exam() {
		System.out.println(this + " is examming");
		return this.examResult;
	}

	@Override
	public void graduate() {
		System.out.println(this + " graduated");
	}

	@Override
	public void beInSchool() {
		this.study();
		this.exam();
		this.graduate();
	}
	
}
