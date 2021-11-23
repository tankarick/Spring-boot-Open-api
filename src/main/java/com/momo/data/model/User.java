package com.momo.data.model;

import org.hibernate.annotations.Nationalized;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "MOMO_USER", indexes = {@Index(name = "MOMO_USER_ID_INDEX", columnList = "MOMO_ID", unique = true)})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Size(min = 1, max = 36)
    @Column(name = "MOMO_ID", length = 36, nullable = false)
    private String momoId;

    @Lob
    @Nationalized
    @Column(name = "MOMO_DETAILS")
    private String momoDetails;
}
