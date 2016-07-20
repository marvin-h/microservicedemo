package com.demo.microservicedemo.salesorder.service;

import com.demo.microservicedemo.salesorder.dto.SalesOrder;

public interface SalesOrderService {
    SalesOrder getSalesOrder(Long id);
    SalesOrder createSalesOrder(SalesOrder salesOrder);
}
