package com.example.ddd.infrastructure.entities;

import com.alibaba.fastjson.annotation.JSONField;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * UserCredentialsEntity_HI Entity Object
 * Fri Mar 27 15:41:27 CST 2020  Auto Generate
 */
@Entity
@Table(name="user_credentials")
public class UserCredentialsEntity_HI implements Serializable{
    private String id;
    private String activateToken;
    private Byte enabled;
    private String password;
    private String resetToken;
    private String userId;
    private Long operatorUserId;

	public void setId(String id) {
		this.id = id;
	}

	@Id
	@GenericGenerator(name = "idGenerator", strategy = "com.example.ddd.infrastructure.utils.id.CustomUUIDGenerator")
	@GeneratedValue(generator = "idGenerator")
	@Column(name="id", nullable=false, length=31)
	public String getId() {
		return id;
	}

	public void setActivateToken(String activateToken) {
		this.activateToken = activateToken;
	}

	@Column(name="activate_token", nullable=true, length=255)	
	public String getActivateToken() {
		return activateToken;
	}

	public void setEnabled(Byte enabled) {
		this.enabled = enabled;
	}

	@Column(name="enabled", nullable=true, length=1)	
	public Byte getEnabled() {
		return enabled;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name="password", nullable=true, length=255)	
	public String getPassword() {
		return password;
	}

	public void setResetToken(String resetToken) {
		this.resetToken = resetToken;
	}

	@Column(name="reset_token", nullable=true, length=255)	
	public String getResetToken() {
		return resetToken;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name="user_id", nullable=true, length=31)	
	public String getUserId() {
		return userId;
	}

	public void setOperatorUserId(Long operatorUserId) {
		this.operatorUserId = operatorUserId;
	}

	@Transient	
	public Long getOperatorUserId() {
		return operatorUserId;
	}

	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date creationDate; //创建日期
	private Long createdBy; //创建人
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date lastUpdateDate; //更新日期
	private Long lastUpdatedBy; //更新人
	private Long lastUpdateLogin; //最后登录ID
	private Integer versionNum; //版本号

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Column(name="creation_date", nullable=true, length=0)
	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	@Column(name="created_by", nullable=true, length=20)
	public Long getCreatedBy() {
		return createdBy;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	@Column(name="last_update_date", nullable=true, length=0)
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdatedBy(Long lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	@Column(name="last_updated_by", nullable=true, length=20)
	public Long getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdateLogin(Long lastUpdateLogin) {
		this.lastUpdateLogin = lastUpdateLogin;
	}

	@Column(name="last_update_login", nullable=true, length=20)
	public Long getLastUpdateLogin() {
		return lastUpdateLogin;
	}


	public void setVersionNum(Integer versionNum) {
		this.versionNum = versionNum;
	}

	@Version
	@Column(name="version_num", nullable=false, length=11)
	public Integer getVersionNum() {
		return versionNum;
	}
}