package com.imolczek.school.banking.loan.model;

import java.math.BigDecimal;
import java.time.LocalDate;

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
	
	
}
