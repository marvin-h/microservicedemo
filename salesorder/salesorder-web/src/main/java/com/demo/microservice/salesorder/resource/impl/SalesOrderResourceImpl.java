package com.demo.microservice.salesorder.resource.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.microservice.salesorder.resource.SalesOrderResource;
import com.demo.microservicedemo.salesorder.dto.SalesOrder;
import com.demo.microservicedemo.salesorder.service.SalesOrderService;

@Component
public class SalesOrderResourceImpl implements SalesOrderResource {
	@Autowired
	private SalesOrderService salesOrderService;
	
	@Override
	public SalesOrder getSalesOrder(Long id) {
		return salesOrderService.getSalesOrder(id);
	}
	
	@Override
	public SalesOrder createSalesOrder(SalesOrder salesOrder) {
		return salesOrderService.createSalesOrder(salesOrder);
	}
}
