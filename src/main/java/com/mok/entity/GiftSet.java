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
 * GiftSet generated by hbm2java
 */
@Entity
@Table(name = "GiftSet", schema = "dbo", catalog = "MOK")
public class GiftSet implements java.io.Serializable {

	private int idfGiftSet;
	private String name;
	private Date regDate;
	private Set<GiftSetItem> giftSetItems = new HashSet<GiftSetItem>(0);
	private Set<Coupon> coupons = new HashSet<Coupon>(0);

	public GiftSet() {
	}

	public GiftSet(int idfGiftSet, String name, Date regDate) {
		this.idfGiftSet = idfGiftSet;
		this.name = name;
		this.regDate = regDate;
	}

	public GiftSet(int idfGiftSet, String name, Date regDate, Set<GiftSetItem> giftSetItems, Set<Coupon> coupons) {
		this.idfGiftSet = idfGiftSet;
		this.name = name;
		this.regDate = regDate;
		this.giftSetItems = giftSetItems;
		this.coupons = coupons;
	}

	@Id

	@Column(name = "IDF_GiftSet", unique = true, nullable = false)
	public int getIdfGiftSet() {
		return this.idfGiftSet;
	}

	public void setIdfGiftSet(int idfGiftSet) {
		this.idfGiftSet = idfGiftSet;
	}

	@Column(name = "Name", nullable = false, length = 30)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "RegDate", nullable = false, length = 23)
	public Date getRegDate() {
		return this.regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "giftSet")
	public Set<GiftSetItem> getGiftSetItems() {
		return this.giftSetItems;
	}

	public void setGiftSetItems(Set<GiftSetItem> giftSetItems) {
		this.giftSetItems = giftSetItems;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "giftSet")
	public Set<Coupon> getCoupons() {
		return this.coupons;
	}

	public void setCoupons(Set<Coupon> coupons) {
		this.coupons = coupons;
	}

}
