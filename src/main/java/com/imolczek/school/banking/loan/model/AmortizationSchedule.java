package com.imolczek.school.banking.loan.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Fabian Bouché
 * An amortization schedule provides the list of the cash stream events for the reimbursement of a loan
 */
public class AmortizationSchedule {

	/**
	 * The list of cash streams
	 */
	private List<CashStream> cashStreamList;

	/**
	 * @return the cashStreamList
	 */
	public List<CashStream> getCashStreamList() {
		return cashStreamList;
	}

	/**
	 * @param cashStreamList the cashStreamList to set
	 */
	public void setCashStreamList(List<CashStream> cashStreamList) {
		this.cashStreamList = cashStreamList;
	}
	
	public AmortizationSchedule() {
		cashStreamList = new ArrayList<CashStream>();
	}
}
