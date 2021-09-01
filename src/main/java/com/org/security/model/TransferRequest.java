package com.org.security.model;

import java.math.BigDecimal;

public class TransferRequest {
	
	private int id;
	private int recepientAccNo;
	private int originAccNo;
	private BigDecimal amount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public int getRecepientAccNo() {
		return recepientAccNo;
	}
	public void setRecepientAccNo(int recepientAccNo) {
		this.recepientAccNo = recepientAccNo;
	}
	public int getOriginAccNo() {
		return originAccNo;
	}
	public void setOriginAccNo(int originAccNo) {
		this.originAccNo = originAccNo;
	}
	public TransferRequest(int id, int recepientAccNo, int originAccNo, BigDecimal amount) {
		super();
		this.id = id;
		this.recepientAccNo = recepientAccNo;
		this.originAccNo = originAccNo;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "TransferRequest [id=" + id + ", recepientAccNo=" + recepientAccNo + ", originAccNo=" + originAccNo
				+ ", amount=" + amount + "]";
	}
	public TransferRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	}
	
	


