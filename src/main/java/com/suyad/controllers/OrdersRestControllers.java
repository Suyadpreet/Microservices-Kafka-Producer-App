package com.suyad.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.suyad.constants.AppConstants;
import com.suyad.models.Orders;

@RestController
public class OrdersRestControllers 
{
	@Autowired
	private KafkaTemplate<String,Orders> kafkaTemplate;
	
	@PostMapping("/order")
	public String placeOrders(@RequestBody Orders orders)
	{
		kafkaTemplate.send(AppConstants.Topic, orders);
		return "Order Placed";
	}
}
