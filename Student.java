
public class Student extends Person{
	private String name;
	private int studentNumber;
	
	public Student(String newName, int newStudentNumber) {
		super(newName);
		name = newName;
		studentNumber = newStudentNumber;
	}
	
	public void reset(String newName, int newStudentNumber) {
		name = newName;
		studentNumber = newStudentNumber;
	}
	
	public int getStudentNumber() {
		return studentNumber;
	}
	
	public void setStudentNumber(int newStudentNumber) {
		studentNumber = newStudentNumber;
	}
	
	@Override
	public void writeOutput() {
		System.out.println("Name: " + name);
		System.out.println("Student Number: " + studentNumber);
	}
	
	public boolean equals(Student otherStudent) {
		if(studentNumber == otherStudent.studentNumber) return true;
		else return false;
	}
}
