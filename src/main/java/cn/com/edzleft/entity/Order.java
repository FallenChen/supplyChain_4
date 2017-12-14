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
     * 采购方企业名称
     * @return
     */
    private String procurementEntName;

    /**
     * 贸易方企业名称
     * @return
     */
    private String tradeEntName;
    /**
     * 合同名称
     */
    private String contractName;

    /**
     * 合同编号
     * @return
     */
    private String contractNumber;

    /**
     * 货运单位名称
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
    
    
    public String getContractnumber() {
		return contractnumber;
	}
    

	public void setContractnumber(String contractnumber) {
		this.contractnumber = contractnumber;
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

	public Integer getLetterStatus() {
        return letterStatus;
    }

    public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public Integer getCreditGetId() {
        return creditGetId;
    }

    public String getEntname() {
		return entname;
	}

	public void setEntname(String entname) {
		this.entname = entname;
	}

	public void setCreditGetId(Integer creditGetId) {
        this.creditGetId = creditGetId;
    }

    public void setCreditUseId(Integer creditUseId) {
        this.creditUseId = creditUseId;
    }

    public void setCreditGrantorId(Integer creditGrantorId) {
        this.creditGrantorId = creditGrantorId;
    }

    public void setPaymentAccountId(Integer paymentAccountId) {
        this.paymentAccountId = paymentAccountId;
    }

    public Integer getFreightNumberId() {
        return freightNumberId;
    }

    public String getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(String invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public String getApplicationletter() {
        return applicationletter;
    }

    public void setApplicationletter(String applicationletter) {
        this.applicationletter = applicationletter;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

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
        this.orderNumber = orderNumber == null ? null : orderNumber.trim();
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
        this.orderCreatorId = orderCreatorId == null ? null : orderCreatorId;
    }

    public Integer getOrderCreatorTradeId() {
        return orderCreatorTradeId;
    }

    public void setOrderCreatorTradeId(Integer orderCreatorTradeId) {
        this.orderCreatorTradeId = orderCreatorTradeId == null ? null : orderCreatorTradeId;
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
        this.receivingAddressId = receivingAddressId == null ? null : receivingAddressId;
    }

    public String getLogisticsName() {
        return logisticsName;
    }

    public void setLogisticsName(String logisticsName) {
        this.logisticsName = logisticsName == null ? null : logisticsName;
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

    public Integer getCreditGet() {
        return creditGetId;
    }

    public Integer getCreditUseId() {
        return creditUseId;
    }


    public Integer getCreditGrantorId() {
        return creditGrantorId;
    }

    public void setCreditGrantor(Integer creditGrantor) {
        this.creditGrantorId = creditGrantorId == null ? null : creditGrantorId;
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

    public void setPaymentAccount(String paymentAccount) {
        this.paymentAccountId = paymentAccountId == null ? null : paymentAccountId;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

	public String getFreightUnit() {
        return freightUnit;
    }


    public Integer getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(Integer invoiceId) {
		this.invoiceId = invoiceId;
	}

	public void setFreightUnit(String freightUnit) {
        this.freightUnit = freightUnit;
    }

    public Integer getFreightNumber() {
        return freightNumberId;
    }

    public void setFreightNumberId(Integer freightNumberId) {
        this.freightNumberId = freightNumberId;
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



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (aa == null) {
			if (other.aa != null)
				return false;
		} else if (!aa.equals(other.aa))
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		if (amountActuallyPaid == null) {
			if (other.amountActuallyPaid != null)
				return false;
		} else if (!amountActuallyPaid.equals(other.amountActuallyPaid))
			return false;
		if (amountPayable == null) {
			if (other.amountPayable != null)
				return false;
		} else if (!amountPayable.equals(other.amountPayable))
			return false;
		if (applicationletter == null) {
			if (other.applicationletter != null)
				return false;
		} else if (!applicationletter.equals(other.applicationletter))
			return false;
		if (area == null) {
			if (other.area != null)
				return false;
		} else if (!area.equals(other.area))
			return false;
		if (cName == null) {
			if (other.cName != null)
				return false;
		} else if (!cName.equals(other.cName))
			return false;
		if (centName == null) {
			if (other.centName != null)
				return false;
		} else if (!centName.equals(other.centName))
			return false;
		if (contactPhone == null) {
			if (other.contactPhone != null)
				return false;
		} else if (!contactPhone.equals(other.contactPhone))
			return false;
		if (contractName == null) {
			if (other.contractName != null)
				return false;
		} else if (!contractName.equals(other.contractName))
			return false;
		if (contractNumber == null) {
			if (other.contractNumber != null)
				return false;
		} else if (!contractNumber.equals(other.contractNumber))
			return false;
		if (contractnumber == null) {
			if (other.contractnumber != null)
				return false;
		} else if (!contractnumber.equals(other.contractnumber))
			return false;
		if (creditGetId == null) {
			if (other.creditGetId != null)
				return false;
		} else if (!creditGetId.equals(other.creditGetId))
			return false;
		if (creditGrantorId == null) {
			if (other.creditGrantorId != null)
				return false;
		} else if (!creditGrantorId.equals(other.creditGrantorId))
			return false;
		if (creditUseId == null) {
			if (other.creditUseId != null)
				return false;
		} else if (!creditUseId.equals(other.creditUseId))
			return false;
		if (entname == null) {
			if (other.entname != null)
				return false;
		} else if (!entname.equals(other.entname))
			return false;
		if (fName == null) {
			if (other.fName != null)
				return false;
		} else if (!fName.equals(other.fName))
			return false;
		if (freightName == null) {
			if (other.freightName != null)
				return false;
		} else if (!freightName.equals(other.freightName))
			return false;
		if (freightNumberId == null) {
			if (other.freightNumberId != null)
				return false;
		} else if (!freightNumberId.equals(other.freightNumberId))
			return false;
		if (freightUnit == null) {
			if (other.freightUnit != null)
				return false;
		} else if (!freightUnit.equals(other.freightUnit))
			return false;
		if (goods == null) {
			if (other.goods != null)
				return false;
		} else if (!goods.equals(other.goods))
			return false;
		if (invoiceId == null) {
			if (other.invoiceId != null)
				return false;
		} else if (!invoiceId.equals(other.invoiceId))
			return false;
		if (invoiceNo == null) {
			if (other.invoiceNo != null)
				return false;
		} else if (!invoiceNo.equals(other.invoiceNo))
			return false;
		if (invoiceNum == null) {
			if (other.invoiceNum != null)
				return false;
		} else if (!invoiceNum.equals(other.invoiceNum))
			return false;
		if (letterStatus == null) {
			if (other.letterStatus != null)
				return false;
		} else if (!letterStatus.equals(other.letterStatus))
			return false;
		if (logisticsName == null) {
			if (other.logisticsName != null)
				return false;
		} else if (!logisticsName.equals(other.logisticsName))
			return false;
		if (orderAmount == null) {
			if (other.orderAmount != null)
				return false;
		} else if (!orderAmount.equals(other.orderAmount))
			return false;
		if (orderConfirmationTime == null) {
			if (other.orderConfirmationTime != null)
				return false;
		} else if (!orderConfirmationTime.equals(other.orderConfirmationTime))
			return false;
		if (orderCreatTime == null) {
			if (other.orderCreatTime != null)
				return false;
		} else if (!orderCreatTime.equals(other.orderCreatTime))
			return false;
		if (orderCreatorId == null) {
			if (other.orderCreatorId != null)
				return false;
		} else if (!orderCreatorId.equals(other.orderCreatorId))
			return false;
		if (orderCreatorTradeId == null) {
			if (other.orderCreatorTradeId != null)
				return false;
		} else if (!orderCreatorTradeId.equals(other.orderCreatorTradeId))
			return false;
		if (orderCreatorUserId == null) {
			if (other.orderCreatorUserId != null)
				return false;
		} else if (!orderCreatorUserId.equals(other.orderCreatorUserId))
			return false;
		if (orderCreatorUserid == null) {
			if (other.orderCreatorUserid != null)
				return false;
		} else if (!orderCreatorUserid.equals(other.orderCreatorUserid))
			return false;
		if (orderId == null) {
			if (other.orderId != null)
				return false;
		} else if (!orderId.equals(other.orderId))
			return false;
		if (orderNumber == null) {
			if (other.orderNumber != null)
				return false;
		} else if (!orderNumber.equals(other.orderNumber))
			return false;
		if (orderStatus == null) {
			if (other.orderStatus != null)
				return false;
		} else if (!orderStatus.equals(other.orderStatus))
			return false;
		if (paymentAccountId == null) {
			if (other.paymentAccountId != null)
				return false;
		} else if (!paymentAccountId.equals(other.paymentAccountId))
			return false;
		if (paymentTime == null) {
			if (other.paymentTime != null)
				return false;
		} else if (!paymentTime.equals(other.paymentTime))
			return false;
		if (person == null) {
			if (other.person != null)
				return false;
		} else if (!person.equals(other.person))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (principalOrderId == null) {
			if (other.principalOrderId != null)
				return false;
		} else if (!principalOrderId.equals(other.principalOrderId))
			return false;
		if (procurementEntName == null) {
			if (other.procurementEntName != null)
				return false;
		} else if (!procurementEntName.equals(other.procurementEntName))
			return false;
		if (receivingAddressId == null) {
			if (other.receivingAddressId != null)
				return false;
		} else if (!receivingAddressId.equals(other.receivingAddressId))
			return false;
		if (tradeEntName == null) {
			if (other.tradeEntName != null)
				return false;
		} else if (!tradeEntName.equals(other.tradeEntName))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aa == null) ? 0 : aa.hashCode());
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result + ((amountActuallyPaid == null) ? 0 : amountActuallyPaid.hashCode());
		result = prime * result + ((amountPayable == null) ? 0 : amountPayable.hashCode());
		result = prime * result + ((applicationletter == null) ? 0 : applicationletter.hashCode());
		result = prime * result + ((area == null) ? 0 : area.hashCode());
		result = prime * result + ((cName == null) ? 0 : cName.hashCode());
		result = prime * result + ((centName == null) ? 0 : centName.hashCode());
		result = prime * result + ((contactPhone == null) ? 0 : contactPhone.hashCode());
		result = prime * result + ((contractName == null) ? 0 : contractName.hashCode());
		result = prime * result + ((contractNumber == null) ? 0 : contractNumber.hashCode());
		result = prime * result + ((contractnumber == null) ? 0 : contractnumber.hashCode());
		result = prime * result + ((creditGetId == null) ? 0 : creditGetId.hashCode());
		result = prime * result + ((creditGrantorId == null) ? 0 : creditGrantorId.hashCode());
		result = prime * result + ((creditUseId == null) ? 0 : creditUseId.hashCode());
		result = prime * result + ((entname == null) ? 0 : entname.hashCode());
		result = prime * result + ((fName == null) ? 0 : fName.hashCode());
		result = prime * result + ((freightName == null) ? 0 : freightName.hashCode());
		result = prime * result + ((freightNumberId == null) ? 0 : freightNumberId.hashCode());
		result = prime * result + ((freightUnit == null) ? 0 : freightUnit.hashCode());
		result = prime * result + ((goods == null) ? 0 : goods.hashCode());
		result = prime * result + ((invoiceId == null) ? 0 : invoiceId.hashCode());
		result = prime * result + ((invoiceNo == null) ? 0 : invoiceNo.hashCode());
		result = prime * result + ((invoiceNum == null) ? 0 : invoiceNum.hashCode());
		result = prime * result + ((letterStatus == null) ? 0 : letterStatus.hashCode());
		result = prime * result + ((logisticsName == null) ? 0 : logisticsName.hashCode());
		result = prime * result + ((orderAmount == null) ? 0 : orderAmount.hashCode());
		result = prime * result + ((orderConfirmationTime == null) ? 0 : orderConfirmationTime.hashCode());
		result = prime * result + ((orderCreatTime == null) ? 0 : orderCreatTime.hashCode());
		result = prime * result + ((orderCreatorId == null) ? 0 : orderCreatorId.hashCode());
		result = prime * result + ((orderCreatorTradeId == null) ? 0 : orderCreatorTradeId.hashCode());
		result = prime * result + ((orderCreatorUserId == null) ? 0 : orderCreatorUserId.hashCode());
		result = prime * result + ((orderCreatorUserid == null) ? 0 : orderCreatorUserid.hashCode());
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		result = prime * result + ((orderNumber == null) ? 0 : orderNumber.hashCode());
		result = prime * result + ((orderStatus == null) ? 0 : orderStatus.hashCode());
		result = prime * result + ((paymentAccountId == null) ? 0 : paymentAccountId.hashCode());
		result = prime * result + ((paymentTime == null) ? 0 : paymentTime.hashCode());
		result = prime * result + ((person == null) ? 0 : person.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((principalOrderId == null) ? 0 : principalOrderId.hashCode());
		result = prime * result + ((procurementEntName == null) ? 0 : procurementEntName.hashCode());
		result = prime * result + ((receivingAddressId == null) ? 0 : receivingAddressId.hashCode());
		result = prime * result + ((tradeEntName == null) ? 0 : tradeEntName.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

    @Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderNumber=" + orderNumber + ", orderCreatTime=" + orderCreatTime
				+ ", orderCreatorId=" + orderCreatorId + ", orderCreatorTradeId=" + orderCreatorTradeId
				+ ", orderConfirmationTime=" + orderConfirmationTime + ", orderStatus=" + orderStatus
				+ ", receivingAddressId=" + receivingAddressId + ", logisticsName=" + logisticsName + ", contactPhone="
				+ contactPhone + ", principalOrderId=" + principalOrderId + ", creditGetId=" + creditGetId
				+ ", creditUseId=" + creditUseId + ", creditGrantorId=" + creditGrantorId + ", orderAmount="
				+ orderAmount + ", amountPayable=" + amountPayable + ", amountActuallyPaid=" + amountActuallyPaid
				+ ", paymentAccountId=" + paymentAccountId + ", paymentTime=" + paymentTime + ", invoiceId=" + invoiceId
				+ ", freightUnit=" + freightUnit + ", freightNumberId=" + freightNumberId + ", goods=" + goods
				+ ", applicationletter=" + applicationletter + ", invoiceNum=" + invoiceNum + ", letterStatus="
				+ letterStatus + ", orderCreatorUserid=" + orderCreatorUserid + ", centName=" + centName + ", fName="
				+ fName + ", cName=" + cName + ", entname=" + entname + ", username=" + username + ", invoiceNo="
				+ invoiceNo + ", aa=" + aa + ", address=" + address + ", area=" + area + ", person=" + person
				+ ", phone=" + phone + ", procurementEntName=" + procurementEntName + ", tradeEntName=" + tradeEntName
				+ ", contractName=" + contractName + ", contractNumber=" + contractNumber + ", freightName="
				+ freightName + ", orderCreatorUserId=" + orderCreatorUserId + ", amount=" + amount
				+ ", contractnumber=" + contractnumber + "]";
	}
}