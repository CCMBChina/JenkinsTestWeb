##交易风控模块

- 目录
    - 需求说明
    - 实现逻辑说明
    - 接口说明

###1.需求说明
如文档描述，如下：
1. 使用设备采集的设备MAC、IP、IMEI、设备型号等信息，形成实时交易风控模型，对信贷或支付行为
实时决策拦截或是放行；
2. 交易风控系统记录企业众筹产品的总额与利率，并结合授信系统额度情况，计算众筹产品风险等级；
3. 交易风控系统记录个人用户的风险评估历史与授信情况，计算个人用户风险评估等级，并实时更新。

###2.实现逻辑说明
####2.1风控逻辑细分
需求拆解为三部分,如下：
1. 在用户支付众筹产品或者其他支付行为时触发，调用风控接口，风控模块结合移动端信息、支付金额、用户历史贷款记录等信息进行风险判断；
2. 在用户申请贷款时触发，调用风控接口，风控模块结合移动端信息、申请贷款金额及还款时间、用户历史贷款记录等信息进行风险判断；
3. 在公司申请发布众筹产品时触发，调用风控接口，风控模块结合公司历史众筹成功利率、众筹金额、众筹利率等信息进行风险判断。

####2.2与openbank接口交互
#####2.2.1支付

#####2.2.2贷款
>service类型:Credit-Card-Service <br>
API名称：creditcard_transaction-Credit-Card-Service-Simnectz_Bank<br>
API描述 ：The API is designed to retrieve a credit card transaction details.<br>
<br>
API名称：credit_card_controller-Creditcard-Service-CUHK<br>
API描述 ：APIs used in credit card account operation, such as account opening, status update, and approved limit update.<br>

>service类型:Deposit-Service <br>
API名称：customer_term_deposit_enquiry_presentation-Deposit-Service-CUHK<br>
API描述 ：APIs used in customer total term deposits enquiry service.<br>
<br>
API名称：account_details_enquiry_presentation-Deposit-Service-CUHK<br>
API描述 ：APIs used in account details enquiry service.<br>
<br>
API名称：transaction_log_enquiry_presentation-Deposit-Service-CUHK<br>
API描述 ：APIs used in transaction log enquiry service.<br>








###3.接口说明
####3.1贷款风控
#####3.1.1 请求接口
> 请求方式：POST<br>
请求URL ：/demo/sys/riskManagementForLoan.json

#####3.1.2 请求报文

字段       |字段类型       |字段说明
------------|-----------|-----------
mac         |string        |客户端mac地址
city       |string        |用户所在城市
country       |string        |用户所在国家
phone       |string        |客户端机型
phoneNum       |string        |客户端手机号
ip       |string        |客户端ip地址
userId       |string        |用户id
applyLoad       |string        |申请贷款额度
repaymentTime       |string        |还款时间

#####3.1.3 响应报文

```json 
{
  "result": 0, //fail
  "code": "200",
  "msg": "SUCCESS"
}

{
  "result": 1, //pass
  "code": "200",
  "msg": "SUCCESS"
}
```

####3.2众筹风控
#####3.2.1 请求接口
> 请求方式：POST<br>
请求URL ：/demo/sys/riskManagementForCrowdFunding.json

#####3.2.2 请求报文

字段       |字段类型       |字段说明
------------|-----------|-----------
companyId       |string        |公司Id
totalAmount       |string        |众筹总额
interestRate       |string        |利率

#####3.2.3 响应报文

```json 
{
  "result": 0, //fail
  "code": "200",
  "msg": "SUCCESS"
}

{
  "result": 1, //pass
  "code": "200",
  "msg": "SUCCESS"
}
```

####3.2 支付风控
#####3.2.1 请求接口
> 请求方式：POST<br>
请求URL ：/demo/sys/riskManagementForPay.json

#####3.2.2 请求报文

字段       |字段类型       |字段说明
------------|-----------|-----------
mac         |string        |客户端mac地址
city       |string        |用户所在城市
country       |string        |用户所在国家
phone       |string        |客户端机型
phoneNum       |string        |客户端手机号
ip       |string        |客户端ip地址
userId       |string        |用户id
paymentAmount       |string        |支付金额

#####3.2.3 响应报文

```json 
{
  "result": 0, //fail
  "code": "200",
  "msg": "SUCCESS"
}

{
  "result": 1, //pass
  "code": "200",
  "msg": "SUCCESS"
}
```





