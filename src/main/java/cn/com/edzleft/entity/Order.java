package cn.com.edzleft.entity;

import com.alibaba.fastjson.annotation.JSONField;


import java.util.Date;

/**订单表
 * gyl_order
 */
public class Order {
    /**
     * 订单ID
     */
    private Integer orderId;
    /**
     * 订单编号
     */
    private String orderNumber;
    /**
     * 订单创建时间
     */
    private Date orderCreatTime;
    /**
     * 订单创建者（采方）
     */
    private Integer orderCreatorId;
    /**
     * 订单确认者（贸方）
     */
    private Integer orderCreatorTradeId;
    /**
     * 订单确认时间
     */
    @JSONField(format="yyyy-MM-dd")
    private Date orderConfirmationTime;
    /**
     * 订单状态
     */
    private Integer orderStatus;
    /**
     * 收货地址(关联到收货地址表)
     */
    private Integer receivingAddressId;
    /**
     * 收货联系人
     */
    private String logisticsName;
    /**
     * 收货联系人手机
     */
    private String contactPhone;
    /**
     * 订单所属主合同(关联到合同表)
     */
    private Integer principalOrderId;
    /**
     * 订单所获授信(关联到授信表)
     */
    private Integer creditGetId;
    /**
     * 订单所用授信(关联到用信表)
     */
    private Integer creditUseId;
    /**
     * 授信人(关联到基本资料表)
     */
    private Integer creditGrantorId;
    /**
     * 订单金额
     */
    private Double orderAmount;
    /**
     * 应付金额
     */
    private Double amountPayable;
    /**
     * 实付金额
     */
    private Integer amountActuallyPaid;
    /**
     * 支付账号(关联到三方账户表)
     */
    private Integer paymentAccountId;
    /**
     * 支付时间(关联到三方账户表)
     */
    @JSONField(format="yyyy-MM-dd")
    private Date paymentTime;
    /**
     * 发票表id
     */
    private Integer invoiceId;
    /**
     * 货运单位
     */
    private String freightUnit;
    /**
     * 货运单号
     */
    private Integer freightNumberId;
    /**
     * 货物商品
     */
    private String goods;
    /**
     * 申请用信
     * @return
     */

    private String applicationletter;
    /**
     * 发票编号
     * @return
     */
    private String invoiceNum;
    /**
     * 申请用信状态 0已提交 1拒绝 2同意
     */
    private Integer letterStatus;

    /**
     * 订单创建账号id
     * @return
     */
    public Integer orderCreatorUserid;


    //采购商公司别名
    private String centName;
    //货运别名
    private String fName;
    //合同别名
    private String cName;
    //贸易商公司别名
    private String entname;
    //订单创建者姓名
    private String username;
    //货运编号
    private String invoiceNo;
    //根据时间模糊查询条件
    private Integer aa;
    //收货地址
    private String address;
    //收货区域
    private String  area;
   // 收货人
    private String person;
    //收货人手机
    private String phone;
    //货运单位 发货人
    private String fperson;
    //发货人手机
    private String fphone;
    /**
     * 采购方企业名称 别名)
     * @return
     */
    private String procurementEntName;
    /**
     * 贸易方企业名称-别名
     * @return
     */
    private String tradeEntName;
    /**
     * 合同名称-别名
     */
    private String contractName;
    /**
     * 合同编号-别名
     * @return
     */
    private String contractNumber;
    /**
     * 货运单位名称-别名
     * @return
     */
    private String freightName;
    /**
     * 订单创建账号id
     * @return
     */
    public Integer orderCreatorUserId;
    /**
     * 发票数量
     */
    public Integer amount;
    /**
     * 合同编号
     * @return
     */

    private String contractnumber;


    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Date getOrderCreatTime() {
        return orderCreatTime;
    }

    public void setOrderCreatTime(Date orderCreatTime) {
        this.orderCreatTime = orderCreatTime;
    }

    public Integer getOrderCreatorId() {
        return orderCreatorId;
    }

    public void setOrderCreatorId(Integer orderCreatorId) {
        this.orderCreatorId = orderCreatorId;
    }

    public Integer getOrderCreatorTradeId() {
        return orderCreatorTradeId;
    }

    public void setOrderCreatorTradeId(Integer orderCreatorTradeId) {
        this.orderCreatorTradeId = orderCreatorTradeId;
    }

    public Date getOrderConfirmationTime() {
        return orderConfirmationTime;
    }

    public void setOrderConfirmationTime(Date orderConfirmationTime) {
        this.orderConfirmationTime = orderConfirmationTime;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getReceivingAddressId() {
        return receivingAddressId;
    }

    public void setReceivingAddressId(Integer receivingAddressId) {
        this.receivingAddressId = receivingAddressId;
    }

    public String getLogisticsName() {
        return logisticsName;
    }

    public void setLogisticsName(String logisticsName) {
        this.logisticsName = logisticsName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public Integer getPrincipalOrderId() {
        return principalOrderId;
    }

    public void setPrincipalOrderId(Integer principalOrderId) {
        this.principalOrderId = principalOrderId;
    }

    public Integer getCreditGetId() {
        return creditGetId;
    }

    public void setCreditGetId(Integer creditGetId) {
        this.creditGetId = creditGetId;
    }

    public Integer getCreditUseId() {
        return creditUseId;
    }

    public void setCreditUseId(Integer creditUseId) {
        this.creditUseId = creditUseId;
    }

    public Integer getCreditGrantorId() {
        return creditGrantorId;
    }

    public void setCreditGrantorId(Integer creditGrantorId) {
        this.creditGrantorId = creditGrantorId;
    }

    public Double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Double getAmountPayable() {
        return amountPayable;
    }

    public void setAmountPayable(Double amountPayable) {
        this.amountPayable = amountPayable;
    }

    public Integer getAmountActuallyPaid() {
        return amountActuallyPaid;
    }

    public void setAmountActuallyPaid(Integer amountActuallyPaid) {
        this.amountActuallyPaid = amountActuallyPaid;
    }

    public Integer getPaymentAccountId() {
        return paymentAccountId;
    }

    public void setPaymentAccountId(Integer paymentAccountId) {
        this.paymentAccountId = paymentAccountId;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getFreightUnit() {
        return freightUnit;
    }

    public void setFreightUnit(String freightUnit) {
        this.freightUnit = freightUnit;
    }

    public Integer getFreightNumberId() {
        return freightNumberId;
    }

    public void setFreightNumberId(Integer freightNumberId) {
        this.freightNumberId = freightNumberId;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public String getApplicationletter() {
        return applicationletter;
    }

    public void setApplicationletter(String applicationletter) {
        this.applicationletter = applicationletter;
    }

    public String getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(String invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public Integer getLetterStatus() {
        return letterStatus;
    }

    public void setLetterStatus(Integer letterStatus) {
        this.letterStatus = letterStatus;
    }

    public Integer getOrderCreatorUserid() {
        return orderCreatorUserid;
    }

    public void setOrderCreatorUserid(Integer orderCreatorUserid) {
        this.orderCreatorUserid = orderCreatorUserid;
    }

    public String getCentName() {
        return centName;
    }

    public void setCentName(String centName) {
        this.centName = centName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getEntname() {
        return entname;
    }

    public void setEntname(String entname) {
        this.entname = entname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public Integer getAa() {
        return aa;
    }

    public void setAa(Integer aa) {
        this.aa = aa;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFperson() {
        return fperson;
    }

    public void setFperson(String fperson) {
        this.fperson = fperson;
    }

    public String getFphone() {
        return fphone;
    }

    public void setFphone(String fphone) {
        this.fphone = fphone;
    }

    public String getProcurementEntName() {
        return procurementEntName;
    }

    public void setProcurementEntName(String procurementEntName) {
        this.procurementEntName = procurementEntName;
    }

    public String getTradeEntName() {
        return tradeEntName;
    }

    public void setTradeEntName(String tradeEntName) {
        this.tradeEntName = tradeEntName;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getFreightName() {
        return freightName;
    }

    public void setFreightName(String freightName) {
        this.freightName = freightName;
    }

    public Integer getOrderCreatorUserId() {
        return orderCreatorUserId;
    }

    public void setOrderCreatorUserId(Integer orderCreatorUserId) {
        this.orderCreatorUserId = orderCreatorUserId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getContractnumber() {
        return contractnumber;
    }

    public void setContractnumber(String contractnumber) {
        this.contractnumber = contractnumber;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderNumber='" + orderNumber + '\'' +
                ", orderCreatTime=" + orderCreatTime +
                ", orderCreatorId=" + orderCreatorId +
                ", orderCreatorTradeId=" + orderCreatorTradeId +
                ", orderConfirmationTime=" + orderConfirmationTime +
                ", orderStatus=" + orderStatus +
                ", receivingAddressId=" + receivingAddressId +
                ", logisticsName='" + logisticsName + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                ", principalOrderId=" + principalOrderId +
                ", creditGetId=" + creditGetId +
                ", creditUseId=" + creditUseId +
                ", creditGrantorId=" + creditGrantorId +
                ", orderAmount=" + orderAmount +
                ", amountPayable=" + amountPayable +
                ", amountActuallyPaid=" + amountActuallyPaid +
                ", paymentAccountId=" + paymentAccountId +
                ", paymentTime=" + paymentTime +
                ", invoiceId=" + invoiceId +
                ", freightUnit='" + freightUnit + '\'' +
                ", freightNumberId=" + freightNumberId +
                ", goods='" + goods + '\'' +
                ", applicationletter='" + applicationletter + '\'' +
                ", invoiceNum='" + invoiceNum + '\'' +
                ", letterStatus=" + letterStatus +
                ", orderCreatorUserid=" + orderCreatorUserid +
                ", centName='" + centName + '\'' +
                ", fName='" + fName + '\'' +
                ", cName='" + cName + '\'' +
                ", entname='" + entname + '\'' +
                ", username='" + username + '\'' +
                ", invoiceNo='" + invoiceNo + '\'' +
                ", aa=" + aa +
                ", address='" + address + '\'' +
                ", area='" + area + '\'' +
                ", person='" + person + '\'' +
                ", phone='" + phone + '\'' +
                ", fperson='" + fperson + '\'' +
                ", fphone='" + fphone + '\'' +
                ", procurementEntName='" + procurementEntName + '\'' +
                ", tradeEntName='" + tradeEntName + '\'' +
                ", contractName='" + contractName + '\'' +
                ", contractNumber='" + contractNumber + '\'' +
                ", freightName='" + freightName + '\'' +
                ", orderCreatorUserId=" + orderCreatorUserId +
                ", amount=" + amount +
                ", contractnumber='" + contractnumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (orderId != null ? !orderId.equals(order.orderId) : order.orderId != null) return false;
        if (orderNumber != null ? !orderNumber.equals(order.orderNumber) : order.orderNumber != null) return false;
        if (orderCreatTime != null ? !orderCreatTime.equals(order.orderCreatTime) : order.orderCreatTime != null)
            return false;
        if (orderCreatorId != null ? !orderCreatorId.equals(order.orderCreatorId) : order.orderCreatorId != null)
            return false;
        if (orderCreatorTradeId != null ? !orderCreatorTradeId.equals(order.orderCreatorTradeId) : order.orderCreatorTradeId != null)
            return false;
        if (orderConfirmationTime != null ? !orderConfirmationTime.equals(order.orderConfirmationTime) : order.orderConfirmationTime != null)
            return false;
        if (orderStatus != null ? !orderStatus.equals(order.orderStatus) : order.orderStatus != null) return false;
        if (receivingAddressId != null ? !receivingAddressId.equals(order.receivingAddressId) : order.receivingAddressId != null)
            return false;
        if (logisticsName != null ? !logisticsName.equals(order.logisticsName) : order.logisticsName != null)
            return false;
        if (contactPhone != null ? !contactPhone.equals(order.contactPhone) : order.contactPhone != null) return false;
        if (principalOrderId != null ? !principalOrderId.equals(order.principalOrderId) : order.principalOrderId != null)
            return false;
        if (creditGetId != null ? !creditGetId.equals(order.creditGetId) : order.creditGetId != null) return false;
        if (creditUseId != null ? !creditUseId.equals(order.creditUseId) : order.creditUseId != null) return false;
        if (creditGrantorId != null ? !creditGrantorId.equals(order.creditGrantorId) : order.creditGrantorId != null)
            return false;
        if (orderAmount != null ? !orderAmount.equals(order.orderAmount) : order.orderAmount != null) return false;
        if (amountPayable != null ? !amountPayable.equals(order.amountPayable) : order.amountPayable != null)
            return false;
        if (amountActuallyPaid != null ? !amountActuallyPaid.equals(order.amountActuallyPaid) : order.amountActuallyPaid != null)
            return false;
        if (paymentAccountId != null ? !paymentAccountId.equals(order.paymentAccountId) : order.paymentAccountId != null)
            return false;
        if (paymentTime != null ? !paymentTime.equals(order.paymentTime) : order.paymentTime != null) return false;
        if (invoiceId != null ? !invoiceId.equals(order.invoiceId) : order.invoiceId != null) return false;
        if (freightUnit != null ? !freightUnit.equals(order.freightUnit) : order.freightUnit != null) return false;
        if (freightNumberId != null ? !freightNumberId.equals(order.freightNumberId) : order.freightNumberId != null)
            return false;
        if (goods != null ? !goods.equals(order.goods) : order.goods != null) return false;
        if (applicationletter != null ? !applicationletter.equals(order.applicationletter) : order.applicationletter != null)
            return false;
        if (invoiceNum != null ? !invoiceNum.equals(order.invoiceNum) : order.invoiceNum != null) return false;
        if (letterStatus != null ? !letterStatus.equals(order.letterStatus) : order.letterStatus != null) return false;
        if (orderCreatorUserid != null ? !orderCreatorUserid.equals(order.orderCreatorUserid) : order.orderCreatorUserid != null)
            return false;
        if (centName != null ? !centName.equals(order.centName) : order.centName != null) return false;
        if (fName != null ? !fName.equals(order.fName) : order.fName != null) return false;
        if (cName != null ? !cName.equals(order.cName) : order.cName != null) return false;
        if (entname != null ? !entname.equals(order.entname) : order.entname != null) return false;
        if (username != null ? !username.equals(order.username) : order.username != null) return false;
        if (invoiceNo != null ? !invoiceNo.equals(order.invoiceNo) : order.invoiceNo != null) return false;
        if (aa != null ? !aa.equals(order.aa) : order.aa != null) return false;
        if (address != null ? !address.equals(order.address) : order.address != null) return false;
        if (area != null ? !area.equals(order.area) : order.area != null) return false;
        if (person != null ? !person.equals(order.person) : order.person != null) return false;
        if (phone != null ? !phone.equals(order.phone) : order.phone != null) return false;
        if (fperson != null ? !fperson.equals(order.fperson) : order.fperson != null) return false;
        if (fphone != null ? !fphone.equals(order.fphone) : order.fphone != null) return false;
        if (procurementEntName != null ? !procurementEntName.equals(order.procurementEntName) : order.procurementEntName != null)
            return false;
        if (tradeEntName != null ? !tradeEntName.equals(order.tradeEntName) : order.tradeEntName != null) return false;
        if (contractName != null ? !contractName.equals(order.contractName) : order.contractName != null) return false;
        if (contractNumber != null ? !contractNumber.equals(order.contractNumber) : order.contractNumber != null)
            return false;
        if (freightName != null ? !freightName.equals(order.freightName) : order.freightName != null) return false;
        if (orderCreatorUserId != null ? !orderCreatorUserId.equals(order.orderCreatorUserId) : order.orderCreatorUserId != null)
            return false;
        if (amount != null ? !amount.equals(order.amount) : order.amount != null) return false;
        return contractnumber != null ? contractnumber.equals(order.contractnumber) : order.contractnumber == null;
    }

    @Override
    public int hashCode() {
        int result = orderId != null ? orderId.hashCode() : 0;
        result = 31 * result + (orderNumber != null ? orderNumber.hashCode() : 0);
        result = 31 * result + (orderCreatTime != null ? orderCreatTime.hashCode() : 0);
        result = 31 * result + (orderCreatorId != null ? orderCreatorId.hashCode() : 0);
        result = 31 * result + (orderCreatorTradeId != null ? orderCreatorTradeId.hashCode() : 0);
        result = 31 * result + (orderConfirmationTime != null ? orderConfirmationTime.hashCode() : 0);
        result = 31 * result + (orderStatus != null ? orderStatus.hashCode() : 0);
        result = 31 * result + (receivingAddressId != null ? receivingAddressId.hashCode() : 0);
        result = 31 * result + (logisticsName != null ? logisticsName.hashCode() : 0);
        result = 31 * result + (contactPhone != null ? contactPhone.hashCode() : 0);
        result = 31 * result + (principalOrderId != null ? principalOrderId.hashCode() : 0);
        result = 31 * result + (creditGetId != null ? creditGetId.hashCode() : 0);
        result = 31 * result + (creditUseId != null ? creditUseId.hashCode() : 0);
        result = 31 * result + (creditGrantorId != null ? creditGrantorId.hashCode() : 0);
        result = 31 * result + (orderAmount != null ? orderAmount.hashCode() : 0);
        result = 31 * result + (amountPayable != null ? amountPayable.hashCode() : 0);
        result = 31 * result + (amountActuallyPaid != null ? amountActuallyPaid.hashCode() : 0);
        result = 31 * result + (paymentAccountId != null ? paymentAccountId.hashCode() : 0);
        result = 31 * result + (paymentTime != null ? paymentTime.hashCode() : 0);
        result = 31 * result + (invoiceId != null ? invoiceId.hashCode() : 0);
        result = 31 * result + (freightUnit != null ? freightUnit.hashCode() : 0);
        result = 31 * result + (freightNumberId != null ? freightNumberId.hashCode() : 0);
        result = 31 * result + (goods != null ? goods.hashCode() : 0);
        result = 31 * result + (applicationletter != null ? applicationletter.hashCode() : 0);
        result = 31 * result + (invoiceNum != null ? invoiceNum.hashCode() : 0);
        result = 31 * result + (letterStatus != null ? letterStatus.hashCode() : 0);
        result = 31 * result + (orderCreatorUserid != null ? orderCreatorUserid.hashCode() : 0);
        result = 31 * result + (centName != null ? centName.hashCode() : 0);
        result = 31 * result + (fName != null ? fName.hashCode() : 0);
        result = 31 * result + (cName != null ? cName.hashCode() : 0);
        result = 31 * result + (entname != null ? entname.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (invoiceNo != null ? invoiceNo.hashCode() : 0);
        result = 31 * result + (aa != null ? aa.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (area != null ? area.hashCode() : 0);
        result = 31 * result + (person != null ? person.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (fperson != null ? fperson.hashCode() : 0);
        result = 31 * result + (fphone != null ? fphone.hashCode() : 0);
        result = 31 * result + (procurementEntName != null ? procurementEntName.hashCode() : 0);
        result = 31 * result + (tradeEntName != null ? tradeEntName.hashCode() : 0);
        result = 31 * result + (contractName != null ? contractName.hashCode() : 0);
        result = 31 * result + (contractNumber != null ? contractNumber.hashCode() : 0);
        result = 31 * result + (freightName != null ? freightName.hashCode() : 0);
        result = 31 * result + (orderCreatorUserId != null ? orderCreatorUserId.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (contractnumber != null ? contractnumber.hashCode() : 0);
        return result;
    }
}