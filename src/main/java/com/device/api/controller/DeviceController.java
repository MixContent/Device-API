package com.device.api.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.device.api.dto.DeviceResponse;
import com.device.api.dto.Failure;
import com.device.api.dto.InputRequest;
import com.device.api.dto.Response;
import com.device.api.dto.Success;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class DeviceController {
	/*
	 * Randomly m returning Response and one more thing we can't return both
	 * like success and failure it can be one cause if any service fail then
	 * only we should return Failure information else not required based on ur
	 * project add one if check or set the Failure status in catch block
	 */
	@RequestMapping(value = "/getDeviceStatus", method = RequestMethod.POST)
	public DeviceResponse getDeviceInfo(@RequestBody InputRequest inputRequest)
			throws JsonProcessingException {

		DeviceResponse deviceResponse = new DeviceResponse();
		Response response = new Response();
		Success success = new Success();
		Failure failure = new Failure();

		deviceResponse.setSignature("SIGNATURE");
		response.setStatus(true);
		success.setToken(UUID.randomUUID().toString());
		success.setUserId("USER8747");
		success.setUserStatus("ACTIVE");
		response.setSuccess(success);
		if (inputRequest.getDevice().getRequest().getSignature() == null) {
			failure.setErrorCode("ERROR361487");
			failure.setErrorDetails("Bad Signature value");
			response.setFailure(failure);
		}
		deviceResponse.setResponse(response);
		return deviceResponse;
	}
}
