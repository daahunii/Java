
public class Faculty extends Employee{
	private String title;
	
	public Faculty(String newName, String newDept, int newId, String newTitle) {
		super(newName, newDept, newId);
		super.setName(newName);
		super.setDept(newDept);
		super.setId(newId);
		title = newTitle;
	}
	
	@Override
	public void writeOutput() {
		System.out.println("Name: " + super.getName());
		System.out.println("Dept: " + super.getDept());
		System.out.println("Employee ID: " + super.getId());
		System.out.println("Title: " + title);
	}
	
}
