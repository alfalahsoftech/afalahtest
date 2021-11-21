package com.alfalahsoftech.JDK8;

import java.math.BigDecimal;

class Invoice {

    String invoiceNo;
    BigDecimal price;
    BigDecimal qty;
    
	public Invoice(String string, BigDecimal valueOf, BigDecimal valueOf2) {
		this.invoiceNo = string;
		this.price = valueOf;
		this.qty = valueOf2;
	}
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public BigDecimal getQty() {
		return qty;
	}
	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}

    // getters, stters n constructor
    
    
}