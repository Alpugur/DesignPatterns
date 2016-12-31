package org.patterndesign.srp;

public class CustomerDaoImpl implements CustomerDao {

	@Override
	public Customer create() {
		System.out.println("Create customer...");
		return null;
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Delete customer...");
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Update customer...");
	}

}
