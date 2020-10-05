package com.example.demo.controller;

import com.example.demo.LoanApplyModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RiskManagementController {

//    @Resource
//    private JudgeRiskBusiness judgeRiskBusiness;
//
//    /**
//     *  请求URL ：/demo/sys/riskManagementForLoan.json
//     *
//     *  字段       |字段类型       |字段说明
//     * ------------|-----------|-----------
//     * mac         |string        |客户端mac地址
//     * city       |string        |用户所在城市
//     * country       |string        |用户所在国家
//     * phone       |string        |客户端机型
//     * phoneNum       |string        |客户端手机号
//     * ip       |string        |客户端ip地址
//     * userId       |string        |用户id
//     * applyLoad       |string        |申请贷款额度
//     * repaymentTime       |string        |还款时间
//     *
//     *  响应报文
//     *
//     *  ```json
//     * {
//     *   "result": 0, //fail
//     *   "code": "200",
//     *   "msg": "SUCCESS"
//     * }
//     *
//     * {
//     *   "result": 1, //pass
//     *   "code": "200",
//     *   "msg": "SUCCESS"
//     * }
//     * ```
//     *
//     * @return
//     */
//    @RequestMapping("/sys/riskManagementForLoan.json")
//    public String judgeLoanRisk(LoanApplyModel loanApplyModel) {
//
//        return judgeRiskBusiness.judgeLoanRisk(loanApplyModel);
//    }

    @RequestMapping("/jenkinsTestWeb/sys/test.json")
    public String test(LoanApplyModel loanApplyModel) {

        return "hello world";
    }

//    /**
//     * 请求URL ：/demo/sys/riskManagementForCrowdFunding.json
//     *
//     *  字段       |字段类型       |字段说明
//     * ------------|-----------|-----------
//     * companyId       |string        |公司Id
//     * totalAmount       |string        |众筹总额
//     * interestRate       |string        |利率
//     *
//     * 响应报文：
//     *
//     * ```json
//     * {
//     *   "result": 0, //fail
//     *   "code": "200",
//     *   "msg": "SUCCESS"
//     * }
//     *
//     * {
//     *   "result": 1, //pass
//     *   "code": "200",
//     *   "msg": "SUCCESS"
//     * }
//     * ```
//     * @return
//     */
//    @RequestMapping("/sys/riskManagementForCrowdFunding.json")
//    public String judgeCrowdFundingRisk(CrowdFundingApplyModel crowdFundingApplyModel) {
//
//        return judgeRiskBusiness.judgeCrowdFundingRisk(crowdFundingApplyModel);
//    }
}
