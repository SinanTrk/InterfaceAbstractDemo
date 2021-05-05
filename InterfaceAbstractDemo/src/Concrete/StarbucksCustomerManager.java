package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;

import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
 ICustomerCheckService _customerCheckService;
 
 public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
	 _customerCheckService=customerCheckService;
 }
 
	 @Override
	public void save(Customer customer) {
		if (_customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		}
		else {System.out.println("gerçek bir kişi değil");
		}
		
		}
	}

	

	
	
	 
	 




