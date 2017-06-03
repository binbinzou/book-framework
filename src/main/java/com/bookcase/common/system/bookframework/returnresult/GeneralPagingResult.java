package com.bookcase.common.system.bookframework.returnresult;

import lombok.Data;

import com.bookcase.common.system.bookframework.page.PageInfo;
@Data
public class GeneralPagingResult<T> {

	private int code;
	private String message;
	private PageInfo pageInfo;
	private T content;
	
}
