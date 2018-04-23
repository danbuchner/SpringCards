package com.danilobuchner.cards.dto;

import java.io.Serializable;
import java.sql.Timestamp;

public class TransactionDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private long transactionId;

	private String creaditCard_number;
	private Timestamp dateTime;
	private String desc;
	private String type;
	private double amount;
	private String status;
	/**
	 * @return the transactionId
	 */
	public long getTransactionId() {
		return transactionId;
	}
	/**
	 * @param transactionId the transactionId to set
	 */
	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}
	/**
	 * @return the creaditCard_number
	 */
	public String getCreaditCard_number() {
		return creaditCard_number;
	}
	/**
	 * @param creaditCard_number the creaditCard_number to set
	 */
	public void setCreaditCard_number(String creaditCard_number) {
		this.creaditCard_number = creaditCard_number;
	}
	/**
	 * @return the dateTime
	 */
	public Timestamp getDateTime() {
		return dateTime;
	}
	/**
	 * @param dateTime the dateTime to set
	 */
	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
	}
	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}
	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
