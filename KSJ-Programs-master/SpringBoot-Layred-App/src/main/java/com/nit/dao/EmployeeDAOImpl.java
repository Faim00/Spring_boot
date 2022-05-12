package com.nit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nit.model.Employee;

@Repository("empDao")
public class EmployeeDAOImpl implements IEmployeeDAO {
	public static final String GET_EMPS="SELECT EMPNO, ENAME,JOB,SAL FROM EMP WHERE JOB IN(?,?,?) ORDER BY EMPNO";
	@Autowired
	private DataSource ds;
	boolean flag=true;
	
	public List<Employee> getEmpsByDesg(String desg1, String desg2, String desg3) throws Exception
	{
		List<Employee> listemps=null;
//		get pooled jdbc connection
		try(Connection con= ds.getConnection();
			  PreparedStatement ps= con.prepareStatement(GET_EMPS);) //try with resource
		{
//			Set Query Parameters
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);
//			execute the Query 
			try(ResultSet rs= ps.executeQuery())
			{
//				Copy result set object record to list collection as employee class objects
				listemps =new ArrayList<Employee>();
				while(rs.next())
				{
					flag=false;
					Employee emp= new Employee();
					emp.setEmpno(rs.getInt(1));
					emp.setEname(rs.getString(2));
					emp.setJob(rs.getString(3));
					emp.setSal(rs.getFloat(4));
					listemps.add(emp);
					
				}//while
				
			}//try-2
		}//try-1
		catch(SQLException sql)
		{
			sql.printStackTrace();   //exception rethrowing
		}
		catch(Exception e)
		{
			e.printStackTrace(); //exception rethrowing
		}
		return listemps;
	} //method
	

}//class
