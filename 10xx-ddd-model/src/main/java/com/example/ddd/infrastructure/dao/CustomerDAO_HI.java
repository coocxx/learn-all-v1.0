package com.example.ddd.infrastructure.dao;

import com.example.ddd.infrastructure.entities.CustomerEntity_HI;
import com.sie.iot.common.model.dao.BaseCommonDAO_HI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("customerDAO_HI")
public class CustomerDAO_HI extends BaseCommonDAO_HI<CustomerEntity_HI> {
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerDAO_HI.class);

	public CustomerDAO_HI() {
		super();
	}

}