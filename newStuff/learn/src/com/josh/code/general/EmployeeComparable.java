/**
 * 
 */
package com.josh.code.general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * @author munish
 *
 */
public class EmployeeComparable implements Comparable<EmployeeComparable> {
	
	
	int empId;
	
	String empName;
	
	String empAddress;
	
	

	/*
	public Employee(int empId,String empName,String empAddress){
		this.empId = empId;
		this.empName=empName;
		this.empAddress=empAddress;
	}
	*/
	
	
	

	public EmployeeComparable() {
	}




	public EmployeeComparable(int empId, String empName, String empAddress) {
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
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeComparable other = (EmployeeComparable) obj;
		if (empAddress == null) {
			if (other.empAddress != null)
				return false;
		} else if (!empAddress.equals(other.empAddress))
			return false;
		if (empId != other.empId)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		return true;
	}

	@Override
	public int compareTo(EmployeeComparable o) {
		 final int BEFORE = -1;
		 final int EQUAL = 0;
		 final int AFTER = 1;
		 int comparison = 0;
		
		if(this==o){
			return EQUAL;
		}
		if(o!=null){
			if(this.empId < o.empId){comparison= BEFORE;}
			else if(this.empId>o.empId){comparison= AFTER;}
			else{
				comparison=EQUAL;
			}
			
		}
		
		
		return comparison;
	}

	
	
	private void printEmployee(ArrayList<EmployeeComparable> emps) {

		if (null != emps) {
			for (Iterator iterator = emps.iterator(); iterator.hasNext();) {
				EmployeeComparable employee = (EmployeeComparable) iterator.next();

				System.out.println(employee.empId + "           " + employee.empName + "          " + employee.empAddress);

			}
		}

	}
	
	
	public static void main(String[] args) {
		
		ArrayList<EmployeeComparable> accts = new ArrayList<EmployeeComparable>();
		
		EmployeeComparable emp1 = new EmployeeComparable(5, "  Munish 1","234 zxv aa");
		EmployeeComparable emp2 = new EmployeeComparable(2, "  Munish 2","234 dfgh aa");
		EmployeeComparable emp3 = new EmployeeComparable(7, "  Munish 3","asdf 234 aa");
		EmployeeComparable emp4 = new EmployeeComparable(10, " Munish 4","asdf jjjj aa");
		
		
		
		accts.add(emp1);
		accts.add(emp2);
		accts.add(emp3);
		accts.add(emp4);
		
		EmployeeComparable emp = new EmployeeComparable();
		
		System.out.println(" ********  Before sorting  ********  ");
		
		emp.printEmployee(accts);
		
		Collections.sort(accts);
		
		System.out.println(" ********  After sorting  ********  ");
		emp.printEmployee(accts);
		
		
		
	}
	
	

}
