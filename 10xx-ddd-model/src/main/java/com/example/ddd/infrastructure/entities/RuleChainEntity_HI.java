package com.example.ddd.infrastructure.entities;

import com.alibaba.fastjson.annotation.JSONField;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * RuleChainEntity_HI Entity Object
 * Fri Mar 27 15:41:26 CST 2020  Auto Generate
 */
@Entity
@Table(name="rule_chain")
public class RuleChainEntity_HI implements Serializable{
    private String id;
    private String additionalInfo;
    private String configuration;
    private String name;
    private String firstRuleNodeId;
    private Boolean root;
    private Boolean debugMode;
    private String searchText;
    private String tenantId;
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

	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	@Column(name="additional_info", nullable=true, length=0)	
	public String getAdditionalInfo() {
		return additionalInfo;
	}

	public void setConfiguration(String configuration) {
		this.configuration = configuration;
	}

	@Column(name="configuration", nullable=true, length=0)	
	public String getConfiguration() {
		return configuration;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name="name", nullable=true, length=255)	
	public String getName() {
		return name;
	}

	public void setFirstRuleNodeId(String firstRuleNodeId) {
		this.firstRuleNodeId = firstRuleNodeId;
	}

	@Column(name="first_rule_node_id", nullable=true, length=31)	
	public String getFirstRuleNodeId() {
		return firstRuleNodeId;
	}

	public void setRoot(Boolean root) {
		this.root = root;
	}

	@Column(name="root", nullable=true, length=1)	
	public Boolean getRoot() {
		return root;
	}

	public void setDebugMode(Boolean debugMode) {
		this.debugMode = debugMode;
	}

	@Column(name="debug_mode", nullable=true, length=1)	
	public Boolean getDebugMode() {
		return debugMode;
	}

	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}

	@Column(name="search_text", nullable=true, length=255)	
	public String getSearchText() {
		return searchText;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	@Column(name="tenant_id", nullable=true, length=31)	
	public String getTenantId() {
		return tenantId;
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
