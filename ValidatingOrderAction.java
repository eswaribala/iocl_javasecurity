package com.iocl.validators;

import com.opensymphony.xwork2.ActionSupport;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.*;

public class ValidatingOrderAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private double price;
	private int qty;
	private String email;
	private java.util.Date orderDate;
	private String pname;

	@RequiredStringValidator(message="Supply name")
	public String getPname() {return pname;}
	public void setPname(String pname) {this.pname = pname;}

	@DoubleRangeFieldValidator(type = ValidatorType.FIELD, minInclusive = "10",maxInclusive="5000", message = "price must be between ${minInclusive} and ${maxInclusive}, current value is ${price}.")
	public double getPrice() {return price;}
	public void setPrice(double price) {this.price = price;}
	@IntRangeFieldValidator(type = ValidatorType.FIELD, min = "1", max = "10", message = "qty must be between ${min} and ${max}, current value is ${qty}.")
	public int getQty() {return qty;}
	public void setQty(int qty) {this.qty = qty;}

	@EmailValidator(type = ValidatorType.SIMPLE, message = "You must enter a value for email.")
	public String getEmail() {return email;}
	public void setEmail(String email) {this.email = email;}

	@DateRangeFieldValidator(type = ValidatorType.SIMPLE, fieldName = "datefield", min = "01/01/2011", max = "01/01/2012", message = "orderDate must be between ${min} and ${max}, current value is ${orderDate}.")
	public java.util.Date getOrderDate() {return orderDate;}
	public void setOrderDate(java.util.Date orderDate) {this.orderDate = orderDate;}
	


}
