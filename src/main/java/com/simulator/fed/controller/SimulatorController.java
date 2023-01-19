package com.simulator.fed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simulator.fed.dtos.PaymentRequest;
import com.simulator.fed.dtos.PaymentResponse;
import com.simulator.fed.service.IPaymentService;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping(consumes = "application/xml", produces = "application/xml")
@Log4j2
public class SimulatorController {

	@Autowired
	IPaymentService paymentService;
	
	
	@PostMapping(value = "sendpayment")
	public PaymentResponse sendPayment(@RequestBody PaymentRequest request) {
		log.info("Payment Request:{}",request);
		return paymentService.sendPayment(request);
	}

}
