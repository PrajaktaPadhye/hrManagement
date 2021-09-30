package com.dao;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Configuration.DB_Connector;
import Module.Employee;

public class Employee_implement implements employee_interface1 {

	@Override
	public void add_employee(Employee e) {
		try (Connection con = DB_Connector.connect();
				PreparedStatement preparedStatement = con.prepareStatement(
						"insert into" + " employee(eid,ename,empaddress,city,dob,did)values(?,?,?,?,?,?)");) {
			preparedStatement.setInt(1, e.getEmpid());
			preparedStatement.setString(2, e.getEmpname());
			preparedStatement.setString(3, e.getEmpaddress());
			preparedStatement.setString(4, e.getCity());
			preparedStatement.setString(5, e.getDob());
			preparedStatement.setInt(6, e.getDid());

			int i = preparedStatement.executeUpdate();
			if (i > 0) {
				System.out.println("Employee Added");
			}
		} catch (Exception e2) {
			System.out.println(e2);
		}
	}

	@Override
	public boolean deleteEmployee(int eid1) {
		try(Connection con = DB_Connector.connect();
				PreparedStatement pst = con.prepareStatement("delete from employee where eid=?;")){
			pst.setInt(1, eid1);
			int i = pst.executeUpdate();
			if(i>0) {
				System.out.println("Employee Delete");
			return true;
			}else {
				return false;
			}
			
			}catch(Exception e) {
				System.out.println(e);
			}
		return false;
	}

	


public boolean updateEmployee(int eid2) {
	// TODO Auto-generated method stub
	
		
	
	return false;
}


	
}

	
			
		
	
