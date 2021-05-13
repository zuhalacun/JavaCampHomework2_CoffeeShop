package Concrete;
import Abstract.IPersonCheckService;
import Abstract.BaseCustomerManager;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
          

	IPersonCheckService personCheckService;
	
	public StarbucksCustomerManager(IPersonCheckService personCheckService) {
		super();
		this.personCheckService = personCheckService;
	}

	@Override

	public void Save(Customer customer) throws Exception {
		if(personCheckService.checkIfRealPerson(customer)) {
			super.Save(customer);
		}
		else {
			System.out.println("not a valid person");
		}
		
	} 
	
		
           
           
}
