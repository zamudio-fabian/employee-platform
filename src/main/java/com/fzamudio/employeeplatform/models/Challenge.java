package com.fzamudio.employeeplatform.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "challenges")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Challenge {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String title;

    private String shortDescription;

    private String description;

    private Integer difficulty;

    private String category;

    private LocalDate createdAt;

    private LocalDate updatedAt;

}
