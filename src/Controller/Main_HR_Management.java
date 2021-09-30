package Controller;
import java.util.Scanner;

import com.dao.Employee_implement;
import com.dao.employee_interface1;

import Module.Employee;

public class Main_HR_Management {

	  public static void main(String[] args) {
			Scanner scn= new Scanner(System.in);
			boolean flag = true;
			employee_interface1 emp = new Employee_implement();
			do {
				int choice = 0;
				System.out.println("1. add employee");
				System.out.println("2. delete employee");
				System.out.println("3. update details of employee");
				System.out.println("4. search employee by name,id,department");
				
				System.out.println("Enter your choice");
				choice=scn.nextInt();
				switch(choice) {
				case 1: 
				System.out.println("add Employee_id");
				int eid=scn.nextInt();
				System.out.println("Enter Employee Name");
				String name = scn.next();
				System.out.println("Enter Adress");
				String add = scn.next();
				System.out.println("Enter City");
				String city = scn.next();
				System.out.println("Enter Date of Birth");
				String bid = scn.next();
				System.out.println("Enter Department ID");
				int deptID = scn.nextInt();
				Employee e = new Employee(eid, name, deptID, add, city, bid);
				
				emp.add_employee(e);
				break;
				
				case 2:
					System.out.println("Enter ID of employee to delete");
					int eid1 = scn.nextInt();
					if(emp.deleteEmployee(eid1)) {
						System.out.println("Employee Deleted");
					}else {
						System.out.println("can't Delete Employee");
					}
					break;
				case 3:
					System.out.println("Enter ID of employee to Update");
					int eid2 = scn.nextInt();
					if(emp.deleteEmployee(eid2)) {
						System.out.println("Employee Updated");
					}else {
						System.out.println("can't Update Employee");
					}
					break;
				case 4:
					System.out.println("Enter ID of employee to Searched");
					int eid3 = scn.nextInt();
					if(emp.deleteEmployee(eid3)) {
						System.out.println("Employee Searched");
					}else {
						System.out.println("can't Searched Employee");
					}
					break;
				}
				}while(flag);
				
						
					
	}	
			
	}
	


