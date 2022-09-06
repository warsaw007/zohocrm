package com.zohocrm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Billing;
import com.zohocrm.repositories.BillingRepository;
@Service
public class BillingServiceImpl implements BillingService {
	@Autowired
	private BillingRepository billingRepo;

	@Override
	public void generateOneBill(Billing bill) {
        billingRepo.save(bill);
	}

	@Override
	public List<Billing> findAllBills() {
		List<Billing>bills=billingRepo.findAll();
		return bills;
	}

}
