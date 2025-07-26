package com.devcrush.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PAYMENT")
public class PayAmount {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "Card_No")
	private String cardNo;
	@Column(name = "Bill_Amount")
	private String bill;
	public PayAmount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PayAmount(int id, String cardNo, String bill) {
		super();
		this.id = id;
		this.cardNo = cardNo;
		this.bill = bill;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getBill() {
		return bill;
	}
	public void setBill(String bill) {
		this.bill = bill;
	}
	@Override
	public String toString() {
		return "PayAmount [id=" + id + ", cardNo=" + cardNo + ", bill=" + bill + "]";
	}
	
	
}
