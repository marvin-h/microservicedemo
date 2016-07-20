package com.demo.microservice.salesorder.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.demo.microservicedemo.salesorder.dto.SalesOrder;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Path("/SalesOrder")
@Produces("application/json")
@Consumes("application/json")
@Api("SalesOrder")
public interface SalesOrderResource {
	@GET
	@Path("/{id}")
	@ApiOperation(
			value = "get sales order by id",
			notes = "get sales order by id",
			response = SalesOrder.class)
	SalesOrder getSalesOrder(@ApiParam(value = "id", required = true) Long id);
	
	@POST
	@Path("/")
	@ApiOperation(
			value = "create an sales order",
			notes = "create an sales order",
			response = SalesOrder.class)	
	SalesOrder createSalesOrder(@ApiParam(value = "sales order", required = true) SalesOrder salesOrder);
}
