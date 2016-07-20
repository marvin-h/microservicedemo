package com.demo.microservicedemo.salesorder.repository;

import com.demo.microservicedemo.salesorder.entity.SalesOrderEntity;
import org.springframework.data.repository.CrudRepository;

public interface SalesOrderRepository extends CrudRepository<SalesOrderEntity, Long> {
}
