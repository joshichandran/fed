package com.simulator.fed.service;

import org.springframework.web.bind.annotation.RequestBody;

import com.simulator.fed.dtos.PaymentRequest;
import com.simulator.fed.dtos.PaymentResponse;

public interface IPaymentService {

	public PaymentResponse sendPayment(@RequestBody PaymentRequest request);
}
