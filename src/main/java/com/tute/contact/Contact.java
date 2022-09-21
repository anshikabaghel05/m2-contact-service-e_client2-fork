package com.tute.contact;

import org.springframework.stereotype.Component;

/**
 * @author Lenovo
 *
 */
@Component
public class Contact {
	private Long cId;
	private String contactName;
	private String email;
	private Long userId;
	
	public Contact() {
		super();
	}

	public Contact(Long cId, String contactName, String email, Long userId) {
		super();
		this.cId = cId;
		this.contactName = contactName;
		this.email = email;
		this.userId = userId;
	}

	/**
	 * @return the cId
	 */
	public Long getcId() {
		return cId;
	}

	/**
	 * @return the contactName
	 */
	public String getContactName() {
		return contactName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * @param cId the cId to set
	 */
	public void setcId(Long cId) {
		this.cId = cId;
	}

	/**
	 * @param contactName the contactName to set
	 */
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
}
