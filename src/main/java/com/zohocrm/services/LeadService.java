package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entities.Lead;

public interface LeadService {

	public void saveLead(Lead lead);
           //26/04/22
	public List<Lead> findAllLeads();
	
	//27/04/22
	public Lead getLead(long id);
	
	public void deleteLead(long id);
}
