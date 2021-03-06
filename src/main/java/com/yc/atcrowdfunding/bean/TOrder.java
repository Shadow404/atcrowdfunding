package com.yc.atcrowdfunding.bean;

public class TOrder {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.id
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.memberid
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    private Integer memberid;
    private TMember member;
    private TProject project;
    private TReturn ret;
    
    public TMember getMember() {
		return member;
	}

	public void setMember(TMember member) {
		this.member = member;
	}

	public TProject getProject() {
		return project;
	}

	public void setProject(TProject project) {
		this.project = project;
	}

	public TReturn getRet() {
		return ret;
	}

	public void setRet(TReturn ret) {
		this.ret = ret;
	}

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.projectid
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    private Integer projectid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.returnid
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    private Integer returnid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.ordernum
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    private String ordernum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.createdate
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    private String createdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.money
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    private Integer money;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.rtncount
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    private Integer rtncount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.status
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.address
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.invoice
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    private String invoice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.invoictitle
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    private String invoictitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order.remark
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.id
     *
     * @return the value of t_order.id
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.id
     *
     * @param id the value for t_order.id
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.memberid
     *
     * @return the value of t_order.memberid
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    public Integer getMemberid() {
        return memberid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.memberid
     *
     * @param memberid the value for t_order.memberid
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.projectid
     *
     * @return the value of t_order.projectid
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    public Integer getProjectid() {
        return projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.projectid
     *
     * @param projectid the value for t_order.projectid
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.returnid
     *
     * @return the value of t_order.returnid
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    public Integer getReturnid() {
        return returnid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.returnid
     *
     * @param returnid the value for t_order.returnid
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    public void setReturnid(Integer returnid) {
        this.returnid = returnid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.ordernum
     *
     * @return the value of t_order.ordernum
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    public String getOrdernum() {
        return ordernum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.ordernum
     *
     * @param ordernum the value for t_order.ordernum
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum == null ? null : ordernum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.createdate
     *
     * @return the value of t_order.createdate
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    public String getCreatedate() {
        return createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.createdate
     *
     * @param createdate the value for t_order.createdate
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    public void setCreatedate(String createdate) {
        this.createdate = createdate == null ? null : createdate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.money
     *
     * @return the value of t_order.money
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    public Integer getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.money
     *
     * @param money the value for t_order.money
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    public void setMoney(Integer money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.rtncount
     *
     * @return the value of t_order.rtncount
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    public Integer getRtncount() {
        return rtncount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.rtncount
     *
     * @param rtncount the value for t_order.rtncount
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    public void setRtncount(Integer rtncount) {
        this.rtncount = rtncount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.status
     *
     * @return the value of t_order.status
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.status
     *
     * @param status the value for t_order.status
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.address
     *
     * @return the value of t_order.address
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.address
     *
     * @param address the value for t_order.address
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.invoice
     *
     * @return the value of t_order.invoice
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    public String getInvoice() {
        return invoice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.invoice
     *
     * @param invoice the value for t_order.invoice
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    public void setInvoice(String invoice) {
        this.invoice = invoice == null ? null : invoice.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.invoictitle
     *
     * @return the value of t_order.invoictitle
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    public String getInvoictitle() {
        return invoictitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.invoictitle
     *
     * @param invoictitle the value for t_order.invoictitle
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    public void setInvoictitle(String invoictitle) {
        this.invoictitle = invoictitle == null ? null : invoictitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order.remark
     *
     * @return the value of t_order.remark
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order.remark
     *
     * @param remark the value for t_order.remark
     *
     * @mbggenerated Fri Aug 23 09:32:12 GMT+08:00 2019
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((invoictitle == null) ? 0 : invoictitle.hashCode());
		result = prime * result + ((remark == null) ? 0 : remark.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TOrder other = (TOrder) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (invoictitle == null) {
			if (other.invoictitle != null)
				return false;
		} else if (!invoictitle.equals(other.invoictitle))
			return false;
		if (remark == null) {
			if (other.remark != null)
				return false;
		} else if (!remark.equals(other.remark))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TOrder [id=" + id + ", memberid=" + memberid + ", member=" + member + ", project=" + project + ", ret="
				+ ret + ", projectid=" + projectid + ", returnid=" + returnid + ", ordernum=" + ordernum
				+ ", createdate=" + createdate + ", money=" + money + ", rtncount=" + rtncount + ", status=" + status
				+ ", address=" + address + ", invoice=" + invoice + ", invoictitle=" + invoictitle + ", remark="
				+ remark + "]";
	}

	
    
    
}