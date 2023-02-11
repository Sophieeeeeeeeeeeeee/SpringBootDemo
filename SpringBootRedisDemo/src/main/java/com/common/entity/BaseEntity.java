package com.common.entity;

import java.util.Date;

import javax.persistence.*;

/**
 * @author Sophiee
 */
@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected String id;

    /** 创建时间 */
    @Column(name= "create_date")
    Date createDate = new Date();

    /** 修改时间 */
    @Column(name= "update_date")
    Date updateDate;

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
