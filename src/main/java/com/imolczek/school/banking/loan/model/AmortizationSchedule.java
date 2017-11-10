package com.imolczek.school.banking.loan.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Fabian Bouché
 * An amortization schedule provides the list of the cash stream events for the reimbursement of a loan
 */
public class AmortizationSchedule {

	/**
	 * The list of cash streams
	 */
	private List<CashStream> cashStreamList = new ArrayList<CashStream>();

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
