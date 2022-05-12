package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.bo.PatientBO;

public class PatientDAOImpl implements IPatientDAO {
	private static final String INSERT_QUERY="INSERT INTO PATIENT (NAME,ADDRESS,PERDAY_CHARGE,TOTAL_DAY,BILL_AMT) VALUES (?,?,?,?,?)";
	//take the has-a property 
	DataSource ds;
	// take constructor 

	public PatientDAOImpl(DataSource ds) {
		this.ds = ds;
	}
	@Override
	public int insert(PatientBO bo) throws Exception {
		int count=0;
		// Establish the Connection 
		try(Connection con= ds.getConnection();
				  PreparedStatement ps= con.prepareStatement(INSERT_QUERY)) 
		{
		 if(ps!=null)
		 {
			 // set values to db column
			 ps.setString(1, bo.getName());
			 ps.setString(2, bo.getAddress());
			 ps.setDouble(3,bo.getPerDayCharge());
			 ps.setInt(4,bo.getTotalDay());
			 ps.setDouble(5,bo.getBillAmt());
			 // execute the query into database s/w
			 count = ps.executeUpdate();
		 }//if
		}//try
		catch(SQLException sql)
		{
			sql.printStackTrace();
			throw sql;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		return count;
	}
	
	

}
