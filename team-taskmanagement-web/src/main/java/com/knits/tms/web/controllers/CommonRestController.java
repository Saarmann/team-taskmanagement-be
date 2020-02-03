package com.knits.tms.web.controllers;

import com.knits.tms.exceptions.ServiceException;
import com.knits.tms.exceptions.UserException;
import com.knits.tms.web.beans.ResponseBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Slf4j
public class CommonRestController {

	
	@ExceptionHandler(ServiceException.class)
	@ResponseBody
	public ResponseBean handleServiceException(ServiceException ex) {
		log.error(ex.getMessage(),ex);		
		return createResponseForSysException(ex.getCode());	
	}

	@ExceptionHandler(UserException.class)
	@ResponseBody
	public ResponseBean handleUserException(UserException ex) {		
		log.error(ex.getMessage(),ex);		
		return new ResponseBean<>(ex.getMessage(),false,null);		
	}
	
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public ResponseBean handleAllException(Exception ex) {		
		log.error(ex.getMessage(),ex);		
		return createResponseForSysException(ex.getMessage());		
	}
	
	private ResponseBean createResponseForSysException(Object data){
		ResponseBean response = new ResponseBean<>("Impossible to complete operation. Please try again after a while");		
		response.setOk(false);	
		response.setData(data);
		return response;
	}
}
