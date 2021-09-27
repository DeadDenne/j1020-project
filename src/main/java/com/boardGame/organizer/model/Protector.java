package com.boardGame.organizer.model;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Data
@Entity
@Table(name = "PROTECTOR")
public class Protector {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty
    @Column(name = "NAME")
    private String name;

    @NotEmpty
    @Column(name = "Manufacturer_id")
    private int manufacturerId;

    @NotEmpty
    @Column(name = "HEIGHT")
    private float height;

    @NotEmpty
    @Column(name = "WIDTH")
    private float width;

    @NotEmpty
    @Column(name = "DENSITY")
    private int density;

    @NotEmpty
    @Column(name = "QUANTITY")
    private int quantity;


}
