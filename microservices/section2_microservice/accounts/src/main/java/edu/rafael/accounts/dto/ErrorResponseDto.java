package edu.rafael.accounts.dto;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
// class to return to the client all information about error.
public class ErrorResponseDto {

	private String apiPath; // what is the path that the client is trying to invoke.

	private HttpStatus errorCode; // send the error code which is the type HttStatus to client application sharing
									// the reason why the application failed.

	private String errorMessage;

	private LocalDate erroTime;

}
