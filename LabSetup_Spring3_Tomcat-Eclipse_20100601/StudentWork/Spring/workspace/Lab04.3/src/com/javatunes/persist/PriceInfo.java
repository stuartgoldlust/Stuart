package com.javatunes.persist;

import java.io.Serializable;
import java.math.BigDecimal;

public class PriceInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private BigDecimal listPrice;
	private BigDecimal yourPrice;
	
	// Default constructor is required for an Entity or Embeddable class
	public PriceInfo() {}
	
	public PriceInfo(BigDecimal listPrice, BigDecimal yourPrice) {
		this.listPrice = listPrice;
		this.yourPrice = yourPrice;
	}
		
	
	public BigDecimal getListPrice() {
		return listPrice;
	}
	public void setListPrice(BigDecimal listPrice) {
		this.listPrice = listPrice;
	}
	public BigDecimal getYourPrice() {
		return yourPrice;
	}
	public void setYourPrice(BigDecimal yourPrice) {
		this.yourPrice = yourPrice;
	}

	public String toString() {
		return "listprice= " + getListPrice() +  " yourPrice= " + getYourPrice();
	}

}
