package com.demo.microservicedemo.salesorder.app;

import com.demo.microservicedemo.salesorder.dto.SalesOrder;
import com.demo.microservicedemo.salesorder.service.SalesOrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        SalesOrderService salesOrderService = context.getBean(SalesOrderService.class);
        SalesOrder salesOrder = new SalesOrder();
        salesOrder = salesOrderService.createSalesOrder(salesOrder);
        System.out.println(salesOrder);
    }
}
