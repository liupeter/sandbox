
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
	
	public String getCompanyName() { return companyName; }
	
	public String toString() {
		
		String s="";
		for (Employee e:list )
			s += e;
		return s;
	}
	
	public boolean hire (Employee emp) { 
		list.add( emp );
	    return true;
	}
	
	public boolean layout( int m ){
		list.remove(m);
		return true;
	}
}
