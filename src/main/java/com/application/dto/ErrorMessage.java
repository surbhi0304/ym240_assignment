package com.application.dto;

import java.util.Date;

public class ErrorMessage {

	private String errorMessage;

	private String contactMail;

	private Date timeStamp;

	public String getErrorMessage() {

		return errorMessage;

	}

	public void setErrorMessage(String errorMessage) {

		this.errorMessage = errorMessage;

	}

	public String getContactMail() {

		return contactMail;

	}

	public void setContactMail(String contactMail) {

		this.contactMail = contactMail;

	}

	public Date getTimeStamp() {

		return timeStamp;

	}

	public void setTimeStamp(Date timeStamp) {

		this.timeStamp = timeStamp;

	}
}