package com.mok.entity;
// Generated 2015. 12. 2 ���� 3:14:23 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Item generated by hbm2java
 */
@Entity
@Table(name = "Item", schema = "dbo", catalog = "MOK")
public class Item implements java.io.Serializable {

	private int idfItem;
	private String name;
	private String description;
	private int price;
	private char type;
	private boolean saleYn;
	private Date regDate;
	private Set<GiftSetItem> giftSetItems = new HashSet<GiftSetItem>(0);
	private Set<InvenItem> invenItems = new HashSet<InvenItem>(0);

	public Item() {
	}

	public Item(int idfItem, String name, String description, int price, char type, boolean saleYn, Date regDate) {
		this.idfItem = idfItem;
		this.name = name;
		this.description = description;
		this.price = price;
		this.type = type;
		this.saleYn = saleYn;
		this.regDate = regDate;
	}

	public Item(int idfItem, String name, String description, int price, char type, boolean saleYn, Date regDate,
			Set<GiftSetItem> giftSetItems, Set<InvenItem> invenItems) {
		this.idfItem = idfItem;
		this.name = name;
		this.description = description;
		this.price = price;
		this.type = type;
		this.saleYn = saleYn;
		this.regDate = regDate;
		this.giftSetItems = giftSetItems;
		this.invenItems = invenItems;
	}

	@Id

	@Column(name = "IDF_Item", unique = true, nullable = false)
	public int getIdfItem() {
		return this.idfItem;
	}

	public void setIdfItem(int idfItem) {
		this.idfItem = idfItem;
	}

	@Column(name = "Name", nullable = false, length = 30)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "Description", nullable = false, length = 200)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "Price", nullable = false)
	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Column(name = "Type", nullable = false, length = 1)
	public char getType() {
		return this.type;
	}

	public void setType(char type) {
		this.type = type;
	}

	@Column(name = "SaleYN", nullable = false)
	public boolean isSaleYn() {
		return this.saleYn;
	}

	public void setSaleYn(boolean saleYn) {
		this.saleYn = saleYn;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "RegDate", nullable = false, length = 23)
	public Date getRegDate() {
		return this.regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "item")
	public Set<GiftSetItem> getGiftSetItems() {
		return this.giftSetItems;
	}

	public void setGiftSetItems(Set<GiftSetItem> giftSetItems) {
		this.giftSetItems = giftSetItems;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "item")
	public Set<InvenItem> getInvenItems() {
		return this.invenItems;
	}

	public void setInvenItems(Set<InvenItem> invenItems) {
		this.invenItems = invenItems;
	}

}
