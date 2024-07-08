package edu.rafael.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Accounts extends BaseEntity {

	@Column(name = "costumer_id")
	private long custumerId;
	
	// account number will be created manually. 
	@Id
	@Column(name = "account_number")
	private long accountNumber;
	
	@Column(name = "account_type")
	private String accountType;
	
	@Column(name = "branch_adressr")
	private String branchAddress;

	public long getCustumerId() {
		return custumerId;
	}

	public void setCustumerId(long costumerId) {
		this.custumerId = costumerId;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBranchAddress() {
		return branchAddress;
	}

	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}

	
}
