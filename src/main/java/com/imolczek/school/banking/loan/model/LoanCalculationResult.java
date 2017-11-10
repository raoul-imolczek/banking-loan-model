package com.imolczek.school.banking.loan.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Fabian Bouché
 * A loan calculation result provides the amortization schedule as well as the APR
 */
@XmlRootElement
public class LoanCalculationResult {
	
	/**
	 * The amortizationSchedule of the loan
	 */
	private AmortizationSchedule amortizationSchedule = new AmortizationSchedule();
	
	/**
	 * The APR of the loan
	 */
	private BigDecimal apr;
	
	/**
	 * The sum of the interests paid
	 */
	private BigDecimal totalInterestCost;

	/**
	 * @return the amortizationSchedule
	 */
	public AmortizationSchedule getAmortizationSchedule() {
		return amortizationSchedule;
	}

	/**
	 * @param amortizationSchedule the amortizationSchedule to set
	 */
	public void setAmortizationSchedule(AmortizationSchedule amortizationSchedule) {
		this.amortizationSchedule = amortizationSchedule;
	}

	/**
	 * @return the totalInterestCost
	 */
	public BigDecimal getTotalInterestCost() {
		return totalInterestCost;
	}

	/**
	 * @param totalInterestCost the totalInterestCost to set
	 */
	public void setTotalInterestCost(BigDecimal totalInterestCost) {
		this.totalInterestCost = totalInterestCost;
	}

	/**
	 * @return the apr
	 */
	public BigDecimal getApr() {
		return apr;
	}

	/**
	 * @param apr the apr to set
	 */
	public void setApr(BigDecimal apr) {
		this.apr = apr;
	}

	public void calculateTotalInterest() {
	}

}
