
public class Employee extends Person{
	private String name;
	private String dept;
	private int id;
	
	public Employee(String newName, String newDept, int newId){
		super(newName);
		name = newName;
		dept = newDept;
		id = newId;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setDept(String newDept) {
		dept = newDept;
	}
	
	public void setId(int newId) {
		id = newId;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDept() {
		return dept;
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public void writeOutput() {
		System.out.println("Name: " + name);
		System.out.println("Dept: " + dept);
		System.out.println("Employee ID: " + id);
	}
	
}
