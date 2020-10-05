package com.example.demo.business;

import com.example.demo.CrowdFundingApplyModel;
import com.example.demo.LoanApplyModel;

public interface JudgeRiskBusiness {

    String judgeLoanRisk(LoanApplyModel loanApplyModel);

    String judgeCrowdFundingRisk(CrowdFundingApplyModel crowdFundingApplyModel);
}
