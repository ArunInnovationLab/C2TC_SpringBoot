package com.tnsif.client.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
	
@Entity
public class Shop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer shopId;
	private String shopCategory;
	
	@OneToMany (mappedBy = "shop")
	private List<Employee> shopEmployee;
	private String shopName;
	private String category;
	private String shopStatus;
	
	@OneToOne
	private ShopOwner shopOwner;
	private String leaseStatus;
	
	@OneToMany(mappedBy = "shop")
	private List<Item> items;
	
	public Shop() {
		super();
	}

	public Shop(Integer shopId, String shopCategory, List<Employee> shopEmployee, String shopName, String category,
			String shopStatus, ShopOwner shopOwner, String leaseStatus, List<Item> items) {
		super();
		this.shopId = shopId;
		this.shopCategory = shopCategory;
		this.shopEmployee = shopEmployee;
		this.shopName = shopName;
		this.category = category;
		this.shopStatus = shopStatus;
		this.shopOwner = shopOwner;
		this.leaseStatus = leaseStatus;
		this.items = items;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	public String getShopCategory() {
		return shopCategory;
	}

	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}

	public List<Employee> getShopEmployee() {
		return shopEmployee;
	}

	public void setShopEmployee(List<Employee> shopEmployee) {
		this.shopEmployee = shopEmployee;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getShopStatus() {
		return shopStatus;
	}

	public void setShopStatus(String shopStatus) {
		this.shopStatus = shopStatus;
	}

	public ShopOwner getShopOwner() {
		return shopOwner;
	}

	public void setShopOwner(ShopOwner shopOwner) {
		this.shopOwner = shopOwner;
	}

	public String getLeaseStatus() {
		return leaseStatus;
	}

	public void setLeaseStatus(String leaseStatus) {
		this.leaseStatus = leaseStatus;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}


	
}
