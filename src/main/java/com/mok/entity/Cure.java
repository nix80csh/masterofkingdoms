package com.mok.entity;
// Generated 2015. 12. 2 ���� 3:14:23 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Cure generated by hbm2java
 */
@Entity
@Table(name = "Cure", schema = "dbo", catalog = "MOK")
public class Cure implements java.io.Serializable {

	private int idfBranch;
	private Branch branch;
	private int cureTime;
	private int needFood;
	private int needWood;
	private int needStone;
	private int needGold;
	private Date regDate;

	public Cure() {
	}

	public Cure(Branch branch, int cureTime, int needFood, int needWood, int needStone, int needGold, Date regDate) {
		this.branch = branch;
		this.cureTime = cureTime;
		this.needFood = needFood;
		this.needWood = needWood;
		this.needStone = needStone;
		this.needGold = needGold;
		this.regDate = regDate;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "branch") )
	@Id
	@GeneratedValue(generator = "generator")

	@Column(name = "IDF_Branch", unique = true, nullable = false)
	public int getIdfBranch() {
		return this.idfBranch;
	}

	public void setIdfBranch(int idfBranch) {
		this.idfBranch = idfBranch;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Branch getBranch() {
		return this.branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	@Column(name = "CureTime", nullable = false)
	public int getCureTime() {
		return this.cureTime;
	}

	public void setCureTime(int cureTime) {
		this.cureTime = cureTime;
	}

	@Column(name = "NeedFood", nullable = false)
	public int getNeedFood() {
		return this.needFood;
	}

	public void setNeedFood(int needFood) {
		this.needFood = needFood;
	}

	@Column(name = "NeedWood", nullable = false)
	public int getNeedWood() {
		return this.needWood;
	}

	public void setNeedWood(int needWood) {
		this.needWood = needWood;
	}

	@Column(name = "NeedStone", nullable = false)
	public int getNeedStone() {
		return this.needStone;
	}

	public void setNeedStone(int needStone) {
		this.needStone = needStone;
	}

	@Column(name = "NeedGold", nullable = false)
	public int getNeedGold() {
		return this.needGold;
	}

	public void setNeedGold(int needGold) {
		this.needGold = needGold;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "RegDate", nullable = false, length = 23)
	public Date getRegDate() {
		return this.regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

}