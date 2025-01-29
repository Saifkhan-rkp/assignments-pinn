package com.pinnacle.student.dto;

public class StudentDTO {
	private long id;
	private double fees;
	private double feesPaid;
	private double feesBalance;
	public StudentDTO(long id, double fees, double feesPaid, double feesBalance) {
		this.id = id;
		this.fees = fees;
		this.feesPaid = feesPaid;
		this.feesBalance = feesBalance;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public double getFeesPaid() {
		return feesPaid;
	}
	public void setFeesPaid(double feesPaid) {
		this.feesPaid = feesPaid;
	}
	public double getFeesBalance() {
		return feesBalance;
	}
	public void setFeesBalance(double feesBalance) {
		this.feesBalance = feesBalance;
	}
	
}
