package com.KaufLokal.KaufLokalApplication.domain.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "MERCHANT")
@Data
public class Merchant {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator")
    @Column(updatable = false, nullable = false)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String company;

    private Integer offerAmount;

    private Integer merchantScore;

    @Column(nullable = false)
    private String street;

    @Column(nullable = false)
    private String houseNr;

    @Column(nullable = false)
    private String place;

    @Column(nullable = false)
    private String zipCode;

    @Column(nullable = false)
    private String country;

}
