package com.mywallet.exceptions;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor

@ToString
public class ErrorDetails {

//	public ErrorDetails(LocalDateTime now, String message2, String description2) {
//		// TODO Auto-generated constructor stub
//	}

//	public ErrorDetails(LocalDateTime now, String message2, String description2) {
//		// TODO Auto-generated constructor stub
//	}

	private LocalDateTime timeStamp;
		
	private String message ;
		
	private String description;

	
}
