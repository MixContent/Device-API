package com.device.api.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPOJOBuilder
@JsonPropertyOrder(value = { "device", "" })
public class InputRequest {
	@JsonProperty("device")
	private Device device;

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

}
