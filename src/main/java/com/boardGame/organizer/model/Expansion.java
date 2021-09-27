package com.boardGame.organizer.model;

import javax.persistence.*;

@Entity
@Table(name = "EXPANSION")
public class Expansion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NAME")
    private String name;
}
