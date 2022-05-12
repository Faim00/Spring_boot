package com.controller;

import com.dto.PatientDTO;
import com.service.IPatientService;
import com.vo.PatientVO;

public class MainController {

	 // has-a property 
	IPatientService serviceobj;
	//constructor object 
	public MainController(IPatientService serviceobj) {
		this.serviceobj = serviceobj;
	}
	
	
	 public String getConfirmation(PatientVO vo) throws Exception
	 {
		 //convert bo object's data to dto class object 
		 PatientDTO dto= new PatientDTO();
		 //set values to dto 
		 dto.setName(vo.getName());
		 dto.setAddress(vo.getAddress());
		 dto.setPerDayCharge(Double.parseDouble(vo.getPerDayCharge()));
		 dto.setTotalDay(Integer.parseInt(vo.getTotalDay()));
		 //send that object to dto class
		  String message= serviceobj.performOperation(dto);
		  //return message 
		  return message;
		 
	 }
	
}
