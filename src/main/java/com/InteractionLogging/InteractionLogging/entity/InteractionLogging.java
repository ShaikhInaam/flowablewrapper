package com.InteractionLogging.InteractionLogging.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name="INTERACTION_LOGGING")
public class InteractionLogging {
	
	@Id
    @SequenceGenerator(name = "INTERACTION_LOGGING_SEQ", sequenceName = "INTERACTION_LOGGING_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "INTERACTION_LOGGING_SEQ")
    
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "INTERACTION_TYPE")
	private String interactionType;
	
	@Column(name = "FLOW")
	private String flow;
	
	@Column(name = "PROCESS_INSTANCE_ID")
	private String processInstanceId;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="INTERACTION_LOGGING_ID")
	private List<InteractionLoggingDetails> detailsList;
	
}
