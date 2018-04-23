package com.danilobuchner.cards.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transactions")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long transact_id;

	private String transact_cc_number;
	private String transact_date_time;
	private String transact_desc;
	private String transact_type;
	private double transact_amount;
	private String transact_status;
	/**
	 * @return the transact_id
	 */
	public long getTransact_id() {
		return transact_id;
	}
	/**
	 * @param transact_id the transact_id to set
	 */
	public void setTransact_id(long transact_id) {
		this.transact_id = transact_id;
	}
	/**
	 * @return the transact_cc_number
	 */
	public String getTransact_cc_number() {
		return transact_cc_number;
	}
	/**
	 * @param transact_cc_number the transact_cc_number to set
	 */
	public void setTransact_cc_number(String transact_cc_number) {
		this.transact_cc_number = transact_cc_number;
	}
	/**
	 * @return the transact_date_time
	 */
	public String getTransact_date_time() {
		return transact_date_time;
	}
	/**
	 * @param transact_date_time the transact_date_time to set
	 */
	public void setTransact_date_time(String transact_date_time) {
		this.transact_date_time = transact_date_time;
	}
	/**
	 * @return the transact_desc
	 */
	public String getTransact_desc() {
		return transact_desc;
	}
	/**
	 * @param transact_desc the transact_desc to set
	 */
	public void setTransact_desc(String transact_desc) {
		this.transact_desc = transact_desc;
	}
	/**
	 * @return the transact_type
	 */
	public String getTransact_type() {
		return transact_type;
	}
	/**
	 * @param transact_type the transact_type to set
	 */
	public void setTransact_type(String transact_type) {
		this.transact_type = transact_type;
	}
	/**
	 * @return the transact_amount
	 */
	public double getTransact_amount() {
		return transact_amount;
	}
	/**
	 * @param transact_amount the transact_amount to set
	 */
	public void setTransact_amount(double transact_amount) {
		this.transact_amount = transact_amount;
	}
	/**
	 * @return the transact_status
	 */
	public String getTransact_status() {
		return transact_status;
	}
	/**
	 * @param transact_status the transact_status to set
	 */
	public void setTransact_status(String transact_status) {
		this.transact_status = transact_status;
	}
	
	

	

}
