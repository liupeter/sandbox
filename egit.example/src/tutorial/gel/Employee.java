/**
 * 
 */
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
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println( emp );

	}

}
