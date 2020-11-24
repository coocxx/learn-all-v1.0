package com.example.ddd.domain.dao;


import com.example.ddd.domain.entities.AttributeKvEntity_HI;
import com.sie.iot.common.model.dao.BaseCommonDAO_HI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("attributeKvDAO_HI")
public class AttributeKvDAO_HI extends BaseCommonDAO_HI<AttributeKvEntity_HI> {
	private static final Logger LOGGER = LoggerFactory.getLogger(AttributeKvDAO_HI.class);

	public AttributeKvDAO_HI() {
		super();
	}
}
