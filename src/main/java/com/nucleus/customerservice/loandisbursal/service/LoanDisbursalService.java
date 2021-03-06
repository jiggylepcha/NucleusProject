package com.nucleus.customerservice.loandisbursal.service;

import com.nucleus.loanapplications.model.LoanApplications;

import java.util.List;

public interface LoanDisbursalService {
    /**
     * Get all Details of a Loan by loanApplicationNumber
     * @param loanApplicationNumber
     * @return Object of LoanApplications Class
     */
    public LoanApplications getLoanDetails(int loanApplicationNumber);

    /**
     * Get all Loans associated with a customer by customerCode
     * @param customerCode
     * @return List<LoanApplications> list contains all loans taken by this customer
     */
    public List<LoanApplications> getCustomerLoanDetails(String customerCode);
}
