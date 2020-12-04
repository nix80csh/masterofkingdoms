package com.mok.entity;
// Generated 2015. 12. 2 ���� 3:14:23 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * EnemyUnitBranch generated by hbm2java
 */
@Entity
@Table(name = "EnemyUnit_Branch", schema = "dbo", catalog = "MOK")
public class EnemyUnitBranch implements java.io.Serializable {

	private EnemyUnitBranchId id;
	private Branch branch;
	private EnemyUnit enemyUnit;
	private int quantity;
	private Date regDate;

	public EnemyUnitBranch() {
	}

	public EnemyUnitBranch(EnemyUnitBranchId id, Branch branch, EnemyUnit enemyUnit, int quantity, Date regDate) {
		this.id = id;
		this.branch = branch;
		this.enemyUnit = enemyUnit;
		this.quantity = quantity;
		this.regDate = regDate;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idfEnemyUnit", column = @Column(name = "IDF_EnemyUnit", nullable = false) ),
			@AttributeOverride(name = "idfEnemyUnitBranch", column = @Column(name = "IDF_EnemyUnit_Branch", nullable = false) ) })
	public EnemyUnitBranchId getId() {
		return this.id;
	}

	public void setId(EnemyUnitBranchId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDF_Branch", nullable = false)
	public Branch getBranch() {
		return this.branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDF_EnemyUnit", nullable = false, insertable = false, updatable = false)
	public EnemyUnit getEnemyUnit() {
		return this.enemyUnit;
	}

	public void setEnemyUnit(EnemyUnit enemyUnit) {
		this.enemyUnit = enemyUnit;
	}

	@Column(name = "Quantity", nullable = false)
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
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
