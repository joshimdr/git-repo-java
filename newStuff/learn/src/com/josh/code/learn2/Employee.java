/**
 * 
 */
package com.josh.code.learn2;

/**
 * @author munish
 *
 */
public class Employee {
	

	int empId;
	
	String empName;
	
	String empAddress;
	
	public Employee() {
	}




	public Employee(int empId, String empName, String empAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
	}




	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empAddress == null) ? 0 : empAddress.hashCode());
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		return result;
	}




	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		
		if(this==obj){
			return true;
		}
		if (!(obj instanceof Employee) ){
			return false;
			
		}
		Employee emp = (Employee)obj;
		
		return((emp.empId == this.empId) &&
				(emp.empName == this.empName) &&
				(emp.empAddress == this.empAddress));
		
	}
	
	
	
	
	

}
