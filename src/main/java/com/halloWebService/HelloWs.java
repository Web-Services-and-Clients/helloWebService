package com.halloWebService;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import org.apache.cxf.feature.Features;

@WebService
@Features(features = "org.apache.cxf.feature.LoggingFeature")
public class HelloWs {

	@WebMethod
	public String hello() {
		return "yebo gogo response";
	}

}