/**
 * 
 */
package tutorial.gel;

import java.util.ArrayList;
/**
 * @author peter liu
 *
 */
public class Company {
	private ArrayList <Employee> list;
	private String companyName;
	
	public Company(String name){ 
		companyName = name;
	    list = new ArrayList <Employee> ();
	 }
	
	public String toString() {
		
		String s="";
		for (Employee e:list )
			s += e;
		return s;
	}

}
