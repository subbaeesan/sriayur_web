package com.sriayur.entity;
// Generated Sep 12, 2021, 9:12:12 PM by Hibernate Tools 5.4.30.Final

/**
 * OrderDetailId generated by hbm2java
 */
public class OrderDetailId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer orderId;
	private Integer productId;
	private int quantity;
	private float subtotal;

	public OrderDetailId() {
	}

	public OrderDetailId(int quantity, float subtotal) {
		this.quantity = quantity;
		this.subtotal = subtotal;
	}

	public OrderDetailId(Integer orderId, Integer productId, int quantity, float subtotal) {
		this.orderId = orderId;
		this.productId = productId;
		this.quantity = quantity;
		this.subtotal = subtotal;
	}

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getSubtotal() {
		return this.subtotal;
	}

	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof OrderDetailId))
			return false;
		OrderDetailId castOther = (OrderDetailId) other;

		return ((this.getOrderId() == castOther.getOrderId()) || (this.getOrderId() != null
				&& castOther.getOrderId() != null && this.getOrderId().equals(castOther.getOrderId())))
				&& ((this.getProductId() == castOther.getProductId()) || (this.getProductId() != null
						&& castOther.getProductId() != null && this.getProductId().equals(castOther.getProductId())))
				&& (this.getQuantity() == castOther.getQuantity()) && (this.getSubtotal() == castOther.getSubtotal());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getOrderId() == null ? 0 : this.getOrderId().hashCode());
		result = 37 * result + (getProductId() == null ? 0 : this.getProductId().hashCode());
		result = 37 * result + this.getQuantity();
		result = 37 * result + (int) this.getSubtotal();
		return result;
	}

}
