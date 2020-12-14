package com.InteractionLogging.InteractionLogging.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter

@Entity
@Table(name="PROCESS_LOOKUPS")
public class ProcessLookups {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "PROCESS_KEY")
    private String processKey;

    @Column(name = "PROCESS_DEFINITION_ID")
    private String processDefinationId;

}
