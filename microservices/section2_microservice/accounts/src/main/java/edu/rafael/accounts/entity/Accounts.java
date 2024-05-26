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
	private int costumerId;
	
	// account number will be created manually. 
	@Id
	@Column(name = "account_number")
	private long accountNumber;
	
	@Column(name = "account_type")
	private String accountType;
	
	@Column(name = "branch_adressr")
	private String branchAddress;

}
