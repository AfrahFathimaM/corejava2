package Static;

public class Employee {
	static String companyName = "NSK";
	private String name;
	int id;
public Employee(String name,int id)
{
	super();
	this.name = name;
	this.id = id;
}
@Override
public String toString() {
	return "employee [name=" + name + ", id=" + id + "]";
}
}
