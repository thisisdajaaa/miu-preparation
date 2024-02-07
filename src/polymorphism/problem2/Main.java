package polymorphism.problem2;

import java.util.*;
public class Main {

	/** Combines the lists that are populated here into a single list
	 *  and passes to computeSumOfSalaries
	 */
	public static void main(String[] args) {
		List<Staff> staff = new ArrayList<>();
		staff.add(new Staff("John", 110000, 2));
		staff.add(new Staff("Tom", 110000, 4));
		staff.add(new Staff("Edward", 120000, 1));    
		staff.add(new Staff("Rich",90000, 3));
		staff.add(new Staff("Kevin", 100000,1));

		List<Teacher> teachers = new ArrayList<>();
		teachers.add(new Teacher("Andrew", 110000, 10000));
		teachers.add(new Teacher("Rabelais", 130000, 5500));
		teachers.add(new Teacher("Phil", 135000, 12000));
		teachers.add(new Teacher("Tony",95000, 8000));    
		
		    
		//Implementati  on steps
		//Step 1: imple  ment the c o mbine method, to combine the two lists
		List<EmployeeData> combined = combine(staff, teachers);

		 System.out.println(Statistics.computeSumOfSalaries(combined));
		
	}
	
	//IMPLEMENT
	public static List<EmployeeData> combine(List<Staff> staff, List<Teacher> teachers) {
		List<EmployeeData> employees = new ArrayList<EmployeeData>();
		employees.addAll(staff);
		employees.addAll(teachers);

		return employees;
	}

}
