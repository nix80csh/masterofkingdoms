package com.mok.entity;
// Generated 2015. 12. 2 ���� 3:14:23 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Research generated by hbm2java
 */
@Entity
@Table(name = "Research", schema = "dbo", catalog = "MOK")
public class Research implements java.io.Serializable {

	private int idfResearch;
	private Structure structure;
	private String name;
	private char type;
	private short level;
	private int researchTime;
	private int needFood;
	private int needWood;
	private int needStone;
	private int needGold;
	private short addCombatPower;
	private short addExp;
	private Date regDate;

	public Research() {
	}

	public Research(int idfResearch, Structure structure, String name, char type, short level, int researchTime,
			int needFood, int needWood, int needStone, int needGold, short addCombatPower, short addExp, Date regDate) {
		this.idfResearch = idfResearch;
		this.structure = structure;
		this.name = name;
		this.type = type;
		this.level = level;
		this.researchTime = researchTime;
		this.needFood = needFood;
		this.needWood = needWood;
		this.needStone = needStone;
		this.needGold = needGold;
		this.addCombatPower = addCombatPower;
		this.addExp = addExp;
		this.regDate = regDate;
	}

	@Id

	@Column(name = "IDF_Research", unique = true, nullable = false)
	public int getIdfResearch() {
		return this.idfResearch;
	}

	public void setIdfResearch(int idfResearch) {
		this.idfResearch = idfResearch;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDF_Structure", nullable = false)
	public Structure getStructure() {
		return this.structure;
	}

	public void setStructure(Structure structure) {
		this.structure = structure;
	}

	@Column(name = "Name", nullable = false, length = 30)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "Type", nullable = false, length = 1)
	public char getType() {
		return this.type;
	}

	public void setType(char type) {
		this.type = type;
	}

	@Column(name = "Level", nullable = false)
	public short getLevel() {
		return this.level;
	}

	public void setLevel(short level) {
		this.level = level;
	}

	@Column(name = "ResearchTime", nullable = false)
	public int getResearchTime() {
		return this.researchTime;
	}

	public void setResearchTime(int researchTime) {
		this.researchTime = researchTime;
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

	@Column(name = "AddCombatPower", nullable = false)
	public short getAddCombatPower() {
		return this.addCombatPower;
	}

	public void setAddCombatPower(short addCombatPower) {
		this.addCombatPower = addCombatPower;
	}

	@Column(name = "AddEXP", nullable = false)
	public short getAddExp() {
		return this.addExp;
	}

	public void setAddExp(short addExp) {
		this.addExp = addExp;
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