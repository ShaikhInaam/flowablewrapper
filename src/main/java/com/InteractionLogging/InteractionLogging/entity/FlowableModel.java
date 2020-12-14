package com.InteractionLogging.InteractionLogging.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name="ACT_DE_MODEL")
public class FlowableModel {
	
	@Id
	@Column(name="ID")
	protected String id;
	
	@Column(name="NAME")
    protected String name;
	
	@Column(name="MODEL_KEY")
    protected String key;
	
	@Column(name="DESCRIPTION")
    protected String description;
	
	@Column(name="MODEL_COMMENT")
    protected String comment;
	
	@Column(name="CREATED")
    protected Date created;
	
	@Column(name="CREATED_BY")
    private String createdBy;
	
	@Column(name="LAST_UPDATED")
    protected Date lastUpdated;
	
	@Column(name="LAST_UPDATED_BY")
    private String lastUpdatedBy;
	
	@Column(name="VERSION")
    protected int version;
	
	@Column(name="MODEL_EDITOR_JSON")
    protected String modelEditorJson;

	@Column(name="MODEL_TYPE")
    protected Integer modelType;
	
	@Column(name="TENANT_ID")
    protected String tenantId;
	
	@Column(name="THUMBNAIL")
	private byte[] thumbnail;
}
