package com.imolczek.school.banking.loan.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Fabian Bouché
 * A cash stream is a money stream associated with a date of execution
 */
public class CashStream {

	/**
	 * The amount of cash
	 * Positive amount is credit
	 * Negative amount is debit
	 */
	private BigDecimal amount;
	
	/**
	 * The date of the cash stream
	 */
	private LocalDate date;

	/**
	 * The amount of interest paid in this cash stream
	 */
	private BigDecimal interest;
	
	/**
	 * The amount of fees paid in this cash stream
	 */
	private BigDecimal fees;
	
	/**
	 * The cost of insurance paid in this cash stream
	 */
	private BigDecimal insuranceCost;
	
	/**
	 * The amount of principal repaid in this cash stream
	 */
	private BigDecimal principalRepaymentAmount;
	
	/**
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/**
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**
	 * @return the interest
	 */
	public BigDecimal getInterest() {
		return interest;
	}

	/**
	 * @param interest the interest to set
	 */
	public void setInterest(BigDecimal interest) {
		this.interest = interest;
	}

	/**
	 * @return the fees
	 */
	public BigDecimal getFees() {
		return fees;
	}

	/**
	 * @param fees the fees to set
	 */
	public void setFees(BigDecimal fees) {
		this.fees = fees;
	}

	/**
	 * @return the insuranceCost
	 */
	public BigDecimal getInsuranceCost() {
		return insuranceCost;
	}

	/**
	 * @param insuranceCost the insuranceCost to set
	 */
	public void setInsuranceCost(BigDecimal insuranceCost) {
		this.insuranceCost = insuranceCost;
	}

	/**
	 * @return the principalRepaymentAmount
	 */
	public BigDecimal getPrincipalRepaymentAmount() {
		return principalRepaymentAmount;
	}

	/**
	 * @param principalRepaymentAmount the principalRepaymentAmount to set
	 */
	public void setPrincipalRepaymentAmount(BigDecimal principalRepaymentAmount) {
		this.principalRepaymentAmount = principalRepaymentAmount;
	}
	
	
}
