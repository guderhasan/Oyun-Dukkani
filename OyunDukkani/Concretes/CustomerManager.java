
public class CustomerManager implements ICustomerManager{
private ICustomerCheckService customerCheckService;
	public CustomerManager(ICustomerCheckService customerCheckService) {
	super();
	this.customerCheckService = customerCheckService;
}

	@Override
	public void add(Customer customer) {
		// TODO Auto-generated method stub
		if(this.customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println(customer.getFirstName()+" eklendi");
		}
		else {
			Exception e=new Exception();
			System.out.println(e.getMessage()+" Böyle bir kiþi bulunamadý");
		}
		
	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println(customer.getFirstName()+" silindi");
	}

	@Override
	public void upDate(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println(customer.getFirstName()+" güncellendi");
	}

	
	
}
