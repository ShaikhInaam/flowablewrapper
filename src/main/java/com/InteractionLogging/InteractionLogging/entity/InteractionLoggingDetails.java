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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
@Table(name="INTERACTION_LOGGING_DETAILS")
public class InteractionLoggingDetails {

	@Id
    @SequenceGenerator(name = "INTERACTION_LOGGING_DETAILS_SEQ", sequenceName = "INTERACTION_LOGGING_DETAILS_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "INTERACTION_LOGGING_DETAILS_SEQ")
	
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "INTERACTION")
	private String interaction;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="INTERACTION_LOGGING_DETAILS_ID")
	private List<InteractionLoggingAttributes> attributeList;
	

}
