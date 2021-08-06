package com.techlab.model;


public class Customer{
	private int custId;
	private String custName;
	private String custEmail;
	private String facebookUsrName;
	private String slackUsrName;
	private int custMobileNo;
	
	public Customer(int custId, String custName, String custEmail, String facebookUsrName, String slackUsrName,
			int custMobileNo) {
		this.custId = custId;
		this.custName = custName;
		this.custEmail = custEmail;
		this.facebookUsrName = facebookUsrName;
		this.slackUsrName = slackUsrName;
		this.custMobileNo = custMobileNo;
	}

	public int getCustId() {
		return custId;
	}

	public String getCustName() {
		return custName;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public String getFacebookUsrName() {
		return facebookUsrName;
	}

	public String getSlackUsrName() {
		return slackUsrName;
	}

	public int getCustMobileNo() {
		return custMobileNo;
	}
}
