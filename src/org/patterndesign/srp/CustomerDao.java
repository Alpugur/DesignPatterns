package org.patterndesign.srp;

public interface CustomerDao {

	public Customer create();

	public void delete(Customer customer);

	public void update(Customer customer);
}
