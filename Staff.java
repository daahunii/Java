
public class Staff extends Employee{
	private int payGrade;
	
	public Staff(String newName, String newDept, int newId, int newPayGrade) {
		super(newName, newDept, newId);
		super.setName(newName);
		super.setDept(newDept);
		super.setId(newId);
		payGrade = newPayGrade;
	}
	
	@Override
	public void writeOutput() {
		System.out.println("Name: " + super.getName());
		System.out.println("Dept: " + super.getDept());
		System.out.println("Employee ID: " + super.getId());
		System.out.println("Pay Grade: " + payGrade);
	}
}
