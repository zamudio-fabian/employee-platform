package com.fzamudio.employeeplatform.models;

import jakarta.persistence.*;

@Entity
@Table(name ="authorities")
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable=false)
    public String username;

    @Column(nullable=false)
    public String authority;

}
