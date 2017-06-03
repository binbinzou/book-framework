package com.bookcase.common.system.bookframework.returnresult;

import lombok.Data;

@Data
public class GeneralContentResult<T> {

	private int code;
	private String message;
	private T content;
	
}
