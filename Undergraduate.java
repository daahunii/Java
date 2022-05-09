
public class Undergraduate extends Student{
	private int level;
	
	public Undergraduate(String newName, int newStudentNumber, int newlevel) {
		super(newName, newStudentNumber);
		super.setName(newName);
		super.setStudentNumber(newStudentNumber);
		level = newlevel;
	}
	
	public void reset(String newName, int newStudentNumber, int newlevel) {
		super.setName(newName);
		super.setStudentNumber(newStudentNumber);
		level = newlevel;
	}
	
	public int getLevel() {
		return level;
	}
	
	public void setLevel(int newLevel) {
		level = newLevel;
	}
	
	@Override
	public void writeOutput() {
		System.out.println("Name: " + super.getName());
		System.out.println("Student Number: " + super.getStudentNumber());
		System.out.println("Student Level: " + level);
	}
	
	public boolean equals(Undergraduate otherUndergraduate) {
		if(level == otherUndergraduate.level) return true;
		else return false;
	}
}
