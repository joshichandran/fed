package com.simulator.fed.service.impl;

import org.springframework.stereotype.Service;

import com.simulator.fed.dtos.PaymentRequest;
import com.simulator.fed.dtos.PaymentResponse;
import com.simulator.fed.service.IPaymentService;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class PaymentServiceImpl implements IPaymentService {

	@Override
	public PaymentResponse sendPayment(PaymentRequest request) {
		PaymentResponse response = new PaymentResponse();
		response.setMsgId("2");
		log.info("Payment Response : {}",response);
		return response;
	}

}
