package edu.rafael.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseDto {

	// send to client if the operation is successful or not.

	private String statusCode; // code status inside response.

	private String statusMsg; // message status inside response.

}
