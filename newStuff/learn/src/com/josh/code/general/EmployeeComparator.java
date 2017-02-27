/**
 * 
 */
package com.josh.code.general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * @author munish
 *
 */
public class EmployeeComparator implements Comparator<Employee> {
	
	
	
		private void printEmployee(ArrayList<Employee> emps) {

		if (null != emps) {
			for (Iterator iterator = emps.iterator(); iterator.hasNext();) {
				Employee employee = (Employee) iterator.next();

				System.out.println(employee.empId + "           " + employee.empName + "          " + employee.empAddress);

			}
		}

	}
		
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub

		int compare = 0;

		if (o1 == o2) {
			compare = 0;
		} else if (o1 != null && o2 != null) {
			if (o1.empId < o2.empId) {
				compare = -1;
			} else if (o1.empId > o2.empId) {
				compare = 1;
			} else {
				compare = 0;
			}
		}

		return compare;
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Employee> accts = new ArrayList<Employee>();
		
		Employee emp1 = new Employee(5, "  Munish 1","234 zxv aa");
		Employee emp2 = new Employee(2, "  Munish 2","234 dfgh aa");
		Employee emp3 = new Employee(7, "  Munish 3","asdf 234 aa");
		Employee emp4 = new Employee(10, " Munish 4","asdf jjjj aa");
		
		
		
		accts.add(emp1);
		accts.add(emp2);
		accts.add(emp3);
		accts.add(emp4);
		
		EmployeeComparator emp = new EmployeeComparator();
		
		System.out.println(" ********  Before sorting  ********  ");
		
		emp.printEmployee(accts);
		
		
		Collections.sort(accts, new EmployeeComparator() );
		
		System.out.println(" ********  After sorting  ********  ");
		emp.printEmployee(accts);
		
		
		
	}





}
