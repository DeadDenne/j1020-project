package com.boardGame.organizer.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Entity
@Table(name = "ORGANIZER")
public class Organizer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty
    @Column(name = "NAME")
    private String name;

    @NotEmpty
    @Column(name = "vendor_code")
    private String  vendorCode;

    @NotEmpty
    @Column(name = "WEIGHT")
    private int weight;
}
