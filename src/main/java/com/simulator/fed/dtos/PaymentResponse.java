package com.simulator.fed.dtos;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@JacksonXmlRootElement(localName = "paymentresponse")
public class PaymentResponse {

    @JacksonXmlProperty(localName="MsgId")
	private String msgId;

}
