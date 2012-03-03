
package tutorial.gel;

/**
 * @author peter liu
 *
 */
public class Employee {

	/**
	 * @param args
	 */
	private String name;
	
	public Employee() { name = "Dr. Peter Liu"; }
	
	public String toString() { return "employee name" + name; }
	
	public String getName() { return name; }
	
	public void setName( String name) { this.name = name; }
	
	// the main method
	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println( emp );
		
		emp.setName( "Dr. Pepper" );
		System.out.println( emp.getName());
		
		emp.setName( "Mrs. Price" );
		String s = emp.getName();
		System.out.println( s );
		

	}

}
