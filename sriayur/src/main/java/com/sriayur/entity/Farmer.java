package com.sriayur.entity;
// Generated Sep 12, 2021, 9:12:12 PM by Hibernate Tools 5.4.30.Final

/**
 * Farmer generated by hbm2java
 */
public class Farmer implements java.io.Serializable {

	private int farmerId;
	private Farmer farmer;
	private String farmername;
	private String description;
	private int productId;
	private Farmer farmer;

	public Farmer() {
	}

	public Farmer(Farmer farmer, String farmername, String description, int productId) {
		this.farmer = farmer;
		this.farmername = farmername;
		this.description = description;
		this.productId = productId;
	}

	public Farmer(Farmer farmer, String farmername, String description, int productId, Farmer farmer) {
		this.farmer = farmer;
		this.farmername = farmername;
		this.description = description;
		this.productId = productId;
		this.farmer = farmer;
	}

	public int getFarmerId() {
		return this.farmerId;
	}

	public void setFarmerId(int farmerId) {
		this.farmerId = farmerId;
	}

	public Farmer getFarmer() {
		return this.farmer;
	}

	public void setFarmer(Farmer farmer) {
		this.farmer = farmer;
	}

	public String getFarmername() {
		return this.farmername;
	}

	public void setFarmername(String farmername) {
		this.farmername = farmername;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public Farmer getFarmer() {
		return this.farmer;
	}

	public void setFarmer(Farmer farmer) {
		this.farmer = farmer;
	}

}
