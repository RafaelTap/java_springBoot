package edu.rafael.accounts.dto;

import lombok.Data;

@Data // this annotation include getters / setters, RequiredArgsConstructor, ToString,
		// EqualsAndHashCode and value. All are annotation.
/*
 * I didn't used this annotation inside Entity class, because i don't want to
 * generate hash code or equals code method for our entity class because sometimes it create
 * issues.
 */

public class AccountsDto {

	// we don't want to send the customerId to here, only accountNumber, accountType
	// and branchaAddress.

	private long accountNumber;

	private String accountType;

	private String branchAddress;

}
