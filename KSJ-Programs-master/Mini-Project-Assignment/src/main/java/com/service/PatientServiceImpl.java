package com.service;

import com.bo.PatientBO;
import com.dao.IPatientDAO;
import com.dto.PatientDTO;

public class PatientServiceImpl implements IPatientService {

	 //has- a property 
	IPatientDAO daoobj;
	// constructor injection
	public PatientServiceImpl(IPatientDAO daoobj) {
		this.daoobj = daoobj;
	}
	@Override
	public String performOperation(PatientDTO dto) throws Exception {
		//perform b.operation 
		Double billAmt = dto.getPerDayCharge()* dto.getTotalDay();
		// create BO Class Object to Store persistable Data 
		PatientBO bo= new PatientBO();
		// set values to bo class
		bo.setName(dto.getName());
		bo.setAddress(dto.getAddress());
		bo.setPerDayCharge(dto.getPerDayCharge());
		bo.setTotalDay(dto.getTotalDay());
		bo.setBillAmt(billAmt);
		int result= daoobj.insert(bo);
		//use ternary operator
		 if(result==0)
			 return "Patient Record Not Saved and Unable To Calculate The Bill Amt";
		 else
			 return "Patient Record Is Saved Your Generated Total Bill Amount is "+billAmt;
	}
	
	
}
