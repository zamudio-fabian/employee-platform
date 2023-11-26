package com.fzamudio.employeeplatform.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @Column
    private String username;
    @Column(nullable=false)
    private String password;
    @Column(nullable=false)
    private boolean enabled;
    @Column
    private String email;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @ElementCollection
    @JoinTable(name = "authorities", joinColumns = {@JoinColumn(name = "username")})
    @Column(name = "authority")
    private Set<String> roles;

}