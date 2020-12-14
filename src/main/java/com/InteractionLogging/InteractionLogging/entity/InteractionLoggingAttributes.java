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
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name="INTERACTION_LOGGING_ATTRIBUTES")
public class InteractionLoggingAttributes {

	@Id
    @SequenceGenerator(name = "INTERACTION_LOGGING_ATTRIBUTES_SEQ", sequenceName = "INTERACTION_LOGGING_ATTRIBUTES_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "INTERACTION_LOGGING_ATTRIBUTES_SEQ")
	
	@Column(name = "ID")
	private Integer id;

	@Column(name = "DISPLAY_NAME")
	private String displayName;
	
	@Column(name = "DISPLAY_VALUE")
	private String displayValue;
	
}
