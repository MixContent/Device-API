package com.device.api.dto;

public class Response {
	private boolean status;
	private Success success;
	private Failure failure;

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Success getSuccess() {
		return success;
	}

	public void setSuccess(Success success) {
		this.success = success;
	}

	public Failure getFailure() {
		return failure;
	}

	public void setFailure(Failure failure) {
		this.failure = failure;
	}

}
