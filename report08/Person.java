
public class Person {
	private String name;
	
	public Person(String newName){
		name = newName;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public String getName() {
		return name;
	}
	
	public void writeOutput() {
		System.out.println("Name: " + name);
	}
	
	public boolean hasSameName(Person otherPerson) {
		if(name == otherPerson.getName()) return true;
		else return false;
	}
}
