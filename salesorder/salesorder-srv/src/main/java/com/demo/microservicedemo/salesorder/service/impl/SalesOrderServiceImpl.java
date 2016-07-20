package com.demo.microservicedemo.salesorder.service.impl;

import com.demo.microservicedemo.salesorder.dto.SalesOrder;
import com.demo.microservicedemo.salesorder.entity.SalesOrderEntity;
import com.demo.microservicedemo.salesorder.repository.SalesOrderRepository;
import com.demo.microservicedemo.salesorder.service.SalesOrderService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalesOrderServiceImpl implements SalesOrderService {
    @Autowired
    private SalesOrderRepository salesOrderRepository;

    @Override
    public SalesOrder getSalesOrder(Long id) {
        SalesOrderEntity salesOrderEntity = salesOrderRepository.findOne(id);
        if(salesOrderEntity == null) {
            return null;
        }

        SalesOrder salesOrder = new SalesOrder();
        BeanUtils.copyProperties(salesOrderEntity, salesOrder);
        return salesOrder;
    }

    @Override
    public SalesOrder createSalesOrder(SalesOrder salesOrder) {
        if(salesOrder == null) {
            return null;
        }

        SalesOrderEntity salesOrderEntity = new SalesOrderEntity();
        BeanUtils.copyProperties(salesOrder, salesOrderEntity);
        salesOrderEntity.setId(null);
        salesOrderEntity = salesOrderRepository.save(salesOrderEntity);
        BeanUtils.copyProperties(salesOrderEntity, salesOrder);
        return  salesOrder;
    }
}
