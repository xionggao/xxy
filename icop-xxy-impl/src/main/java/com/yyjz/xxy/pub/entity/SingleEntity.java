package com.yyjz.xxy.pub.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 单实体基类
 * 
 * @author xg
 * @date 2018-08-21
 */
@MappedSuperclass
public abstract class SingleEntity extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2302222846044725341L;

	/**
	 * 主键
	 */
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	@Column(unique = true, nullable = false, updatable = false, length = 32)
	private String id;

	/**
	 * 创建人
	 */
	@CreatedBy
	@Column(updatable = false)
	private String creator;

	/**
	 * 创建时间
	 */
	@CreatedDate
	@Column(updatable = false)
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;

	/**
	 * 最后修改人
	 */
	@LastModifiedBy
	@Column(updatable = false)
	private String modifier;

	/**
	 * 最后修改时间
	 */
	@LastModifiedDate
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(updatable = false)
	private Date modifyDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getModifier() {
		return modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
}
