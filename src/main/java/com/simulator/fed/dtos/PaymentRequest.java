package com.simulator.fed.dtos;

import java.time.LocalDateTime;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@JacksonXmlRootElement(localName = "paymentrequest")
public class PaymentRequest {
	
    @JacksonXmlProperty(localName="msgId")
	private String msgId;

    @JacksonXmlProperty(localName="CreDtTm")
	private LocalDateTime creationDtTime;

    @JacksonXmlProperty(localName="NbOfTxs")
	private String noOfTransactions;
}
