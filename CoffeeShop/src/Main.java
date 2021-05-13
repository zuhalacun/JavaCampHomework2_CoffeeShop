import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		BaseCustomerManager customerManager= new NeroCustomerManager();
		customerManager.Save(new Customer("1",1,"Zuhal","Acun",LocalDate.of(1996, 06, 13)));
	

	}

}
